<?php include("conexion.php");
session_start();

if(isset($_SESSION['id_login']) && isset($_SESSION['usuario'])){
?>

<html>
    <head>
        <title>Pagina DB</title>
    </head>
<body>
    <table>
        <tr>
            <th>Id Comprador</th>
            <th>Nombres</th>
            <th>Apellidos</th>
            <th>Email</th>
            <th>Editar</th>
            <th>Eliminar</th>
        </tr>
        <?php
            $query = "SELECT * FROM Compradores";
            $resultado = mysqli_query($conn, $query);
            while($row = mysqli_fetch_array($resultado)){?>
            <tr>
                <td><?php echo $row['idcomprador'];?></td>
                <td><?php echo $row['nombres'];?></td>
                <td><?php echo $row['apellidos'];?></td>
                <td><?php echo $row['email'];?></td>
                <td>
                        <a href="index4.php?idcomprador=<?php echo $row['idcomprador']?>"><input type="button" value="Editar"></a>
                </td>
                <td>
                        <a href="eliminar.php?idcomprador=<?php echo $row['idcomprador']?>"><input type="button" value="Eliminar"></a>
                </td>
            </tr>
                
            <?php }?>
        
        
    </table>
    <a href="index2.php"><input type="button" value="Añadir"></a>
    

	<br><br>

<a href="logout.php"><input type="button" value="Logout"></a>
</body>
</html>
<?php 
} else{
	header("Location: index.php");
	exit();
}
?>