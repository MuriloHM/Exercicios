CREATE DEFINER=`root`@`localhost` PROCEDURE `compra_efetivada`(in eftiva_prop varchar(15))
begin 

select pa.numero_ap, pa.rg_prop,pr.nome from proprietario_apartamento pa
inner join proprietario pr on pa.rg_prop = pr.rg;

end