<?php
include("conexion.php");
    if(isset($_POST['guardar'])){
        $idcomprador = $_POST['idcomprador'];
        $nombres = $_POST['nombres'];
        $apellidos = $_POST['apellidos'];
        $email = $_POST['email'];
        
        $query = "INSERT INTO compradores VALUES ($idcomprador, '$nombres', '$apellidos', '$email')";
echo $query;
        $result = mysqli_query($conn, $query);
    }
    if(!$result){
        die("Consulta fallida");
    }
    
    header("Location: index2.php");
?>