Algoritmo Actividad03_Triangulo
	//AUTOR : Pablo Morales Puertas. NRE : 1744623//
	//FECHA : 20/10/22//
	//Descripcion = Calculador de parametros de un triangulo //
	//Preguntar por el parametro a calcular//
	//calcular a base de condicionales las distintas operaciones//
	//Mostrar resultados//
	
	
	Escribir ("CALCULADOR PARAMETROS TRIANGULO")
	Escribir ("*******************************")
	
	Escribir ("A. El valor del area de un triangulo, dada la base y la altura.")
	Escribir ("B. El valor de la base de un triangulo, dada la altura y el area.")
	Escribir ("C. El valor de la altura de un triangulo, dada la base y el area.")
	
	Escribir ("Introduce la opcion de calculo")
	
	Leer eleccion 
	
	Si eleccion = "A" o eleccion = "a" Entonces
		
		Escribir ("Introduce la base")
		Leer base 
		
		Escribir ("Introduce la altura")
		Leer altura 
		
		
		area = (base * altura) / 2 
		
		
		Escribir ("La area del triangulo es ") area
		
	FinSi
	
	
	Si eleccion = "B" o eleccion = "b" Entonces
		
		Escribir ("Introduce la altura")
		Leer altura 
		
		Escribir ("Introduce la area")
		Leer area
		
		
		base = (2 * area) / altura 
		
		
		Escribir ("La base del triangulo es ") base
		
	FinSi
	
	Si eleccion = "C" o eleccion = "c" Entonces
		
		Escribir ("Introduce la base")
		Leer base 
		
		Escribir ("Introduce el area")
		Leer area
		
		
		altura = (2 * area) / base
		
		
		Escribir ("La altura del triangulo es ") altura
		
	FinSi
	
	
FinAlgoritmo
