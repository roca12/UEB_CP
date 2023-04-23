<?php
include("conexion.php");
    if(isset($_POST['nombres'])){
        $idcomprador = $_POST['idcomprador'];
        $nombres = $_POST['nombres'];
        $apellidos = $_POST['apellidos'];
        $email = $_POST['email'];
        
        $query = "UPDATE compradores
                  SET nombres = '$nombres', apellidos = '$apellidos', email = '$email'
                  WHERE idcomprador = $idcomprador";

	
        $result = mysqli_query($conn, $query);
    }echo $query;
    if(!$result){
        die("Consulta fallida");
    }
    
    header("Location: index3.php");
?>