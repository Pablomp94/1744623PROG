Algoritmo Actividad7_conversormoneda
	Escribir  "____________________________________"
	Escribir  " Bienvenido al conversor de monedas "
	Escribir  "************************************"
	
	//Preguntar por el tipo de conversión que quiere realizar// 
	
	Escribir " Elige entre que tipo de conversión quieres realizar "
	
	Escribir " Para ello selecciona 1 si quieres de euros a libras "
	Escribir " O para libras a euros seleccione 2 "
	
	Leer eleccion 
	
	//Introducir cantidad// 
	
	Escribir " Introduce la cantidad a conversar "
	
	Leer cantidad
	
	
	
	//Calculos//
	
	
	Si eleccion = 1 Entonces
		calculo = cantidad * 0.88
		
		Escribir  " La cantidad de euros seleccionada a libras es de " calculo " libras. " 
	FinSi
	
	Si eleccion = 2 Entonces
		calculo = cantidad * 1.14
		
		Escribir " La cantidad de libras seleccionada a euros es de " calculo " euros. " 
	FinSi
	
	
	
	
	
	
	
FinAlgoritmo
