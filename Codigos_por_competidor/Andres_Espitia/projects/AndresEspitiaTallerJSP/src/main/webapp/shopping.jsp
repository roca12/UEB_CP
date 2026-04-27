<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="./css/style.css" type="text/css">
<title>Shopping</title>
<script language="JavaScript">
    function valueForm(form){
        if(form.article.value == "0"){
            alert("Debe ingresar el articulo a comprar!");
            form.article.focus();
            return;
        }
        if(form.quantity.value == ""){
            alert("Debe ingresar la cantidad a comprar!");
            form.quantity.focus();
            return;
        }
        if(form.value.value == ""){
            alert("Debe ingresar el valor del articulo a comprar!");
            form.value.focus();
            return;
        }
        if(form.names.value == ""){
            alert("Debe ingresar sus nombres!");
            form.names.focus();
            return;
        }
        if(form.last_names.value == ""){
            alert("Debe ingresar sus apellidos!");
            form.last_names.focus();
            return;
        }
        if(form.type.value == ""){
            alert("Debe seleccionar su tipo de tarjeta!");
            form.type.focus();
            return;
        }
        if(form.number.value == ""){
            alert("Debe ingresar el numero de tarjeta!");
            form.number.focus();
            return;
        }
        if(form.confirm_number.value == ""){
            alert("Tiene un campo sin completar!");
            form.confirm_number.focus();
            return;
        }
        if(form.confirm_number.value != form.number.value){
            alert("La tarjeta no coincide!!");
            form.number.focus();
            form.confirm_number.focus();
            return;
        }
        form.submit();
    }
</script>
</head>
<body>
    <form class="box" action="ShopServlet" method="POST">
            <h3>Articulo:</h3> <select class="selecta" name="article">
                <option values="0">:. Seleccione .:</option>
                <option values="1">Zapatos</option>
                <option values="2">Camisa</option>
                <option values="3">Reloj</option>
                <option values="4">Libro</option>
                <option values="5">Computador</option>
            </select>
            <input type="text" name="quantity" value="" size="20" placeholder="Cantidad">
            <input type="text" name="value" value="" size="20" placeholder="Precio por unidad">
            <input type="text" name="names" value="" size="20" placeholder="Nombres">
            <input type="text" name="last_names" value="" size="40" placeholder="Apellidos">
            <h3>Tipo de Tarjeta:</h3> <input type="radio" name="type" value="Visa">Visa<input type="radio" name="type" value="MasterCard">MasterCard <br><input type="radio" name="type" value="AmericanExpress">AmericanExpress
            <input type="text" name="number" value="" size="40" placeholder="Número de Tarjeta">
            <input type="text" name="confirm_number" value="" size="40" placeholder="Confirmar número de tarjeta">
        <h1 align="center"><input type="button" value="CONFIRMAR COMPRA" onclick="valueForm(this.form)"></h1>
    </form>
</body>
</html>