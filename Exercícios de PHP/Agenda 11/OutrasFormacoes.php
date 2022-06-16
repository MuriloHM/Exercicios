<?php
Class outrasFormacoes{
    private $id;
    private $idusuario;
    private $inicio;
    private $fim;
    private $descricao;

    //ID
    public function setID($id)
    {
        $this->id = $id;

        return $this;
    }

    public function getID()
    {
        return $this -> id;
    }

    //Usuario
    public function setIdusuario($idusuario)
    {
        $this->idusuario = $idusuario;

        return $this;
    }

    public function getIdusuario()
    {
        return $this -> idusuario;
    }

    //Inicio
    public function setInicio($inicio)
    {
        $this->inicio = $inicio;

        return $this;
    }

    public function getInicio()
    {
        return $this -> inicio;
    }

    //Fim
    public function setFim($fim)
    {
        $this->fim = $fim;

        return $this;
    }

    public function getFim()
    {
        return $this -> fim;
    }

    //Descrição
    public function setDescricao($descricao)
    {
        $this->descricao = $descricao;

        return $this;
    }

    public function getDescricao()
    {
        return $this -> descricao;
    }

    public function inserirBD(){
        require_once 'ConexaoBD.php';

        $con = new ConexaoBD();
        $conn = $con -> conectar();

        if($conn -> connect_error)
        {
            die("Connection failed: ".$conn->connect_error);
        }

        $sql = "INSERT INTO outrasformacoes(idusuario, inicio, fim, descricao) VALUES ('".$this->idusuario."','".$this->inicio."','".$this->fim."','".$this->descricao."')";

        if($conn -> query($sql)==true)
        {
            $this->id = mysqli_insert_id($conn);
            $conn -> close();
            return true;
        }else{
            $conn->close();
            return false;
        }
    }

    public function excluirBD()
    {
        require_once 'ConexaoBD';

        $con = new ConexaoBD();
        $conn = $con -> conectar();

        if($conn -> connect_error)
        {
            die("Connection failed: ".$conn->connect_error);
        }

        $sql = "DELETE FROM outrasformacoes WHERE idoutrasformacoes = '".$id."';";

        if($conn -> query($sql)==true)
        {
            $conn -> close();
            return true;
        }else{
            $conn->close();
            return false;
        }
    }

    public function listaFormacoes($idusuario)
    {
        require_once 'ConexaoBD';

        $con = new ConexaoBD();
        $conn = $con -> conectar();

        if($conn -> connect_error)
        {
            die("Connection failed: ".$conn->connect_error);
        }

        $sql = "SELECT * FROM outrasformacoes WHERE idusuario = '".$idusuario."'";
        $re = $conn->query($sql);
        $conn->close();
        return $re;
    
    }
}
?>