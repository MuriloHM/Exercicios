create or replace view sindicos_vw as 
select s.nome, s.telefone, c.nome as 'nome_condominio' from sindico s
inner join condominio c on c.matricula_sind = s.matricula;

select * from sindicos_vw;

create or replace view totalap_vw as
select c.nome, count(ap.numero) qtd_apartamentos
from condominio c 
inner join apartamento ap
on c.codigo = ap.codigo_cond group by nome;


select * from totalap_vw;

create user condominios@localhost identified by '1234';

grant select on imobiliaria.sindicos_vw to
condominios@localhost;

grant select on imobiliaria.totalap_vw to
condominios@localhost;

flush privileges;

