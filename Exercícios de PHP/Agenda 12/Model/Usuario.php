<?php

Class Usuario
{
    private int $idusuario;
    private string $nome;
    private string $cpf;
    private string $dataNascimento;
    private string $email;
    private string $senha;


    public function getIdusuario()
    {
        return $this->idusuario;
    }

    public function setIdusuario($idusuario)
    {
        $this->idusuario = $idusuario;

        return $this;
    }

 
    public function getNome()
    {
        return $this->nome;
    }


    public function setNome($nome)
    {
        $this->nome = $nome;

        return $this;
    }

 
    public function getCpf()
    {
        return $this->cpf;
    }


    public function setCpf($cpf)
    {
        $this->cpf = $cpf;

        return $this;
    }

    public function getDataNascimento()
    {
        return $this->dataNascimento;
    }


    public function setDataNascimento($dataNascimento)
    {
        $this->dataNascimento = $dataNascimento;

        return $this;
    }


    public function getEmail()
    {
        return $this->email;
    }


    public function setEmail($email)
    {
        $this->email = $email;

        return $this;
    }

    public function getSenha()
    {
        return $this->senha;
    }

    public function setSenha($senha)
    {
        $this->senha = $senha;

        return $this;
    }

    public function inserirBD()
    {
        require_once 'ConexaoBD.php';

        $con = new ConexaoBD();
        $conn = $con->conectar();

        if ($conn->connect_error)
        {
            die("Connection failed: ". $conn->connect_error);
        }

        $sql = "INSERT INTO usuario(nome, cpf, email, senha) VALUES ('".$this->nome."','".$this->email."','".$this->senha."')";

        if($conn->query($sql) == TRUE)
        {
            $this->id = mysqli_insert_id($conn);
            $conn->close();
            return TRUE;
        }else{
            $conn->close();
            return FALSE;
        }
    }

    public function atualizarBD()
    {
        require_once 'ConexaoBD.php';

        $con = new ConexaoBD();
        $conn = $con->conectar();

        if($conn->connect_error)
        {
            die("Connect failed: ". $conn->connect_error);
        }

        $sql = "UPDATE usuario SET nome = '".$this->nome."',cpf='".$this->cpf."',dataNascimento='".$this->dataNascimento."',email='".$this->email."' WHERE idusuario = '". $this->id."'";

        if($conn->query($sql) == TRUE)
        {
            $conn->close();
            return TRUE;            
        }else{
            $conn->close();
            return FALSE;
        }        

    }
}
?>