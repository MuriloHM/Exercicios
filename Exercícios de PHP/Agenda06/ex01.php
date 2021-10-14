<!DOCTYPE html>
<html lang="pt-br">
<head>
 <meta charset="UTF-8">
 <meta name="viewport" content="width=device-width, initial-scale=1.0">
 <meta http-equiv="X-UA-Compatible" content="ie=edge">
 <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
 <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css" integrity="sha512-iBBXm8fW90+nuLcSKlbmrPcLa0OT92xO1BIsZ+ywDWZCvqsWgccV3gFoRBv0z+8dLJgyAHIhR35VZc2oM/gI1w==" crossorigin="anonymous" referrerpolicy="no-referrer" />
 <title>Alunos Concluintes - MYSQLI</title>
</head>
<body class="w3-blue">

 <?php
 $servername = "localhost";
 $username = "root";
 $password = "1234";
 $dbname = "pwii";
 $conexao = new mysqli($servername, $username, $password, $dbname);
 if ($conexao->connect_error) {
 die("Connection failed: " . $conexao->connect_error);
 }
 echo '
 <div class="w3-padding w3-content w3-half w3-displaytopmiddle w3-margin">
 <h1 class="w3-center w3-teal w3-round-large w3-margin">Alunos Concluintes</h1>
 <table class="w3-table-all w3-centered">
 <thead>
 <tr class="w3-center w3-teal">
 <th>Código</th>
 <th>Nome</th>
<th>Nota 1 </th>
<th>Nota 2</th>
<th>Nota 3</th>
<th>Nota 4</th>
 </tr>
<thead>

 ';
 $sql = "SELECT * FROM alunoconcluinte" ;
 $resultado = $conexao->query($sql);
 if($resultado != null)
 foreach($resultado as $linha) {
 echo '<tr style="font">';
 echo '<td style="color:black;">'.$linha['idalunoconcluinte'].'</td>';
 echo '<td style="color:black;">'.$linha['nome'].'</td>';
 echo '<td style="color:black;">'.$linha['nota1'].'</td>';
 echo '<td style="color:black;">'.$linha['nota2'].'</td>';
 echo '<td style="color:black;">'.$linha['nota3'].'</td>';
 echo '<td style="color:black;">'.$linha['nota4'].'</td>'; 
 echo '</tr>';
 }
 echo '
 </table>
 </div>
 ';
 $conexao->close();
 ?>
 </div>
</body>
</html>
