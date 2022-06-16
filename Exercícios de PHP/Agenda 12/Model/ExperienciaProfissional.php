<?php
Class ExperienciaProfissional{
    private $id;
    private $idusuario;
    private $inicio;
    private $fim;
    private $empresa;
    private $descricao;

     
    public function getId()
    {
        return $this->id;
    }

    public function setId($id)
    {
        $this->id = $id;

        return $this;
    }
 
    public function getIdusuario()
    {
        return $this->idusuario;
    }

    public function setIdusuario($idusuario)
    {
        $this->idusuario = $idusuario;

        return $this;
    }
 
    public function getInicio()
    {
        return $this->inicio;
    }

    public function setInicio($inicio)
    {
        $this->inicio = $inicio;

        return $this;
    }
 
    public function getFim()
    {
        return $this->fim;
    }
 
    public function setFim($fim)
    {
        $this->fim = $fim;

        return $this;
    }

    public function getEmpresa()
    {
        return $this->empresa;
    }

    public function setEmpresa($empresa)
    {
        $this->empresa = $empresa;

        return $this;
    }

    public function getDescricao()
    {
        return $this->descricao;
    }

    public function setDescricao($descricao)
    {
        $this->descricao = $descricao;

        return $this;
    }

    public function inserirBD()
    {
        require_once "ConexaoBD";

        $con = new ConexaoBD();
        $conn = $con -> conectar();

        if($conn -> connect_error)
        {
            die("Connection failed: ".$conn->connect_error);
        }

        $sql = "INSERT INTO ExperienciaProfissional(idusuario, inicio, fim, empresa, descricao) VALUES ('".$this->idusuario."','".$this->inicio."','".$this->fim."','".$this->empresa."','".$this->descricao."')";

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

    public function excluirBD($id)
        {
        require_once 'ConexaoBD';

        $con = new ConexaoBD();
        $conn = $con -> conectar();

        if($conn -> connect_error)
        {
            die("Connection failed: ".$conn->connect_error);
        }

        $sql = "DELETE FROM ExperienciaProfissional WHERE idexperienciaprofissional = '".$id."';";

        if($conn -> query($sql)==true)
        {
            $conn -> close();
            return true;
        }else{
            $conn->close();
            return false;
        }
    }

    public function listaExperiencias($idusuario)
    {
        require_once 'ConexaoBD';

        $con = new ConexaoBD();
        $conn = $con -> conectar();

        if($conn -> connect_error)
        {
            die("Connection failed: ".$conn->connect_error);
        }

        $sql = "SELECT * FROM ExperienciaProfissional WHERE idusuario = '".$idusuario."'";
        $re = $conn->query($sql);
        $conn->close();
        return $re;
}


}
?>