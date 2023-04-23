<?php
session_start();
include "conexion.php";

if(isset($_POST['usuario']) && isset($_POST['contrasena'])){
    function validate($data){
        $data = trim($data);
        $data = stripslashes($data);
        $data = htmlspecialchars($data);
        return $data;
    }
    
    $usuario = validate($_POST['usuario']);
    $contrasena = validate($_POST['contrasena']);
    
    if(empty($usuario)){
        header("Location: index.php?error=El usuario es requerido");
        exit();
    }
    else if(empty($contrasena)){
        header("Location: index.php?error=La contraseña es requerida");
        exit();
    }
    else{
        $sql = "SELECT * FROM login WHERE usuario='$usuario' AND contrasena='$contrasena'";
        
        $result = mysqli_query($conn, $sql);
        
        if(mysqli_num_rows($result) === 1){
            $row = mysqli_fetch_assoc($result);
            if($row['usuario'] === $usuario && $row['contrasena']===$contrasena){
                $_SESSION['usuario'] = $row['usuario'];
                $_SESSION['contrasena'] = $row['contrasena'];
                $_SESSION['id_login'] = $row['id_login'];
                header("Location: index3.php");
                exit();
            }
            else{
                header("Location: index.php?error=Usuario y/o contraseña incorrectas");
            }
        }
    }
    
}
?>