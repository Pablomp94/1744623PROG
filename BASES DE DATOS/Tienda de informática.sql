DROP DATABASE IF EXISTS tienda;
CREATE DATABASE tienda;
USE tienda;
CREATE TABLE fabricante (
id INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
nombre VARCHAR(100) NOT NULL
);
CREATE TABLE producto (
id INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
nombre VARCHAR(100) NOT NULL,
precio DOUBLE NOT NULL,
id_fabricante INT UNSIGNED NOT NULL,
FOREIGN KEY (id_fabricante) REFERENCES fabricante(id)
);
INSERT INTO fabricante VALUES(1, 'Asus');
INSERT INTO fabricante VALUES(2, 'Lenovo');
INSERT INTO fabricante VALUES(3, 'Hewlett-Packard');
INSERT INTO fabricante VALUES(4, 'Samsung');
INSERT INTO fabricante VALUES(5, 'Seagate');
INSERT INTO fabricante VALUES(6, 'Crucial');
INSERT INTO fabricante VALUES(7, 'Gigabyte');
INSERT INTO fabricante VALUES(8, 'Huawei');
INSERT INTO fabricante VALUES(9, 'Xiaomi');
INSERT INTO producto VALUES(1, 'Disco duro SATA3 1TB', 86.99, 5);
INSERT INTO producto VALUES(2, 'Memoria RAM DDR4 8GB', 120, 6);
INSERT INTO producto VALUES(3, 'Disco SSD 1 TB', 150.99, 4);
INSERT INTO producto VALUES(4, 'GeForce GTX 1050Ti', 185, 7);
INSERT INTO producto VALUES(5, 'GeForce GTX 1080 Xtreme', 755, 6);
INSERT INTO producto VALUES(6, 'Monitor 24 LED Full HD', 202, 1);
INSERT INTO producto VALUES(7, 'Monitor 27 LED Full HD', 245.99, 1);
INSERT INTO producto VALUES(8, 'Portátil Yoga 520', 559, 2);
INSERT INTO producto VALUES(9, 'Portátil Ideapd 320', 444, 2);
INSERT INTO producto VALUES(10, 'Impresora HP Deskjet 3720', 59.99, 3);
INSERT INTO producto VALUES(11, 'Impresora HP Laserjet Pro M26nw', 180, 3);

use tienda;

/*1ºTRABAJO*/
/*1.Lista el nombre de todos los productos que hay en la tabla producto.*/

select nombre from producto;

/*2.Lista los nombres y los precios de todos los productos de la tabla producto.*/

select nombre , precio from producto;

/*3.Lista todas las columnas de la tabla producto.*/ 

select * from producto;

/*4.Lista el nombre de los productos, el precio en euros y el precio en dólares estadounidenses (USD).*/

select nombre , precio "EUROS", (precio * 1.09) "DÓLARES" from producto;

/*5.Lista el nombre de los productos, el precio en euros y el precio en dólares estadounidenses (USD). Utiliza los
siguientes alias para las columnas: nombre de producto, euros, dólares.*/ 

select nombre "nombre de producto" , precio "euros", (precio * 1.09) "dólares" from producto;

/*6.Lista los nombres y los precios de todos los productos de la tabla producto, convirtiendo los nombres a
mayúscula*/

select upper(nombre) "nombre de producto"  , precio "euros" , (precio * 1.09) "dólares" from producto;

/*7.Lista los nombres y los precios de todos los productos de la tabla producto, convirtiendo los nombres a
minúscula.*/

select lower(nombre) "nombre de producto"  , precio "euros" , (precio * 1.09) "dólares" from producto;

/*8.Lista el nombre de todos los fabricantes en una columna, y en otra columna obtenga en mayúsculas los dos
primeros caracteres del nombre del fabricante.*/

select nombre ,  UPPER(LEFT(nombre, 2)) from fabricante;

/*9.Lista los nombres y los precios de todos los productos de la tabla producto, redondeando el valor del precio.*/

select nombre "nombre de producto" , round(precio, 1) "euros" from producto;

/*10.Lista los nombres y los precios de todos los productos de la tabla producto, truncando el valor del precio para
mostrarlo sin ninguna cifra decimal.*/

