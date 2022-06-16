<?php
    if(!isset($_SESSION))
    {
        session_start();
    }
?>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
    <script src="https://kit.fontawesome.com/a5a66e2289.js" crossorigin="anonymous"></script>    
    <title>Principal-Administrador</title>
    <style>
    body,
    h1,
    h2,
    h3,
    h4,
    h5,
    h6 {
        font-family: "Copperplate";
    }
    </style>

</head>
<body class="w3-light-gray">
    <div class="w3-padding-large" id="main">
        <header class="w3-container w3-padding-32 w3-center " id="home">
            <br>
            <h1 class="w3-text-white w3-panel w3-blue-gray w3-round-large">
                ADMINISTRAÇÃO
            </h1>
            <h1 class="w3-text-white w3-panel w3-blue-gray w3-round-large">
                SISTEMA DE CURRICULOS
            </h1>
        </header>

        <form action="/Controller/Navegacao.php" method="post" class="w3-container w3-light-grey w3-text-blue w3-margin w3-center">
        <input type="hidden" name="nome_form" value="frmLoginADM"/>
        <button name="btnListarCadastrados" class="w3-button w3-margin w3-blue w3-cell w3-round-large">
            <br>
            <i class="fa fa-address-book-o w3-xxlarge"></i>
            <br>
            <p class="w3-xlarge">Usuários <br> Cadastrados </p>
        </button>
        <button name="btnListarAdministradores" class="w3-button w3-margin w3-blue-gray w3-cell w3-round-large">
            <br>
            <i class="fa fa-id-badge w3-xxlarge"></i>
            <br>
            <p class="w3-xlarge">Administradores <br> Cadastrados </p>
        </button>
        
    </form>
    
    </div>
    
    
</body>
</html>