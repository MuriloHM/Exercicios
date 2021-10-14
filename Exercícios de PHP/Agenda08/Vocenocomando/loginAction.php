<?php require_once ('cabecalho.php'); ?>
<div class="w3-padding w3-content w3-text-grey w3-third w3-display-middle" >
<?php
session_start();
$nome = $_POST['txtNome'];
$senha = $_POST['txtSenha'];
require_once 'conexaoBD.php';
$sql = "SELECT * FROM professor WHERE nome = '".$nome."';";
$resultado = $conexao->query($sql);
//echo $sql;
$linha = mysqli_fetch_array($resultado);
if($linha != null)
{
if($linha['senha'] == $senha)
{
echo '
<a href="listar.php">
<h1 class="w3-button w3-lime">'.$nome.', Seja Bem-Vindo(a)! </h1>
</a>
';
$_SESSION['logado'] = $nome;

}
else
{
echo '
<a href="index.php">
<h1 class="w3-button w3-lime">Login Inválido! </h1>
</a>
';
}
}
else
{
echo '
<a href="index.php">
<h1 class="w3-button w3-lime">Login Inválido! </h1>
</a>
';
}
$conexao->close();
?>
</div>
<?php require_once ('rodape.php'); ?>