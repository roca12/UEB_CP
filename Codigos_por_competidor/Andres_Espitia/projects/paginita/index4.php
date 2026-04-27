<?php include("conexion.php");
$idcomprador = $_GET['idcomprador'];?>
<html>
    <head>
        <title>Formulario</title>
    </head>
    <body>
        <form action="editar.php" method="POST">
            <div>
                <input type="text" name="idcomprador" value="<?php echo $idcomprador; ?>" placeholder="Ingrese el Id a editar">
            </div>
            <div>
                <input type="text" name="nombres" placeholder="Nuevos nombres" autofocus required>
            </div>
            <div>
                <input type="text" name="apellidos" placeholder="Nuevos apellidos" autofocus required>
            </div>
            <div>
                <input type="text" name="email" placeholder="Nuevo email" autofocus required>
            </div>
            
            <input type="submit" value="editar"></a>
        </form>
        
    </body>
</html>