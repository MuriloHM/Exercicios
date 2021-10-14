<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href ="https://www.w3schools.com/w3css/4/w3.css">
    <title>Voce no Comando Action</title>
</head>
<body>
    <div class="w3-container w3-teal">
        <h1>
        <?php
            $nome = $_POST['txtNome'];
            $salario = $_POST['txtSalar'];
            $qnt=$_POST['txtqnt'];
            $resultado;

            if ($salario <= 500){
                if($qnt <= 5){
                    echo "Parabéns ".$nome." , você recebeu um aumento de 15%";
                    $resultado = $salario + ($salario * 0.15);
                    echo "<br>Seu salário de R$ ".$salario .", passará a ser R$ ".$resultado; 
                }elseif($qnt > 5){
                    echo "Parabéns ".$nome." , você recebeu um aumento de 20%";
                    $resultado = $salario + ($salario * 0.2);
                    echo "<br>Seu salário de R$ ".$salario .", passará a ser R$ ".$resultado; 
                }                
            }

            if ($salario > 500 && $salario <= 1000){
                if($qnt <= 5){
                    echo "Parabéns ".$nome." , você recebeu um aumento de 10%";
                    $resultado = $salario + ($salario * 0.1);
                    echo "<br>Seu salário de R$ ".$salario .", passará a ser R$ ".$resultado; 
                }elseif($qnt > 5){
                    echo "Parabéns ".$nome." , você recebeu um aumento de 15%";
                    $resultado = $salario +($salario * 0.15);
                    echo "<br>Seu salário de R$ ".$salario .", passará a ser R$ ".$resultado; 
                }                
            }

            if ($salario > 1000 && $salario <= 2000){
                if($qnt <= 5){
                    echo "Parabéns ".$nome." , você recebeu um aumento de 10%";
                    $resultado =$salario + ($salario * 0.1);
                    echo "<br>Seu salário de R$ ".$salario .", passará a ser R$ ".$resultado; 
                }elseif($qnt > 5){
                    echo "Parabéns ".$nome." , você recebeu um aumento de 12%";
                    $resultado = $salario +($salario * 0.12);
                    echo "<br>Seu salário de R$ ".$salario .", passará a ser R$ ".$resultado; 
                }                
            }

            if ($salario > 2000){
                if($qnt <= 5){
                    echo "Parabéns ".$nome." , você recebeu um aumento de 8%";
                    $resultado = $salario +($salario * 0.08);
                    echo "<br>Seu salário de R$ ".$salario .", passará a ser R$ ".$resultado; 
                }elseif($qnt > 5){
                    echo "Parabéns ".$nome." , você recebeu um aumento de 10%";
                    $resultado = $salario +($salario * 0.1);
                    echo "<br>Seu salário de R$ ".$salario .", passará a ser R$ ".$resultado; 
                }                
            }
        ?>
        </h1>
    </div>
</body>
</html>