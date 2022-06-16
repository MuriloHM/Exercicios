<?php
Class ConexaoBD{
    private string $serverName = "localhost";
    private string $userName = "root";
    private string $password = "1234";
    private string $dbName = "projeto_final";

    public function conectar()
    {
        $conn = new mysqli($this->serverName, $this->userName, $this->password,$this->dbName);
        return $conn;
    }
    
}


?>