<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css" integrity="sha512-iBBXm8fW90+nuLcSKlbmrPcLa0OT92xO1BIsZ+ywDWZCvqsWgccV3gFoRBv0z+8dLJgyAHIhR35VZc2oM/gI1w==" crossorigin="anonymous" referrerpolicy="no-referrer" />
    
    <title>Lojas Brincos e Companhia - CADASTRO</title>
</head>
<body>
    <form id="form1" name="form1" class ="w3-card" method="post" action ="ex01b.php">
        <div class="w3-container w3-blue w3-teal">
            <h1>Cadastro</h1>          
        </div>

        <br>
        <!--Nome-->
        <label class="w3-text-blue"><b>Nome: <b></label>
        <input class="w3-input" id="nome" name="nome" type="text" placeholder="Digite seu nome">

        <br>

        <!--Sobrenome-->
        <label class="w3-text-blue"><b>Sobrenome: <b></label>
        <input class="w3-input" id="sobrenome" name="sobrenome" type="text" placeholder="Digite seu sobrenome">

        <br>

        <!--Email-->
        <label class="w3-text-blue"><b>Email: <b></label>
        <input class="w3-input" id="email" name="email" type="email" placeholder="Digite seu email">
        
        <br>

        <!--Formação-->
        <label class="w3-text-blue"><b>Formação: <b></label>
        <input class="w3-input" id="formacao" name="formacao" type="text" placeholder="Digite sua formação">
        
        <br>

        <!--Ultimo emprego-->
        <label class="w3-text-blue"><b>Descrição do último emprego:<b></label>
        <input class="w3-input" id="emp" name="emp" type="text" placeholder="Digite ultimo emprego">
        
        <br>
        <button class="w3-btn w3-blue" name = "enviar" type="submit" id="enviar">Enviar</button>
    </form>

</body>
</html>
