drop database if exists imobiliaria;
create database imobiliaria;

use imobiliaria;

/*Tabela com registros dos síndicos*/
create table sindico (
  matricula int(3) not null auto_increment,
  nome varchar(80) default null,
  endereco varchar(80) default null,
  telefone varchar(15) default null,
  primary key (matricula)
);

insert into sindico values
(1,'Antonio Carlos','Avenida Santos Dummont, número 789, Califórnia, São Paulo','(11) 3456-6787'),
(2,'Sidnei Delgado','Alameda XV de novembro, número 123, Jockey club, São Paulo','(11) 3452-4562');

/*Tabela com registro dos condomínios*/
create table condominio (
  codigo int(5) not null auto_increment,
  nome varchar(50) default null,
  endereco varchar(80) default null,
  matricula_sind int(3) default null,
  primary key (codigo),
  key fx_cond_sindico (matricula_sind),
  constraint fx_cond_sindico foreign key (matricula_sind) references sindico (matricula)
);

insert into condominio values 
/*Condomínio A*/
(1,'Condomínio São Paulo','Alameda Getúlio Vargas, número 897, Centro, São Paulo',1),

/*Condomínio B*/
(2,'Condmínio Brasil','Avenida General Gusmão, número 453, Penha, São Paulo',2);

/*Tabela para apartamentos e seus valores*/
create table apartamento (
  numero varchar(5) not null,
  tipo_apt varchar(20) default null,
  codigo_cond int(5) default null,
  valor double(10,2) default '0.00',
  primary key (numero),
  key fk_ap_cond (codigo_cond),
  constraint fk_ap_cond foreign key (codigo_cond) references condominio (codigo)
);

insert into apartamento values 
/*Apartamentos Condomínio A*/
('a101','padrão',1,100000.00),
('a201','padrão',1,115000.00),
('a301','padrão',1,125000.00),
('a401','padrão',1,135000.00),
('a501','cobertura',1,150000.00),

/*Apartamentos Condomínio B*/
('b101','padrão',2,200000.00),
('b201','padrão',2,215000.00),
('b301','padrão',2,225000.00),
('b401','padrão',2,235000.00),
('b501','cobertura',2,250000.00);

/*Tabela com registro de garagem para cada apartamento*/
create table garagem (
  numero int(3) not null auto_increment,
  tipo_grg varchar(20) default null,
  numero_ap varchar(5) default null,
  primary key (numero),
  key fk_gar_apartamento (numero_ap),
  constraint fk_gar_apartamento foreign key (numero_ap) references apartamento (numero)
);

insert into garagem values 
/*Condomínio A possui uma garagem para cada apt*/
(1,'padrão','a101'),
(2,'padrão','a201'),
(3,'padrão','a301'),
(4,'padrão','a401'),
(5,'coberta','a501'),

/*Condomínio B possui duas garagem para cada apt*/
(6,'padrão','b101'),
(7,'padrão','b101'),
(8,'padrão','b201'),
(9,'padrão','b201'),
(10,'padrão','b301'),
(11,'padrão','b301'),
(12,'padrão','b401'),
(13,'padrão','b401'),
(14,'coberta','b501'),
(15,'coberta','b501');

/*Informações sobre os proprietários*/
create table proprietario (
  rg varchar(15) not null,
  nome varchar(80) default null,
  telefone varchar(15) default null,
  email varchar(50) default null,
  primary key (rg)
);

insert into proprietario values 
('12345678-0','Carlos Eduardo','(11) 3256-7890','carloseduardoead@email.com.br'),
('32145678-4','Oswaldo Lima','(11) 2314-9876','oswaldolimaead@email.com.br'),
('32156788-0','Pedro Castro','(11) 3452-8743','pedroead@email.com.br'),
('46536267-3','Maria Luiza','(11) 2345-1627','marialuizaead@email.com.br'),
('54367281-2','Joana Darc','(11) 4563-2315','joanadarcead@email.com.br'),
('74853928-2','Benedito Goes','(11) 3427-4132','beneditogoesead@email.com.br'),
('76534126-4','Matheus Henrique','(11) 2234-1123','matheushenriqueead@email.com.br'),
('98635314-5','Augusto Silva','(11) 4122-2134','augustosilvaead@email.com.br'),
('99987271-1','Marcos Vinicius','(11) 2124-2427','marcosviniciusead@email.com.br');


/*Tabela com relação dos proprietários de cada apartamento*/
create table proprietario_apartamento (
  prop_ap_id int(3) not null auto_increment,
  numero_ap varchar(5) default null,
  rg_prop varchar(15) default null,
  primary key (prop_ap_id),
  key fk_pa_apartamento (numero_ap),
  key fk_pa_proprietario (rg_prop),
  constraint fk_pa_apartamento foreign key (numero_ap) references apartamento (numero),
  constraint fk_pa_proprietario foreign key (rg_prop) references proprietario (rg)
);

insert into proprietario_apartamento values 
/*Proprietários do apartamento do condomínio A*/
(1,'a101','12345678-0'),
(2,'a201','32145678-4'),
(3,'a301','32156788-0'),
(4,'a401','46536267-3'),
(5,'a501','54367281-2'),

/*Proprietários do apartamento do condomínio B*/
(6,'b101','74853928-2'),
(7,'b201','76534126-4'),
(8,'b301','98635314-5'),
(9,'b401','99987271-1'),
(10,'b501','99987271-1');

