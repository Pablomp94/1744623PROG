Algoritmo Actividad_Adivinar_N�mero
	Escribir " *********************************** "
	Escribir  "   Bienvenido al juego del azar "
	Escribir " *********************************** "
	Escribir  "                                    " 
	Escribir  "                                    " 
	Escribir " El juego consiste en intentar adivinar un n�mero generado aleatoriamente "
	numerogenerado = azar (10) + 1 
	
	Escribir " Deber�s elegir un n�mero comprendido desde el 1 hasta el 10 "
	
	Repetir
		fallo = 0 
		n�merofallo = + 1 
		Leer elegido 
		Si elegido <> numerogenerado Entonces
			Escribir "Has fallado"
			Escribir n�merofallo
			Si elegido > numerogenerado Entonces	
				Escribir " N�mero demasiado grande "
			Si elegido < numerogenerado Entonces
				Escribir " N�mero demasiado peque�o " 	
			FinSi
			FinSi
			
			FinSi
		Hasta Que elegido = numerogenerado o n�merofallo > 5 
		Si elegido = numerogenerado Entonces
			Escribir " Has ganado "
		Si n�merofallo > 5 Entonces
			Escribir " Has perdido "
		FinSi
	FinSi
	
		
		
FinAlgoritmo
