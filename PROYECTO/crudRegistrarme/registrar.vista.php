<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <!-- <meta name="viewport" content="width=s, initial-scale=1.0"> -->
  <link rel="stylesheet" href="style.css">
  <title>Hawking</title>
</head>

<body>
<!DOCTYPE html>
<!-- Created By CodingLab - www.codinglabweb.com -->
<html lang="en" dir="ltr">
  <head>
    <meta charset="UTF-8">
    <!---<title> Responsive Registration Form | CodingLab </title>--->
    <link rel="stylesheet" href="style.css">
     <meta name="viewport" content="width=device-width, initial-scale=1.0">
   </head>
<body>
  
  <form method = "POST" action = "registrar.constrolador.php">
  <div class="container">
    <div class="title">Registration</div>
    <div class="content">
      <form action="../dasboard/index.php">
        <div class="user-details">
          <div class="input-box">
            <span class="details">Tipo de registro</span>
            <input type="text" id ="reg_tipo" placeholder="Tipo de registro" required>
          </div>
          <div class="input-box">
            <span class="details">Cantidad</span>
            <input type="text" id="reg_cant" placeholder="Cantidad" required>
          </div>
          <div class="input-box">
            <span class="details">descripcion</span>
            <input type="text" id="reg_desc" placeholder="Descripcion" required>
          </div>
          <div class="input-box">
            <span class="details">Fecha</span>
            <input type="date" id="reg_fecha" placeholder="Fecha" required>
          </div>
          <!-- <div class="input-box">
            <span class="details">fecha</span>
            <input type="text" placeholder="Enter your password" required>
          </div> -->
          <!-- <div class="input-box">
            <span class="details">Confirm Password</span>
            <input type="text" placeholder="Confirm your password" required>
          </div> -->
        </div>
        <div class="gender-details">
          <input type="radio" name="gender" id="dot-1">
          <input type="radio" name="gender" id="dot-2">
          <input type="radio" name="gender" id="dot-3">
          <span class="gender-title">Gender</span>
          <div class="category">
            <label for="dot-1">
            <span class="dot one"></span>
            <span class="gender">Male</span>
          </label>
          <label for="dot-2">
            <span class="dot two"></span>
            <span class="gender">Female</span>
          </label>
          <label for="dot-3">
            <span class="dot three"></span>
            <span class="gender">Prefer not to say</span>
            </label>
          </div>
        </div>
        <div class="button">
          <input type="submit" id ="guardar" name = "guardar" value="Register">
        </div>
      </form>
    </div>
  </div>
  
  </form>
  

</body>
</html>


<!-- <link rel="stylesheet" href="https://unicons.iconscout.com/release/v4.0.0/css/line.css">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css"
   rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
   <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js" 
   integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN" crossorigin="anonymous"></script> -->

</html>