/*PABLO MORALES PUERTAS 

1. Dada la relación:
“articulos (codArticulo , nombre, precio, iva)”,
incremente en un 10% el precio y el iva de aquellos artículos cuyo nombre presente la
siguiente estructura: "sustantivo_sustantivo", (verbigracia: mesa_hierro, silla_madera, ...)*/

update articulo 
set precio = (precio + ((precio / 100) * 10)) , iva = (iva +((iva / 100) * 10))
where nombre like "%_%";
-----------------------------------------------------------------------------------------------------------------------------
/*2. ¿Qué genera la siguiente “consulta”?
Create table clientesProveedores as
(Select * from clientes where dni in (Select dni from proveedores));

Crea una tabla con todos los datos de aquellos clientes que tienen su dni en la tabla proveedores.*/

/*3. Supuesto:
articulos2 (cod, nombre, precio, beneficio),
incremente un 10% el precio y el beneficio de aquellos artículos cuyo nombre
comience o acabe en “s”.*/

update articulos2
set precio = (precio + ((precio / 100) * 10)) , beneficio = (beneficio +((beneficio / 100) * 10))
where nombre like "s%" or nombre like "%s";


/*4. Supuesta la relación
proveedores (nombre, dni, tlfno),
y que estos -los proveedores- se han pasado a la relación
“clientesProveedores (nombre, dni, tlfno)”,
borre todos los proveedores
–existentes en la relación proveedores- de la relación “clientesProveedores ” */
Delete from proveedores as p 
Where p.dni in (Select dni from clientesProveedores);

/*5. Anexe, a la anterior relación “clientesProveedores”, aquellos clientes (nombre, dni,
tlfno) que también son proveedores (nombre, dni, tlfno)*/

insert into clientesProveedores (nombre, dni, tlfno)
select c.nombre, c.dni, c.tlfno
from clientes c
inner join proveedores p on c.dni = p.dni;
