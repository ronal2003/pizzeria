<?php 

include '../bd/conexion.php';

// include '../bd/conexion.php';

if(isset($_POST['guardar'])){
guardar();

}


function guardar(){
    include '../bd/conexion.php';

    $tipo = $_POST['reg_tipo'];
    $cant = $_POST['reg_cant'];
    $descrip = $_POST['reg_desc'];
    $fecha = $_POST['reg_fecha'];
   
    
 
    $consulta = "INSERT INTO registros (reg_tipo, reg_cant, reg_descrip, reg_fecha) 
    VALUE ('$tipo','$cant','$descrip','$fecha')";
   echo $consulta;
    
    if (mysqli_query($conn, $consulta)) {
       echo "registro guardado exitosamente";
        // Header("Location: registrar.vista.php");
        
      } else {
        echo "Error al guardar" . $consulta . "<br>" . mysqli_error($conn);
      }
      mysqli_close($conn);
    }
    

?>