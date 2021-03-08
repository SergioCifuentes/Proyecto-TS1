<?php
    session_start();
?>

<header id="header">
  <div class="container">
    <nav id="nav-menu-container">
      <ul class="nav-menu">
        <li class="menu-active">  <a href="index.php" style="color: black;font-size: 23px;"><strong>TIEMPO</strong> MAYA</a></li>
        <li><a href="LineaDeTiempo.php"style="color: black">Linea del Tiempo</a></li>
        <li><a href="CalendarioHaab.php"style="color: black">Calendario Haab</a></li>
        <li><a href="CalendarioCholqij.php"style="color: black">Calendario Cholquij</a></li>
        <li><a href="#"style="color: black">Rueda Calendarica</a></li>
        <li><a href="nahuales.php"style="color: black">Nahuales</a></li>
        <?php 
        if (isset($_SESSION['nombre'])) {
            echo '<li><a href="cerrarSesion.php"style="color: black">Cerrar Sesion</a></li>';
        }else{
            echo '<li><a href="iniciarSesion.php"style="color: black">Iniciar Sesion</a></li>
            <li><a href="#"style="color: black">Registrarse</a></li>';
        }
        
        ?>
        
      </ul>
    </nav>
  </div>
</header>
