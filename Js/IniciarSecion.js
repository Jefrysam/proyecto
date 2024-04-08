document.getElementById("solicitarRegistro").addEventListener('click', function(event) {
    document.getElementById('registrarse').style.display = 'flex';
    event.preventDefault();   
});

document.getElementById("solicitarRegistro").addEventListener('click', function(event) {    
    document.getElementById('IniciarSesion').style.display = 'none';
    event.preventDefault();
});

