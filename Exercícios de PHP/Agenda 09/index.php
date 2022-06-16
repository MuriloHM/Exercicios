<?php
    include_once 'Paciente.php';

    $p = new Paciente();

    $p -> setNome("André Silva");
    $p -> setRg('11.111.111-1');
    $p -> setCpf('222.222.222-22');
    $p -> setEndereco('Av. Paulista - Bela Vista, São Paulo - SP');
    $p -> setProfissao('Técnico em Desenvolvimento de Sistemas');

    echo '------PACIENTE------<br>';
    echo 'Nome: '.$p -> getNome().'<br>';
    echo 'RG: '.$p -> getRg().'<br>';
    echo 'CPF: '.$p -> getCpf().'<br>';
    echo 'Endereço: '.$p -> getEndereco().'<br>';
    echo 'Profissão: '.$p -> getProfissao().'<br>';

?>