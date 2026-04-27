<?php
    $server = "localhost";
    $user = "root";
    $password = "";
    
    $db = "tiendita";
    
    $conn = mysqli_connect($server, $user, $password, $db);
    if(!$conn){
       echo "Conexion fallida!";
    }
?>