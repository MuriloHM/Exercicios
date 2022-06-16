use consultorio;

select * from integracao_aparelhos;
select * from worklist_aparelhos;

create or replace view acesso_worklist_ap as 
select worklist_id, dt_exame, paciente, dt_nascimento, procedimento, aparelho, integrado from worklist_aparelhos;

update acesso_ap set integrado  = 'S' where integrado = 'N';

select * from worklist_aparelhos;

create user aparelho@localhost identified by '1234';

grant select, update on consultorio.worklist_aparelhos to
aparelho@localhost;

grant insert, update on consultorio.integracao_aparelhos to
aparelho@localhost;

flush privileges;

