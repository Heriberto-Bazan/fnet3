let sessionID = null;
let customerID = null;
let nombre = null;
let apellido = null;

$(document).ready(function () {

    if (!sessionStorage.getItem('usuario')) {
        window.location.href = '/login.html';
        return;
    }

    if (!sessionStorage.getItem('customerID')) {
        window.location.href = '/cliente.html';
        return;
    }

    sessionID  = sessionStorage.getItem('sessionID');
    customerID = sessionStorage.getItem('customerID');
    nombre     = sessionStorage.getItem('nombre');
    apellido   = sessionStorage.getItem('apellido');

    $('#usuarioActivo').text(sessionStorage.getItem('usuario'));
    $('#nombre').text(nombre);
    $('#apellido').text(apellido);
    $('#puntos').text('—');
    $('#customerID').text(customerID);
    $('#loading').hide();
    $('#cliente-info').show();
    $('#btnVenta').prop('disabled', false);

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
});


$('#totalMoney').on('keypress', function (e) {
    const char = String.fromCharCode(e.which);
    const val = $(this).val();
    if (!/[0-9]/.test(char) && !(char === '.' && !val.includes('.'))) {
        e.preventDefault();
    }
});


$('#totalMoney').on('input', function () {
    let raw = $(this).val().replace(/,/g, '');
    const parts = raw.split('.');
    parts[0] = parts[0].replace(/\B(?=(\d{3})+(?!\d))/g, ',');
    $(this).val(parts.join('.'));

    const val = parseFloat(raw);
    if (!val || val <= 0) {
        $(this).css('border-color', '#e53935');
        $('#btnVenta').prop('disabled', true);
    } else {
        $(this).css('border-color', '#1F4E79');
        $('#btnVenta').prop('disabled', false);
    }
});


$('#btnVenta').click(function () {
    const totalMoney = parseFloat($('#totalMoney').val().replace(/,/g, ''));
    const notes      = $('#notes').val();

    if (!totalMoney || totalMoney <= 0) {
        mostrarResultado('Ingresa un monto valido.', false);
        return;
    }

    const confirmar = confirm(
        `Confirmar venta:\n\nCliente: ${nombre} ${apellido}\nMonto: $${totalMoney.toLocaleString('es-MX', { minimumFractionDigits: 2 })}\nNota: ${notes || 'Sin nota'}`
    );
    if (!confirmar) return;

    $('#btnVenta').prop('disabled', true).text('Procesando...');
    $('#resultado').hide();

    $.ajax({
        url: '/api/pos/venta',
        method: 'POST',
        contentType: 'application/json',
        xhrFields: { withCredentials: true }, 
        data: JSON.stringify({
            customerID: customerID,
            totalMoney: totalMoney,
            notes:      notes
        }),
        success: function (data) {
            mostrarResultado('Venta realizada exitosamente! — Aprobado', true);
            agregarHistorial(totalMoney, notes, data.answerCode);
            $('#btnNueva').show();
        },
        error: function (xhr) {
            if (xhr.status === 401) {
                sessionStorage.clear();
                window.location.href = '/login.html';
                return;
            }
            const msg = xhr.responseJSON ? xhr.responseJSON.error : 'Error de conexion';
            mostrarResultado('Error: ' + msg, false);
        },
        complete: function () {
            $('#btnVenta').prop('disabled', false).text('Realizar Venta');
        }
    });
});


$('#btnNueva').click(function () {
    sessionStorage.removeItem('customerID');
    sessionStorage.removeItem('nombre');
    sessionStorage.removeItem('apellido');
    sessionStorage.removeItem('tarjeta');
    window.location.href = '/cliente.html';
});

let historial = [];

function agregarHistorial(monto, nota, codigo) {
    const hora   = new Date().toLocaleTimeString();
    const estado = codigo === 0 ? 'Aprobado' : 'Rechazado';
    historial.unshift({ hora, monto, nota: nota || 'Sin nota', estado });
    let html = historial.map(v =>
        `<div class="historial-item">
            <span>${v.hora}</span>
            <span>$${v.monto.toLocaleString('es-MX', { minimumFractionDigits: 2 })}</span>
            <span>${v.nota}</span>
            <span>${v.estado}</span>
        </div>`
    ).join('');
    $('#historial-lista').html(html);
    $('#historial-section').show();
}

function mostrarResultado(mensaje, exito) {
    const $r = $('#resultado');
    $r.removeClass('exito error')
      .addClass(exito ? 'exito' : 'error')
      .text(mensaje)
      .show();
}