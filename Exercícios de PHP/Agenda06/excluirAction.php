<!DOCTYPE html>
<html lang="pt-br">
<head>
 <meta charset="UTF-8">
 <meta name="viewport" content="width=device-width, initial-scale=1.0">
 <meta http-equiv="X-UA-Compatible" content="ie=edge">
 <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
 <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css" integrity="sha512-iBBXm8fW90+nuLcSKlbmrPcLa0OT92xO1BIsZ+ywDWZCvqsWgccV3gFoRBv0z+8dLJgyAHIhR35VZc2oM/gI1w==" crossorigin="anonymous" referrerpolicy="no-referrer" />
 <title>Exclusão - MYSQLI</title>
</head>
<body>
<div class="w3-padding w3-content w3-text-grey w3-third w3-displaymiddle" id="eProfissional">
 <?php
 $servername = "localhost";
 $username = "root";
 $password = "1234";
 $dbname = "pwii";
 $conexao = new mysqli($servername, $username, $password, $dbname);
 if ($conexao->connect_error) {
 die("Connection failed: " . $conexao->connect_error);
 }
 $sql = "DELETE FROM amigo WHERE idamigo = '".$_POST['txtID'] ."';";
 if ($conexao->query($sql) === TRUE) {
 echo '
 <a href="listar.php">
 <h1 class="w3-button w3-
teal">Amigo Excluido com sucesso! </h1>
 </a>
 ';
 } else {
 echo '
 <a href="listar.php">
 <h1 class="w3-button w3-teal">ERRO! </h1>
 </a>
 ';
 }
 $conexao->close();
 ?>
</div>
</body>
</html>