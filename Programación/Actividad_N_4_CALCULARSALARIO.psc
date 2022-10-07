Algoritmo Actividad_N_4_CALCULARSALARIO
	
Escribir ("Introduzca la cantidad a evaluar, debe de ser entre 800 ? y 3000 ? : ")	
	
Leer Dinero

Si Dinero > 3000 o Dinero < 800 Entonces
	Escribir  ("Los datos introduidos no están entre los límites establecidos, por favor reinicie el programa e inténtelo de nuevo") 
SiNo
	Escribir ("A contnuación introduzca un aumento entre el 10% y el 20% ")
	
	Leer Aumento
	
	Si Aumento < 10 o Aumento > 20 Entonces
		Escribir ("Los datos introduidos no están entre los límites establecidos, por favor reinicie el programa e inténtelo de nuevo") 
		
	FinSi
	
	Si Aumento < 20 y Aumento > 10 Entonces
		
		Escribir (((Dinero / 100) * Aumento) + Dinero)
	FinSi
FinSi

	
	
	
	
FinAlgoritmo

