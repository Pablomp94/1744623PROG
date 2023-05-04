/*1.Escriba una vista que se llame listado_pagos_clientes que muestre un listado donde aparezcan todos los
clientes y los pagos que ha realizado cada uno de ellos. La vista deberá tener las siguientes columnas: nombre y
apellidos del cliente concatenados, teléfono, ciudad, pais, fecha_pago, total del pago, id de la transacción.*/

create view listado_pagos_clientes as
select concat(nombre_cliente, ' ' , apellido_contacto) telefono, ciudad, pais, fecha_pago, total, id_transaccion from cliente as c
left join pago as p on c.codigo_cliente = p.codigo_cliente;


/*2.Escriba una vista que se llame listado_pedidos_clientes que muestre un listado donde aparezcan todos los
clientes y los pedidos que ha realizado cada uno de ellos. La vista deáber tener las siguientes columnas: nombre
y apellidos del cliente concatenados, teléfono, ciudad, país, código del pedido, fecha del pedido, fecha esperada,
fecha de entrega y la cantidad total del pedido, que será la suma del producto de todas las cantidades por el
precio de cada unidad, que aparecen en cada línea de pedido.*/

create view listado_pedido_clientes as 	
Select c.nombre_cliente, c.telefono, c.ciudad, c.pais, p.codigo_pedido, p.fecha_pedido, p.fecha_esperada, p.fecha_entrega, sum(dp.cantidad * dp.precio_unidad) as total
from cliente as c
left join pedido p on p.codigo_cliente = c.codigo_cliente
left join detalle_pedido as dp on dp.codigo_pedido = p.codigo_pedido
group by c.codigo_cliente, p.codigo_pedido;

 /*3.Utilice las vistas que ha creado en los pasos anteriores para devolver un listado de los clientes de la ciudad de
Madrid que han realizado pagos.*/

select * from listado_pagos_clientes
where ciudad = "Madrid" &&	id_transaccion is not null;

/*4.Utilice las vistas que ha creado en los pasos anteriores para devolver un listado de los clientes que todavía no
han recibido su pedido.*/

select * from listado_pedido_clientes 
where codigo_pedido is not null && fecha_entrega is null;

/*5.Utilice las vistas que ha creado en los pasos anteriores para calcular el número de pedidos que se ha realizado a
cada uno de los clientes.*/

Select nombre_cliente "Cliente" , count(codigo_pedido) "Numero total de pedidos" from listado_pedido_clientes group by nombre_cliente;

/*6.Utilice las vistas que ha creado en los pasos anteriores para calcular el valor del pedido máximo y mínimo que ha
realizado cada cliente.*/

Select nombre_cliente "Cliente" , max(total) "Total del pedido mas costoso" , min(total) "Total del pedido mas barato" from listado_pedido_clientes
where total is not null
group by nombre_cliente;

/*7.Modifique el nombre de las vista listado_pagos_clientes y asígnele el nombre listado_de_pagos. Una vez que
haya modificado el nombre de la vista ejecute una consulta utilizando el nuevo nombre de la vista para
comprobar que sigue funcionando correctamente*/

rename table listado_pagos_clientes to listado_de_pagos;

select * from listado_de_pagos;

/*8. Elimine las vistas que ha creado en los pasos anteriores.*/

drop view if exists listado_de_pagos , listado_pedido_clientes;


