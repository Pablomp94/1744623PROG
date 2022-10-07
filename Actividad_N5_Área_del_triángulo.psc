Algoritmo Actividad_N5_Área_del_triángulo
	Escribir  "La base y la altura de tu triángulo, ambos números tendrán que estar entre 1 y 15, pudiendose incluir estos"
	Escribir  "Introduce la base:"
	Leer base 
	Si base > 15 o base < 1
		Escribir "Los datos introducidos no se establecen entre los limites establecidos, por favor reinicia e inténtelo de nuevo"
		
	SiNo
		Escribir "Introduce la altura del triángulo"
		Leer altura
		Si altura > 15 o altura < 1
			Escribir "Los datos introducidos no se establecen entre los limites establecidos, por favor reinicia e inténtelo de nuevo"
			
		FinSi
	FinSi
	
	Si altura >= 1 y altura <= 15 y base >= 1 y base <= 15 Entonces
		Escribir "El área de tu triángulo es " (base * altura) / 2 
		
			
		FinSi
FinAlgoritmo
