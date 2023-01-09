Algoritmo Actividad2_Seguro
	
	//AUTOR : Pablo Morales Puertas. NRE : 1744623//
	//FECHA : 20/10/22//
	//Descripcion = Calculador del precio del seguro segun genero y edad del cliente//
	//Preguntar por el genero y la edad//
	//calcular a base de condicionales las distintas cantidades a pagar//
	//Mostrar resultados//
	
	Escribir ("CALCULADOR PRECIO DEL SEGURO AUTOMOVILISTICO")
	Escribir ("********************************************")
	Escribir ("____________________________________________")
	
	Escribir ("Escribe tu genero")
	Escribir ("Introduce V para varon o M si eres mujer")
	
	Leer genero 
	
	Escribir ("A continuacion deberas de escribir tu edad")
	Escribir ("Deberas de introducir tu edad de forma numerica")
	
	Leer edad
	
	
	Si (edad > 90 o edad < 18)  Entonces
		Escribir ("No estas capacitado para conducir")
		
	FinSi
	
	Si (edad >= 18 y edad <= 30) y (genero = "V" o genero = "v") Entonces
		Escribir ("Tu seguro te costara 450 euros")
	FinSi
	
	Si (edad >= 31 y edad <= 50)  y (genero = "V" o genero = "v") Entonces
		Escribir ("Tu seguro te costara 400 euros")
	FinSi
	
	Si (edad > 50) y (genero = "V" o genero = "v") Entonces
		Escribir ("Tu seguro te costara 350 euros")
	FinSi
	
	
	Si (edad < 25) y (genero = "M" o genero = "m") Entonces
		Escribir ("Tu seguro te costara 400 euros")
	FinSi
	
	Si (edad >= 25) y (genero = "M" o genero = "m") Entonces
		Escribir ("Tu seguro te costara 350 euros")
	FinSi
	
	
	
FinAlgoritmo
