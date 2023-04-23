<?php include("conexion.php");?>
<html>
    <head>
        <title>Formulario</title>
    </head>
    <body>
        <form action="guardar.php" method="POST">
            <div>
                <input type="text" name="idcomprador" placeholder="idcomprador" autofocus required>
            </div>
            <div>
                <input type="text" name="nombres" placeholder="nombres" autofocus required>
            </div>
            <div>
                <input type="text" name="apellidos" placeholder="apellidos" autofocus required>
            </div>
            <div>
                <input type="text" name="email" placeholder="email" autofocus required>
            </div>
            <input type="submit" name="guardar" value="Guardar">
        </form>
        
    </body>
</html>