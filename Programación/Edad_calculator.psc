Algoritmo Edad_calculator
	
	// Preguntar por el a�o mes y dia //
	// Calcular la edad de a�o mes y dia //
	// Si es su cumplea�os felicitarle //
	//nota_todos los meses son de 31 d�as//
	
	a�oactual = 2022 
	mesactual = 10
	diaactual = 7
	
	
	Escribir  " Introduce en que a�o nacistes " 
	Leer a�o 
	Escribir "___________________________________________________________" 
	Escribir  "     														"
	Escribir  " Introduce en que mes nacistes, en n�mero " 
	Leer  mes 
    Escribir " 															"
	Escribir  " Introduce el dia el cual nacistes "
	Leer dia 
	
	Si mes < mesactual Entonces
		calculomes = mesactual - mes 
		calculoa�o = a�oactual - a�o
	FinSi
	
	Si mes > mesactual Entonces
		calculomes = (12 - mes) + mesactual
		calculoa�o = (a�oacltual - 1) - a�o
	FinSi
	
	Escribir "Tienes " calculoa�o " a�oss " " y " calculomes " meses. "
	
FinAlgoritmo 
