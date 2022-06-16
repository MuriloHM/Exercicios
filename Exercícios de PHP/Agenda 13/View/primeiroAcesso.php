<!DOCTYPE html>
<html lang="pt-br">
<head>
 <meta charset="UTF-8">
 <meta name="viewport" content="width=device-width, initial-scale=1.0">
 <meta http-equiv="X-UA-Compatible" content="ie=edge">
 <link rel="stylesheet" href="style.css">
 <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
 <script src="https://kit.fontawesome.com/a5a66e2289.js" crossorigin="anonymous"></script>
 <title>Primeiro Acesso</title>
 <style>
        body,
        h1,
        h2,
        h3,
        h4,
        h5,
        h6{
            font-family: "Copperplate";
        }

    </style>
</head>
<body class="w3-light-gray">

    <form action="/Controller/Navegacao.php" method="post" class="w3-container w3-card-4 w3-light-grey w3-text-blue w3-margin w3-display-middle" style="width:30%">
        <h2 class="">Primeiro Acesso</h2>
        <div class="w3-row w3-section">
            <div class="w3-col" style="width:11%">
                <i class="w3-xxlarge fa fa-user"></i>
            </div>
            <div class="w3-rest">
                <input class="w3-input w3-border w3-round-large" name="txtNome" type="text" placeholder="Nome Completo">
            </div>
        </div>

        <div class="w3-row w3-section">
            <div class="w3-col" style="width:11%">
                <i class="w3-xxlarge fa fa-drivers-license"></i>
            </div>
            <div class="w3-rest">
                <input class="w3-input w3-border w3-round-large" name="txtCPF" type="text" placeholder="CPF: 33333333333">
            </div>
        </div>

        <div class="w3-row w3-section">
            <div class="w3-col" style="width:11%">
                <i class="w3-xxlarge fa fa-envelope-o"></i>
            </div>
            <div class="w3-rest">
                <input class="w3-input w3-border w3-round-large" name="txtEmail" type="text" placeholder="E-mail">
            </div>
        </div>

        <div class="w3-row w3-section">
            <div class="w3-col" style="width:11%">
                <i class="w3-xxlarge fa fa-lock"></i>
            </div>
            <div class="w3-rest">
                <input class="w3-input w3-border w3-round-large" name="txtSenha" type="password" placeholder="Senha">
            </div>
        </div>

        <div class="w3-row w3-section">
            <div class="w3-center">
                <button name="btnCadastrar" class="w3-button w3-block w3-margin w3-blue w3-cell w3-round-large" style="width:90%">Cadastrar</button>
            </div>            
        </div>
    </form>
</body>