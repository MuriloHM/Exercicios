use minimercado;

create or replace view cliente_vw as 
select nome, endereco from cliente;

select * from cliente_vw;

describe cliente_vw;

update cliente_vw
set nome = 'manoel barbosa'
where nome = 'manuel barbosa';

alter view cliente_vw as 
select nome, endereco from cliente order by nome;

drop view cliente_vw;

create user teste@localhost identified by '1234';

grant select, update on cliente_vw to teste@localhost;

flush privileges;
grant select, update on minimercado.cliente_vw to teste@localhost;







