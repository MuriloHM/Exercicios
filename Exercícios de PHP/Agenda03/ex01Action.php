<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href ="https://www.w3schools.com/w3css/4/w3.css">
    <title>Exercício</title>
</head>
<body>
    <div class="w3-container w3-teal">
        <h1>
        <?php
            $nome = $_POST['txtNome'];
            $valor = $_POST['txtValorCompra'];
            $pagamento =$_POST['cmbPag'];
            $resultado;
            $por ;
            $economia;

            if ($pagamento == "Boleto")
            {
                $por=8;
                $economia = $valor * ($por/100);
                $resultado = $valor - $economia ;
                echo "PROMOÇÃO DE MÊS DE ANIVERSÁRIO!<br>";
                echo $nome."!"."<br>Valor da Compra Sem Desconto: R$".$valor."<br>";
                echo "Forma de Pagamento escolhida: ".$pagamento;
                echo "<br>Desconto de: ".$por."%";
                echo "<br>Você economizou: R$".$economia;
                echo "<br>Valor à Pagar: R$".$resultado;
            }
            elseif ($pagamento =="Deposito")            
            {
                $por=10;
                $economia = $valor * ($por/100);
                $resultado = $valor - $economia ;
                echo "PROMOÇÃO DE MÊS DE ANIVERSÁRIO!<br>";
                echo $nome."!"."<br>Valor da Compra Sem Desconto: R$".$valor."<br>";
                echo "Forma de Pagamento escolhida: ".$pagamento;
                echo "<br>Desconto de: ".$por."%";
                echo "<br>Você economizou: R$".$economia;
                echo "<br>Valor à Pagar: R$".$resultado;
            }
            elseif("Cartao de Credito")
            {
                $por=0;
                $economia=0;
                echo "Olá, ".$nome."! <br>";
                echo "Forma de Pagamento escolhida: ".$pagamento;
                echo "<br>Valor da Compra: R$".$valor."<br>";

            }
            


        ?>
        </h1>
       

    </div>
    
</body>
</html>