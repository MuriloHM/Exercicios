insert into apartamento(numero, tipo_apt, codigo_cond, valor) values ('b901','cobertura','2','500');

insert into apartamento(numero, tipo_apt, codigo_cond, valor) values ('a911','cobertura','2','500');

select*from apartamento;

insert into garagem(tipo_grg,numero_ap) values ('coberta', 'b901');

insert into garagem(numero_ap) value ('a901');

select*from garagem;


delete from 
garagem
where numero_ap = 'b901';

select ap.numero as 'numero_apartamento', ap.valor-(ap.valor*0.3) as 'valor_atualizado', gr.tipo_grg from apartamento ap
inner join garagem gr on gr.numero_ap = ap.numero;