select nombre "nombre de producto" , truncate(precio, 0) "euros" from producto;

/*11.Lista el identificador de los fabricantes que tienen productos en la tabla producto*/

select id_fabricante "id_fabricante" , nombre "nombre de producto" from producto;

/*12. Lista el identificador de los fabricantes que tienen productos en la tabla producto, eliminando los identificadores
que aparecen repetidos.*/

select distinct id_fabricante "id_fabricante" from producto;

/*13.. Lista los nombres de los fabricantes ordenados de forma ascendente.*/

select nombre from fabricante order by nombre asc;

/*14.Lista los nombres de los fabricantes ordenados de forma descendente*/

select nombre from fabricante order by nombre desc;

/*15. Lista los nombres de los productos ordenados en primer lugar por el nombre de forma ascendente y en segundo
lugar por el precio de forma descendente.*/

select nombre "nombre del producto" , precio "precio" from producto order by nombre asc;

select nombre "nombre del producto" , precio "precio" from producto order by precio desc;

/*16.Devuelve una lista con las 5 primeras filas de la tabla fabricante.*/

select * from fabricante limit 5;

/*17.Devuelve una lista con 2 filas a partir de la cuarta fila de la tabla fabricante. La cuarta fila también se debe incluir
en la respuesta.*/

select * from fabricante limit 3,2;

/*18. Lista el nombre y el precio del producto más barato. */

select nombre "nombre del producto" , precio "precio" from producto order by precio asc limit 1;

/*19. Lista el nombre y el precio del producto más caro*/

select nombre "nombre del producto" , precio "precio" from producto order by precio desc limit 1;

/*20.. Lista el nombre de todos los productos del fabricante cuyo identificador de fabricante es igual a 2.*/

select id_fabricante "id_fabricante" , nombre "nombre de producto" from producto where id_fabricante = 2;

/*21.Lista el nombre de los productos que tienen un precio menor o igual a 120€.*/

select nombre "nombre del producto" , precio "precio" from producto where precio >= 120;

/*22.Lista el nombre de los productos que tienen un precio mayor o igual a 400€.*/

select nombre "nombre del producto" , precio "precio" from producto where precio >= 400;

/*23.  Lista el nombre de los productos que no tienen un precio mayor o igual a 400€.*/

select nombre "nombre del producto" , precio "precio" from producto where precio < 400;

/*24. Lista todos los productos que tengan un precio entre 80€ y 300€. Sin utilizar el operador BETWEEN.*/

select nombre "nombre del producto" , precio "precio" from producto where precio >= 80 &&  precio <= 300;

/*25.Lista todos los productos que tengan un precio entre 60€ y 200€. Utilizando el operador BETWEEN.*/

select nombre "nombre del producto" , precio "precio" from producto where precio between 60 AND 200;

/*26.Lista todos los productos que tengan un precio mayor que 200€ y que el identificador de fabricante sea igual a 6.*/

select id_fabricante "id_fabricante" , nombre "nombre del producto" , precio "precio" from producto where precio > 200 && id_fabricante = 6;

/*27.Lista todos los productos donde el identificador de fabricante sea 1, 3 o 5. Sin utilizar el operador IN.*/

select nombre "nombre del producto" , id_fabricante "id_fabricante" from producto where id_fabricante = 1 or id_fabricante =  3 or id_fabricante = 5;

/*28.Lista todos los productos donde el identificador de fabricante sea 1, 3 o 5. Utilizando el operador IN.*/

select nombre "nombre del producto" , id_fabricante "id_fabricante" from producto where id_fabricante in (1,3,5);

/*29.. Lista el nombre y el precio de los productos en céntimos (Habrá que multiplicar por 100 el valor del precio). Cree
un alias para la columna que contiene el precio que se llame céntimos.*/

select nombre "nombre del producto" , precio * 100  "céntimos" from producto;

/*30.Lista los nombres de los fabricantes cuyo nombre empiece por la letra S.*/

select nombre "nombre fabricantes" from fabricante where nombre like 'S%';

/*31.Lista los nombres de los fabricantes cuyo nombre termine por la vocal e*/

