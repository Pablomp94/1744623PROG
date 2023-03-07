DROP DATABASE IF EXISTS empleados;
CREATE DATABASE empleados;
USE empleados;
CREATE TABLE departamento (
id INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
nombre VARCHAR(100) NOT NULL,
presupuesto DOUBLE UNSIGNED NOT NULL,
gastos DOUBLE UNSIGNED NOT NULL
);
CREATE TABLE empleado (
id INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
nif VARCHAR(9) NOT NULL UNIQUE,
nombre VARCHAR(100) NOT NULL,
apellido1 VARCHAR(100) NOT NULL,
apellido2 VARCHAR(100),
id_departamento INT UNSIGNED,
FOREIGN KEY (id_departamento) REFERENCES departamento(id)
);
INSERT INTO departamento VALUES(1, 'Desarrollo', 120000, 6000);
INSERT INTO departamento VALUES(2, 'Sistemas', 150000, 21000);
INSERT INTO departamento VALUES(3, 'Recursos Humanos', 280000, 25000);
INSERT INTO departamento VALUES(4, 'Contabilidad', 110000, 3000);
INSERT INTO departamento VALUES(5, 'I+D', 375000, 380000);
INSERT INTO departamento VALUES(6, 'Proyectos', 0, 0);
INSERT INTO departamento VALUES(7, 'Publicidad', 0, 1000);
INSERT INTO empleado VALUES(1, '32481596F', 'Aarón', 'Rivero', 'Gómez', 1);
INSERT INTO empleado VALUES(2, 'Y5575632D', 'Adela', 'Salas', 'Díaz', 2);
INSERT INTO empleado VALUES(3, 'R6970642B', 'Adolfo', 'Rubio', 'Flores', 3);
INSERT INTO empleado VALUES(4, '77705545E', 'Adrián', 'Suárez', NULL, 4);
INSERT INTO empleado VALUES(5, '17087203C', 'Marcos', 'Loyola', 'Méndez', 5);
INSERT INTO empleado VALUES(6, '38382980M', 'María', 'Santana', 'Moreno', 1);
INSERT INTO empleado VALUES(7, '80576669X', 'Pilar', 'Ruiz', NULL, 2);
INSERT INTO empleado VALUES(8, '71651431Z', 'Pepe', 'Ruiz', 'Santana', 3);
INSERT INTO empleado VALUES(9, '56399183D', 'Juan', 'Gómez', 'López', 2);
INSERT INTO empleado VALUES(10, '46384486H', 'Diego','Flores', 'Salas', 5);
INSERT INTO empleado VALUES(11, '67389283A', 'Marta','Herrera', 'Gil', 1);
INSERT INTO empleado VALUES(12, '41234836R', 'Irene','Salas', 'Flores', NULL);
INSERT INTO empleado VALUES(13, '82635162B', 'Juan Antonio','Sáez', 'Guerrero', NULL);



/*1.Lista el primer apellido de todos los empleados.*/

Use empleados;

Select apellido1 "1ºApellido" from empleado;

/*2.Lista el primer apellido de los empleados eliminando los apellidos que estén repetidos.*/

Select distinct apellido1 "1ºApellido" from empleado;

/*3.Lista todas las columnas de la tabla empleado.*/

Select * from empleado;

/*4.Lista el nombre y los apellidos de todos los empleados.*/

Select nombre "Nombre empleado" , apellido1 "1ºApellido" , apellido2 "2ºApellido" from empleado;

/*5. Lista el identificador de los departamentos de los empleados que aparecen en la tabla empleado.*/

Select id_departamento from empleado;

/*6.Lista el identificador de los departamentos de los empleados que aparecen en la tabla empleado, eliminando los
identificadores que aparecen repetidos.*/

Select distinct id_departamento from empleado;

/*7.Lista el nombre y apellidos de los empleados en una única columna*/

Select concat_ws(" " , nombre , apellido1 , apellido2) "Nombre Completo" from empleado;

/*8.Lista el nombre y apellidos de los empleados en una única columna, convirtiendo todos los caracteres en
mayúscula.*/

Select Upper(concat_ws(" " , nombre , apellido1 , apellido2)) "Nombre Completo" from empleado;

/*9.Lista el nombre y apellidos de los empleados en una única columna, convirtiendo todos los caracteres en
minúscula.*/

Select Lower(concat_ws(" " , nombre , apellido1 , apellido2)) "Nombre Completo" from empleado;

/*10. Lista el identificador de los empleados junto al nif, pero el nif deberá aparecer en dos columnas, una mostrará
únicamente los dígitos del nif y la otra la letra.*/

Select id "Identificador" , 
 nif "NIF dígitos"
 from empleado;
 
 /*11.Lista el nombre de cada departamento y el valor del presupuesto actual del que dispone. Para calcular este dato
tendrá que restar al valor del presupuesto inicial (columna presupuesto) los gastos que se han generado
(columna gastos). Tenga en cuenta que en algunos casos pueden existir valores negativos. Utilice un alias
apropiado para la nueva columna que está calculando.*/

Select nombre "Nombre" ,  (presupuesto - gastos) "Presupuesto" from departamento
where presupuesto = max(0 , gastos);

/*12. Lista el nombre de los departamentos y el valor del presupuesto actual ordenado de forma ascendente*/

Select nombre "Nombre" , presupuesto "presupuesto" from departamento
order by presupuesto asc;

/*13. Lista el nombre de los departamentos y el valor del presupuesto actual ordenado de forma ascendente*/

Select nombre "Nombre Departamento" from departamento
order by nombre asc;

/*14. Lista el nombre de todos los departamentos ordenados de forma descendente*/

Select nombre "Nombre Departamento" from departamento
order by nombre desc;

/*15.Lista los apellidos y el nombre de todos los empleados, ordenados de forma alfabética tendiendo en cuenta en
primer lugar sus apellidos y luego su nombre.*/

Select nombre "Nombre empleado" , apellido1 "1ºApellido" , apellido2 "2ºApellido" from empleado
order by apellido1 asc;

Select nombre "Nombre empleado" , apellido1 "1ºApellido" , apellido2 "2ºApellido" from empleado
order by apellido2 asc;

Select nombre "Nombre empleado" , apellido1 "1ºApellido" , apellido2 "2ºApellido" from empleado
order by nombre asc;

/*16.Devuelve una lista con el nombre y el presupuesto, de los 3 departamentos que tienen mayor presupuesto.*/

Select nombre "Nombre departamento" , presupuesto "Presupuesto" from departamento 
order by presupuesto desc limit 3;

/*17.Devuelve una lista con el nombre y el presupuesto, de los 3 departamentos que tienen menor presupuesto.*/

Select nombre "Nombre departamento" , presupuesto "Presupuesto" from departamento 
order by presupuesto asc limit 3;

/*18.Devuelve una lista con el nombre y el gasto, de los 2 departamentos que tienen mayor gasto.*/

Select nombre "Nombre departamento" , gastos "Gastos" from departamento
order by gastos desc limit 2;

/*19.Devuelve una lista con el nombre y el gasto, de los 2 departamentos que tienen menor gasto*/

Select nombre "Nombre departamento" , gastos "Gastos" from departamento
order by gastos asc limit 2;

/*20.Devuelve una lista con 5 filas a partir de la tercera fila de la tabla empleado. La tercera fila se debe incluir en la
respuesta. La respuesta debe incluir todas las columnas de la tabla empleado.*/

Select * from empleado 
order by nombre limit 5;
