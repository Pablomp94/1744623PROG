Algoritmo Actividad_N5_�rea_del_tri�ngulo
	Escribir  "La base y la altura de tu tri�ngulo, ambos n�meros tendr�n que estar entre 1 y 15, pudiendose incluir estos"
	Escribir  "Introduce la base:"
	Leer base 
	Si base > 15 o base < 1
		Escribir "Los datos introducidos no se establecen entre los limites establecidos, por favor reinicia e int�ntelo de nuevo"
		
	SiNo
		Escribir "Introduce la altura del tri�ngulo"
		Leer altura
		Si altura > 15 o altura < 1
			Escribir "Los datos introducidos no se establecen entre los limites establecidos, por favor reinicia e int�ntelo de nuevo"
			
		FinSi
	FinSi
	
	Si altura >= 1 y altura <= 15 y base >= 1 y base <= 15 Entonces
		Escribir "El �rea de tu tri�ngulo es " (base * altura) / 2 
		
			
		FinSi
FinAlgoritmo
