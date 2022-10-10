Algoritmo Actividad2_Calificación 	
	
	
	// Pedir nota // 
	
	Escribir  " Introduzca la nota que obtuvo "
	
	Leer nota
	
	// Evaluar nota // 
	
	Si nota > 0 y nota < 3 Entonces
		Escribir " La nota introducida fue " nota " , equivale a un deficiente " 
		Escribir " Suerte la próxima vez "
	FinSi
	
	Si nota >= 3 y nota < 5 Entonces
		Escribir " La nota introducida es " nota " , equivale a un insuficiente "
		Escribir " Solo falta un poco más "
	FinSi
	
	Si nota >= 5 y nota < 6 Entonces
		Escribir " Según la nota introducida " "(" nota ")" " tienes un bien " 
	FinSi
	
	Si nota >= 6 y nota < 9 Entonces
		Escribir " La nota introducida fue de un " nota " es un notable " 
	FinSi
	
	Si nota >= 9 y nota <= 10 Entonces
		Escribir " La nota establecida fue un " nota " tienes un sobresaliente "
		Escribir  " Enhorabuena " 
	FinSi
	
	
	// Establecer límites // 
	
	Si nota > 10 o nota < 0 Entonces
		Escribir " Los valores establecidos no son correctos, asegúrese de que la nota está entre el 0 y el 10 pudiendose incluir estos " 
	FinSi
	
	
FinAlgoritmo
