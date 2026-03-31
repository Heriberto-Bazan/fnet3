let sessionID = null;

$(document).ready(function () {

    if (!sessionStorage.getItem('usuario')) {
        window.location.href = '/login.html';
        return;
    }

    $('#usuarioActivo').text(sessionStorage.getItem('usuario'));
    sessionID = sessionStorage.getItem('sessionID');

    sessionStorage.removeItem('customerID');
    sessionStorage.removeItem('nombre');
    sessionStorage.removeItem('apellido');
    sessionStorage.removeItem('tarjeta');

    $('#tarjeta').keypress(function (e) {
        if (e.which === 13) $('#btnBuscar').click();
    });

    $('#btnBuscar').click(function () {
        const tarjeta = $('#tarjeta').val().trim();

        if (!tarjeta) {
            mostrarError('Ingresa el numero de tarjeta.');
            return;
        }

        $('#btnBuscar').prop('disabled', true).text('Buscando...');
        $('#error').hide();
        $('#cliente-section').hide();

        $.ajax({
            url: '/api/pos/cliente/' + tarjeta,
            method: 'GET',
            xhrFields: { withCredentials: true }, 
            success: function (data) {
                sessionStorage.setItem('customerID', data.customerID);
                sessionStorage.setItem('nombre', data.nombre);
                sessionStorage.setItem('apellido', data.apellido);
                sessionStorage.setItem('tarjeta', tarjeta);

                $('#nombre').text(data.nombre);
                $('#apellido').text(data.apellido);
                $('#puntos').text(data.puntos);
                $('#customerID').text(data.customerID);
                $('#cliente-section').show();
            },
            error: function (xhr) {
                if (xhr.status === 401) {
                    sessionStorage.clear();
                    window.location.href = '/login.html';
                    return;
                }
                const msg = xhr.responseJSON ? xhr.responseJSON.error : 'Error de conexion';
                mostrarError(msg);
            },
            complete: function () {
                $('#btnBuscar').prop('disabled', false).text('Buscar');
            }
        });
    });

    $('#btnIrVenta').click(function () {
        window.location.href = '/index.html';
    });

    $('#btnLogout').click(function () {
        $.ajax({
            url: '/api/auth/logout',
            method: 'POST',
            xhrFields: { withCredentials: true },
            complete: function () {
                sessionStorage.clear();
                window.location.href = '/login.html';
            }
        });
    });

    function mostrarError(msg) {
        $('#error').text(msg).show();
    }
});