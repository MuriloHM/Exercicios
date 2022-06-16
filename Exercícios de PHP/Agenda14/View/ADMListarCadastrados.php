<?php    
    if(!isset($_SESSION))
    {
    session_start();
    }
    include_once '../Model/Usuario.php';
    include_once '../Controller/UsuarioController.php';
?>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
    <script src="https://kit.fontawesome.com/a5a66e2289.js" crossorigin="anonymous"></script>
    <title>Lista de Cadastrados</title>
</head>
<body>
    <header class="w3-container w3-padding-32 w3-center " >
        <h1 class="w3-text-white w3-panel w3-blue-gray w3-round-large">
        Lista de Usuários Cadastrados no Sistema
        </h1>
    </header>  

    <div class="w3-padding-128 w3-content w3-text-grey">
    <div class="w3-container">
        <table class="w3-table-all w3-centered">
        <thead>
            <tr class="w3-center w3-blue-gray">
            <th>Código</th>
            <th>Nome</th>
            <th>Visualizar</th>
            </tr>
            <thead>
            <?php
                $usuario = new UsuarioController();
                $results = $usuario->gerarLista();
                if($results != null)
                while($row = $results->fetch_object()) {
                    echo '<tr>';
                    echo '<td style="width: 1%;">'.$row->idusuario.'</td>';
                    echo '<td style="width: 50%;">'.$row->nome.'</td>';
                    echo '<td style="width: 0.1%;">
                    <form action="/Controller/Navegacao.php"  method="post">
                        <input type="hidden" name="id" value="'.$row->idusuario.'">
                        <button name="btnVisualizar" class="w3-button w3-block  w3-blue-gray w3-cell w3-round-large">
                    <i class="fa fa-print"></i> </button></td>
                    </form>';                    
                    echo '</tr>';
                } 
            ?>
        </table>
    </div>
    </div>

    <div class="w3-padding-128 w3-content w3-text-grey">
        <form action="/Controller/Navegacao.php" method="post" class="w3-container w3-light-grey w3-text-blue w3-margin w3-center" style="width: 30%;">
        <div class="w3-row w3-section">
                <div>
                    <button name="btnVoltar" class="w3-button w3-block w3-margin w3-blue-gray w3-cell w3-round-large" style="width: 90%;">
                        Voltar
                    </button>
                </div>
            </div>
        </form>
    </div>


</body>
</html>