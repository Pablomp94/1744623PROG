Algoritmo Actividad_Adivinar_Número
	Escribir " *********************************** "
	Escribir  "   Bienvenido al juego del azar "
	Escribir " *********************************** "
	Escribir  "                                    " 
	Escribir  "                                    " 
	Escribir " El juego consiste en intentar adivinar un número generado aleatoriamente "
	numerogenerado = azar (10) + 1 
	
	Escribir " Deberás elegir un número comprendido desde el 1 hasta el 10 "
	
	Repetir
		fallo = 0 
		númerofallo = + 1 
		Leer elegido 
		Si elegido <> numerogenerado Entonces
			Escribir "Has fallado"
			Escribir númerofallo
			Si elegido > numerogenerado Entonces	
				Escribir " Número demasiado grande "
			Si elegido < numerogenerado Entonces
				Escribir " Número demasiado pequeño " 	
			FinSi
			FinSi
			
			FinSi
		Hasta Que elegido = numerogenerado o númerofallo > 5 
		Si elegido = numerogenerado Entonces
			Escribir " Has ganado "
		Si númerofallo > 5 Entonces
			Escribir " Has perdido "
		FinSi
	FinSi
	
		
		
FinAlgoritmo
