<?php
include("conexion.php");
    if(isset($_GET['idcomprador'])){
        $idcomprador = $_GET['idcomprador'];
        
        $query = "DELETE FROM compradores WHERE idcomprador=$idcomprador";
        $result = mysqli_query($conn, $query);
        
        if(!$result){
            die("consulta fallida");
        }
        echo $query;
        header("location: index3.php");
    }
?>