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


/*1.Calcula el número total de productos que hay en la tabla productos.*/

Select count(nombre) "Numero total de productos" from producto;

/*2.Calcula el número total de fabricantes que hay en la tabla fabricante.*/

Select count(nombre) "Numero total de fabricantes" from fabricante;

/*3.Calcula el número de valores distintos de identificador de fabricante aparecen en la tabla productos*/

Select distinct count(id_fabricante) "Numero total de identificadores distintos de fabricante en los productos" from producto; 

/*4.Calcula la media del precio de todos los productos.*/

select avg(precio) "Media del precio" from producto;

/*5.Calcula el precio más barato de todos los productos*/

Select min(precio) "Producto más barato" from producto;

/*6.Calcula el precio más caro de todos los productos.*/

Select max(precio) "Producto más caro" from producto;

/*7.Lista el nombre y el precio del producto más barato.*/

Select nombre "Nombre producto" , precio "Producto más barato" from producto
order by precio asc limit 1;


/*8.Lista el nombre y el precio del producto más caro.*/

Select nombre "Nombre producto" , precio "Producto más caro" from producto
order by precio desc limit 1;

/*9.Calcula la suma de los precios de todos los productos.*/

Select sum(precio) "Suma de todos precio de los productos"  from producto;

/*10.Calcula el número de productos que tiene el fabricante Asus.*/

Select count(nombre) "Numero de productos"  , id_fabricante "ID fabricante" from producto
where id_fabricante = 1;

/*11.Calcula la media del precio de todos los productos del fabricante Asus.*/

Select avg(precio) "Media del precio de Asus" , id_fabricante "ID fabricante" from producto
where id_fabricante = 1;

/*12. Calcula el precio más barato de todos los productos del fabricante Asus*/

Select min(precio) "Precio más barato" , id_fabricante "ID fabricante" from producto
where id_fabricante = 1;

/*13.Calcula el precio más caro de todos los productos del fabricante Asus.*/

Select max(precio) "Precio más caro" , id_fabricante "ID fabricante" from producto
where id_fabricante = 1;

/*14.Calcula la suma de todos los productos del fabricante Asus.*/

Select sum(precio) "Suma de los precios" , id_fabricante "ID fabricante" from producto
where id_fabricante = 1;

/*15.Muestra el precio máximo, precio mínimo, precio medio y el número total de productos que tiene el fabricante
Crucial.*/

Select id_fabricante "ID fabricante" , max(precio) "Precio Máximo" , min(precio) "Precio Mínimo" , avg(precio) "Precio Medio" , count(nombre) "Total de productos" from producto
where id_fabricante = 6;

/*16.Muestra el número total de productos que tiene cada uno de los fabricantes. El listado también debe incluir los
fabricantes que no tienen ningún producto. El resultado mostrará dos columnas, una con el nombre del
fabricante y otra con el número de productos que tiene. Ordene el resultado descendentemente por el número de
productos.*/

Select id_fabricante "ID fabricante" , count(nombre) "Nombre del producto"  from producto

order by count(nombre) desc 
group by id_fabricante;

/*17.Muestra el precio máximo, precio mínimo y precio medio de los productos de cada uno de los fabricantes. El
resultado mostrará el nombre del fabricante junto con los datos que se solicitan.*/

Select p.id_fabricante "ID fabricante" ,p.preciominimo "Precio minimo" , p.preciomaximo "Precio maximo" , p.preciomedio "Precio medio" , f.nombre from producto as p
join fabricante as f on id_fabricante = p.id_fabricante
where
p.preciominimo = min(p.precio) && p.preciomaximo = max(p.precio) && p.preciomedio = avg(p.precio)
group by id_fabricante
;

/*18.Muestra el precio máximo, precio mínimo, precio medio y el número total de productos de los fabricantes que
tienen un precio medio superior a 200€. No es necesario mostrar el nombre del fabricante, con el identificador
del fabricante es suficiente.*/


/*20.Calcula el número de productos que tienen un precio mayor o igual a 180€.*/

Select count(precio) from producto 
where precio >= 180
group by id_fabricante;

/*21.Calcula el número de productos que tiene cada fabricante con un precio mayor o igual a 180€.*/

Select  id_fabricante , precio , count(nombre) from producto
where precio >= 180
group by id_fabricante;


/*22.Calcula el número de productos que tiene cada fabricante con un precio mayor o igual a 180€.*/

Select id_fabricante , count(nombre) , precio from producto
where precio >= 180
group by id_fabricante;

/*23. Lista el precio medio de los productos de cada fabricante, mostrando solamente el nombre del fabricante.*/

Select p.precio , f.nombre from producto as p 
join fabricante as f on id_fabricante = f.id_fabricante
where p.precio = avg(p.precio);

/*24.Lista los nombres de los fabricantes cuyos productos tienen un precio medio mayor o igual a 150€.*/

Select distinct f.nombre , p.precio from producto as p
join fabricante as f 
where p.precio >= 150;

/*25. Devuelve un listado con los nombres de los fabricantes que tienen 2 o más productos.*/

Select f.nombre , count(p.nombre) from producto as p
join fabricante as f 
where (count(p.nombre)) >= 2;


/*26. 

