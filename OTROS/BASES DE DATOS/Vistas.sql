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


select concat(nombre_cliente, ' ' , apellido_contacto) telefono, ciudad, pais, codigo_pedido, fecha_pedido, fecha_esperada, fecha_entrega, total from cliente as c
left join pedido as p on c.codigo_cliente = p.codigo_cliente;

 