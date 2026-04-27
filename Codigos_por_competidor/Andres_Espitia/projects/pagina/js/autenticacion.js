var usuario, pass, rol;
var us1, ps1, us2, ps2;
us1 = "Andres";
us2 = "Arnoldo";
ps1 = "andres";
ps2 = "arnoldo";
u = localStorage.getItem('usuario');
p = localStorage.getItem('pass');
r = localStorage.getItem('rol');

function ingresar(){
    localStorage.setItem('usuario', document.formulario.usuario.value);
    u = localStorage.getItem('usuario');
    localStorage.setItem('pass', document.formulario.pass.value);
    p = localStorage.getItem('pass');
    localStorage.setItem('rol', document.formulario.rol.value);
    r = localStorage.getItem('rol');
    
    if((u==us1 && p==ps1 && r=="cliente") || (u==us2 && p==ps2 && r=="cliente")){
        window.open("menuprincipal1.html", "_self");
    }
    else if((u==us1 && p==ps1 && r=="admin") || (u==us2 && p==ps2 && r=="admin")){
        window.open("menuprincipal2.html", "_self");
    }
    else{
        alert("El usuario es incorrecto");
        document.formulario.usuario.value="";
        document.formulario.pass.value="";
    }
}