select nombre "nombre fabricantes" from fabricante where nombre like '%e';

/*32. Lista los nombres de los fabricantes cuyo nombre contenga el carácter w*/

select nombre "nombre fabricantes" from fabricante where nombre like '%w%';

/*33.Lista los nombres de los fabricantes cuyo nombre sea de 4 caracteres*/

select nombre "nombre fabricantes" from fabricante where nombre like '____';

/*34. Devuelve una lista con el nombre de todos los productos que contienen la cadena Portátil en el nombre.*/

select nombre "nombre producto" from producto where nombre like '%Portátil%';

/*35.Devuelve una lista con el nombre de todos los productos que contienen la cadena Monitor en el nombre y tienen
un precio inferior a 215 €*/

select nombre "nombre producto" , precio "precio" from producto where nombre like '%Monitor%' && precio < 215;

/*36. Lista el nombre y el precio de todos los productos que tengan un precio mayor o igual a 180€. Ordene el
resultado en primer lugar por el precio (en orden descendente) y en segundo lugar por el nombre (en orden
ascendente).*/

/*Ordenado por precio*/
select nombre "nombre producto" , precio "precio" from producto where precio >= 180 order by precio desc;

/*Ordenado por el nombre*/
select nombre "nombre producto" , precio "precio" from producto where precio >= 180 order by nombre asc;



/*2ºTRABAJO*/

/*1. Devuelve una lista con el nombre del producto, precio y nombre de fabricante de todos los productos de la base
de datos.*/

Select p.nombre "nombre del producto" , p.precio "precio" , f.nombre "nombre fabricante"  from producto as p
join fabricante as f on f.id = p.id_fabricante;

/*2.Devuelve una lista con el nombre del producto, precio y nombre de fabricante de todos los productos de la base
de datos. Ordene el resultado por el nombre del fabricante, por orden alfabético.*/

Select p.nombre "nombre del producto" , p.precio "precio" , f.nombre "nombre fabricante"  
from producto as p
join fabricante as f on f.id = p.id_fabricante 
order by f.nombre asc;

/*3.Devuelve una lista con el identificador del producto, nombre del producto, identificador del fabricante y nombre
del fabricante, de todos los productos de la base de datos.*/

Select p.nombre "nombre del producto" , p.id "Id del producto" , f.nombre "nombre fabricante" , f.id "Id del fabricante"
from producto as p
join fabricante as f on f.id = p.id_fabricante;

/*4.Devuelve el nombre del producto, su precio y el nombre de su fabricante, del producto más barato.*/

Select p.nombre "nombre del producto" , min(p.precio) "precio" , f.nombre "nombre fabricante"  
from producto as p
join fabricante as f on f.id = p.id_fabricante;

/*5.Devuelve el nombre del producto, su precio y el nombre de su fabricante, del producto más caro.*/

Select p.nombre "nombre del producto" , max(p.precio) "precio" , f.nombre "nombre fabricante"  
from producto as p
join fabricante as f on f.id = p.id_fabricante;

/*6.Devuelve una lista de todos los productos del fabricante Lenovo.*/

Select p.nombre "nombre del producto" , p.precio "precio" , f.nombre "nombre fabricante"  
from producto as p
join fabricante as f on f.id = p.id_fabricante 
where f.nombre like "Lenovo";

/*7.Devuelve una lista de todos los productos del fabricante Crucial que tengan un precio mayor que 200€.*/

Select p.nombre "nombre del producto" , p.precio "precio" , f.nombre "nombre fabricante"  
from producto as p
join fabricante as f on f.id = p.id_fabricante 
where f.nombre like "Crucial" && p.precio > 200;

/*8.Devuelve un listado con todos los productos de los fabricantes Asus, Hewlett-Packard y Seagate. Sin utilizar el
operador IN*/

Select p.nombre "nombre del producto" , p.precio "precio" , f.nombre "nombre fabricante"  
from producto as p
join fabricante as f on f.id = p.id_fabricante 
where f.nombre = "Asus" or f.nombre = "Hewlett-Packard" or f.nombre = "Seagate";

