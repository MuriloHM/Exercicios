<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href ="https://www.w3schools.com/w3css/4/w3.css">
    <title>Resultado Final</title>
</head>
<body>
    <div class="w3-container w3-teal">
        <h1>
            <?php
                $n1 = $_POST['txtN1'];
                $n2 = $_POST['txtN2'];
                $n3 = $_POST['txtN3'];
                $media = ($n1+$n2+$n3)/3;
                $resultado;
                echo "".$_POST['txtNome']."! Sua média foi: ".$media." !!! <br>";
                if($media>=7)
                {
                    $resultado ="APROVADO";
                }
                else
                {
                    $resultado ="REPROVADO";
                }
                echo "Resultado: ".$resultado."<br>";


            ?>
        </h1>

    </div>
    
</body>
</html>