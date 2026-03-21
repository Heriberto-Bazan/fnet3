let sessionID = null;
let customerID = null;
let nombre = null;
let apellido = null;

$(document).ready(function () {
    $.ajax({
        url: '/api/pos/cliente',
        method: 'GET',
        success: function (data) {
            sessionID  = data.sessionID;
            customerID = data.customerID;
            nombre     = data.nombre;
            apellido   = data.apellido;

            $('#nombre').text(data.nombre);
            $('#apellido').text(data.apellido);
            $('#puntos').text(data.puntos);
            $('#customerID').text(data.customerID);

            $('#loading').hide();
            $('#cliente-info').show();
            $('#btnVenta').prop('disabled', false);
        },
        error: function (xhr) {
            const msg = xhr.responseJSON ? xhr.responseJSON.error : 'Error de conexion';
            $('#loading').text('❌ ' + msg);
        }
    });
});


$('#totalMoney').on('keypress', function (e) {
    const char = String.fromCharCode(e.which);
    const val = $(this).val().replace(/,/g, '');
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
    const raw = $('#totalMoney').val().replace(/,/g, '');
    const totalMoney = parseFloat(raw);
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
        data: JSON.stringify({
            sessionID:  sessionID,
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
            const msg = xhr.responseJSON ? xhr.responseJSON.error : 'Error de conexion';
            mostrarResultado('Error: ' + msg, false);
        },
        complete: function () {
            $('#btnVenta').prop('disabled', false).text('Realizar Venta');
        }
    });
});

$('#btnNueva').click(function () {
    $('#totalMoney').val('').css('border-color', '#e0e0e0');
    $('#notes').val('');
    $('#resultado').hide();
    $('#btnNueva').hide();
    $('#btnVenta').prop('disabled', false);
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