/*9.Devuelve un listado con todos los productos de los fabricantes Asus, Hewlett-Packard y Seagate. Utilizando el
operador IN.*/

Select p.nombre "nombre del producto" , p.precio "precio" , f.nombre "nombre fabricante" 
from producto as p
join fabricante as f on f.id = p.id_fabricante 
where f.nombre in ("Asus", "Hewlett-Packard", "Seagate");

/*10.Devuelve un listado con el nombre y el precio de todos los productos de los fabricantes cuyo nombre termine por
la vocal e.*/

Select nombre "nombre del producto" , precio "precio del producto" from producto
where nombre like "%e";

/*11.Devuelve un listado con el nombre y el precio de todos los productos cuyo nombre de fabricante contenga el
carácter w en su nombre.*/

Select p.nombre "nombre del producto" , p.precio "precio" , f.nombre "nombre fabricante"  
from producto as p
join fabricante as f on f.id = p.id_fabricante 
where f.nombre like "%w%";

/*12. Devuelve un listado con el nombre de producto, precio y nombre de fabricante, de todos los productos que
tengan un precio mayor o igual a 180€. Ordene el resultado en primer lugar por el precio (en orden descendente)
y en segundo lugar por el nombre (en orden ascendente)*/

Select p.nombre "nombre del producto" , p.precio "precio" , f.nombre "nombre fabricante"  
from producto as p
join fabricante as f on f.id = p.id_fabricante 
where p.precio >= 180
order by p.precio desc;

Select p.nombre "nombre del producto" , p.precio "precio" , f.nombre "nombre fabricante"  
from producto as p
join fabricante as f on f.id = p.id_fabricante 
where p.precio >= 180
order by p.nombre asc;

/*13. Devuelve un listado con el identificador y el nombre de fabricante, solamente de aquellos fabricantes que tienen
productos asociados en la base de datos.*/

Select id "id del fabricante" , nombre "nombre del fabricante" from fabricante;


/*14. Lista los nombres, apellidos y nif de los empleados que trabajan en los departamentos 2, 4 o 5*/

CREATE TABLE departamentos (
id INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
nombre VARCHAR(100) NOT NULL
);

create table nombres (
nif INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
nombre VARCHAR(100) NOT NULL,
apellidos VARCHAR(100) NOT NULL,
FOREIGN KEY (id_departamentos) REFERENCES departamentos(id)

);

INSERT INTO departamentos VALUES(1, 'dep1');
INSERT INTO departamentos VALUES(2, 'dep2');
INSERT INTO departamentos VALUES(3, 'dep3');
INSERT INTO departamentos VALUES(4, 'dep4');
INSERT INTO deparmatentos VALUES(5, 'dep5');

INSERT INTO nombres VALUES(1, 'Pepe');
INSERT INTO nombres VALUES(2, 'María');
INSERT INTO nombres VALUES(3, 'Mario');
INSERT INTO nombres VALUES(4, 'David');
INSERT INTO nombres VALUES(5, 'Jose');

Select n.nombre "nombre del trabajador" , n.apellidos "apellidos" , n.nif "nif" , d.id "id departamento"  
from nombres as n
join departamentos as d on d.id = n.id_departamentos 
where d.id like ("2" , "4" , "5");


/*15.Devuelve un listado de todos los fabricantes que existen en la base de datos, junto con los productos que tiene
cada uno de ellos. El listado deberá mostrar también aquellos fabricantes que no tienen productos asociados.*/

Select p.nombre "nombre del producto"  , f.nombre "nombre fabricante"  
from producto as p
join fabricante as f on f.id = p.id_fabricante;

/*16. Devuelve un listado donde sólo aparezcan aquellos fabricantes que no tienen ningún producto asociado.*/

Select p.nombre "nombre del producto"  , f.nombre "nombre fabricante"  
from producto as p
left join fabricante as f on f.id = p.id_fabricante
where p.nombre is null;

/*17.¿Pueden existir productos que no estén relacionados con un fabricante?*/

/*No ya que cada producto está relacionado con un fabricante, por lo que todo producto debe de estar relacionado ya de por si con un fabricante, y por que usa como clave foránea la id del fabricante por lo que es necesario*/ 
