<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href ="https://www.w3schools.com/w3css/4/w3.css">
    <title>Voce no Comando</title>
</head>
<body>
    <div class="w3-container w3-red">
        <h2>Formulário</h2>
    </div>
    <form class="w3-container" method ="post" action="voceNoComandoAction.php">
        <label class="w3-text-red"><b>Nome</b></label>
        <input class="w3-input w3-border w3-light-grey" name="txtNome" type="text">
        <label class="w3-text-red"><b>Salário</b></label>
        <input class="w3-input w3-border w3-light-grey" name="txtSalar" type="text">
        <label class="w3-text-red"><b>Quantidade de Dependentes</b></label>
        <input class="w3-input w3-border w3-light-grey" name="txtqnt" type="number">
        <br>
        <button class="w3-btn w3-red" type="submit">Enviar</button>
    </form>
</body>
</html>