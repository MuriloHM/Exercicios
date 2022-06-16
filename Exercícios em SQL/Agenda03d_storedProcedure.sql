CREATE DEFINER=`root`@`localhost` PROCEDURE `valor_atualizado`(valor_atl int)
begin 
select  a.numero, a.codigo_cond, a.valor from apartamento a;

UPDATE apartamento
SET valor = valor*(1+(valor_atl/100))
WHERE codigo_cond = valor_atl;

end