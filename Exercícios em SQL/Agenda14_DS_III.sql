create database projeto_final;
use projeto_final;

create table if not exists usuario(
	idusuario int(10) not null auto_increment,
    nome varchar(150) null default null,
    cpf varchar(11) not null,
    dataNascimento date null default null,
    email varchar (150) null default null,
    senha varchar(45) null default null,
    primary key(idusuario),
    unique index cpf_UNIQUE (cpf ASC))

ENGINE = InnoDB
DEFAULT character set = latin1;


create table if not exists formacaoAcademica(
	idformacaoAcademica int(11) not null auto_increment,
    idusuario int(11) not null,
    inicio date not null,
    fim date null default null,
    descricao varchar(150) null default null,
    primary key (idformacaoAcademica),
    index idusuario_idx (idusuario ASC),
    constraint IDUSUARIO foreign key (idusuario) references usuario (idusuario)
    on delete no action
    on update no action)
    
engine = InnoDB
Default character set = latin1;
SET SQL_MODE = @OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS = @OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS = @OLD_UNIQUE_CHECKS;

create table if not exists ExperienciaProfissional(
	idexperienciaprofissional int not null auto_increment,
    idusuario int(11) not null,
    inicio date not null,
    fim date null default null,
    empresa varchar(45) null default null,
    descricao varchar(150) null default null,
    primary key (idexperienciaprofissional),
    index idUser_idx (idusuario ASC),
    constraint idUser foreign key (idusuario) references usuario (idusuario)
    on delete no action
    on update no action);

CREATE TABLE IF NOT EXISTS `projeto_final`.`outrasformacoes` (
  `idoutrasformacoes` INT(11) NOT NULL AUTO_INCREMENT,
  `idusuario` INT(11) NOT NULL,
  `inicio` DATE NULL DEFAULT NULL,
  `fim` DATE NULL DEFAULT NULL,
  `descricao` VARCHAR(150) NULL DEFAULT NULL,
  PRIMARY KEY (`idoutrasformacoes`),
  INDEX `idusuario_idx` (`idusuario` ASC),
  CONSTRAINT `fk_idUsuario`
    FOREIGN KEY (`idusuario`)
    REFERENCES `projeto_final`.`usuario` (`idusuario`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;

CREATE TABLE IF NOT EXISTS `projeto_final`.`administrador` (
 `idadministrador` INT(11) NOT NULL AUTO_INCREMENT,
 `nome` VARCHAR(45) NULL DEFAULT NULL,
 `cpf` VARCHAR(11) NOT NULL,
 `senha` VARCHAR(45) NOT NULL,
 PRIMARY KEY (`idadministrador`))
ENGINE = InnoDB
AUTO_INCREMENT = 2
DEFAULT CHARACTER SET = latin1;

