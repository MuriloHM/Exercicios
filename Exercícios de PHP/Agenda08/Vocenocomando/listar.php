<?php require_once ('verificarAcesso.php'); ?>
<?php require_once ('cabecalho.php'); ?>

<div class="w3-padding w3-content w3-text-grey w3-third w3-margin w3-display-topright">
        <form action="logoutAction.php" class="w3-container" method='post'>
            <button name="btnLogout" class="w3-button w3-red w3-cell w3-round-large w3-right w3-margin-right"> 
                <i class="w3-xxlarge fa fa-times-rectangle"> </i> Logout
            </button>
        </form>
</div>
        <?php            
            require_once 'conexaoBD.php';
                echo '
                <div class="w3-paddingw3-content w3-half w3-display-topmiddle w3-margin">
                <h1 class="w3-center w3-lime w3-round-large w3-margin">Professores e Disciplinas</h1>
                <table class="w3-table-all w3-centered">
                <thead>   
                    <tr class="w3-center w3-lime">
                        <th>Código</th>
                        <th>Nome</th>
                        <th>Disciplina</th>
                    </tr>
                <thead>
                ';
                $sql = "SELECT * FROM professor" ;
                $resultado = $conexao->query($sql);
                if($resultado != null)
                foreach($resultado as $linha) {
                    echo '<tr>';
                    echo '<td>'.$linha['idprofessor'].'</td>';
                    echo '<td>'.$linha['nome'].'</td>';
                    echo '<td>'.$linha['disciplina'].'</td>';                                        
                    echo '</tr>';
                }
                echo '
                    </table>
                </div>';
            $conexao->close();
        ?>
    </div>
    <?php require_once ('rodape.php'); ?>