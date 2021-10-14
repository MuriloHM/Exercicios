<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css" integrity="sha512-iBBXm8fW90+nuLcSKlbmrPcLa0OT92xO1BIsZ+ywDWZCvqsWgccV3gFoRBv0z+8dLJgyAHIhR35VZc2oM/gI1w==" crossorigin="anonymous" referrerpolicy="no-referrer" />

    <title>Cadastro Concluído</title>

</head>
<body>
    <div class="w3-card-4">
        <div class="w3-container w3-green">
            <h2>Cadastro Concluído</h2>
        </div>       
        <?php

            $nome = $_POST['nome'];
            $sobrenome = $_POST['sobrenome'];
            $email = $_POST['email'];
            $formacao = $_POST['formacao'];
            $emp=$_POST['emp'];

            echo "Nome:".$nome."<br>";
            echo "Sobrenome:".$sobrenome."<br>";
            echo "Email:".$email."<br>";
            echo "Formação:".$formacao."<br>";
            echo "Descrição do último emprego:".$emp."<br>";

        ?>

    </div>
</body>
</html>
