$(document).ready(function () {

    const token = sessionStorage.getItem('token');
    if (token) {
        window.location.href = '/cliente.html';
    }

    $(document).keypress(function (e) {
        if (e.which === 13) $('#btnLogin').click();
    });

    $('#btnLogin').click(function () {
        const username = $('#username').val().trim();
        const password = $('#password').val().trim();

        if (!username || !password) {
            mostrarError('Ingresa usuario y password.');
            return;
        }

        $('#btnLogin').prop('disabled', true).text('Iniciando sesion...');
        $('#error').hide();

        $.ajax({
            url: '/api/auth/login',
            method: 'POST',
            contentType: 'application/json',
            data: JSON.stringify({ username, password }),
            success: function (data) {
                sessionStorage.setItem('token', data.token);
                sessionStorage.setItem('sessionID', data.sessionID);
                sessionStorage.setItem('usuario', data.username);
                window.location.href = '/cliente.html';
            },
            error: function (xhr) {
                const msg = xhr.responseJSON ? xhr.responseJSON.error : 'Error de conexion';
                mostrarError(msg);
            },
            complete: function () {
                $('#btnLogin').prop('disabled', false).text('Iniciar Sesion');
            }
        });
    });

    function mostrarError(msg) {
        $('#error').text(msg).show();
    }
});