select * from agendamento;
select * from integracao_aparelhos;
select * from worklist_aparelhos;

update agendamento a
 set a.chegou = 'S'
where a.agendamento_id = 4;

insert into integracao_aparelhos (worklist_id)
values (1);

update worklist_aparelhos w
 set w.integrado = 'S'
where w.agendamento_id = 4;

update integracao_aparelhos i
 set i.dt_realizacao = '2019-1-15'
where i.integracao_id = 1;

