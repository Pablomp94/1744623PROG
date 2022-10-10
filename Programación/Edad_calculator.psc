Algoritmo Edad_calculator
	
	// Preguntar por el año mes y dia //
	// Calcular la edad de año mes y dia //
	// Si es su cumpleaños felicitarle //
	//nota_todos los meses son de 31 días//
	
	añoactual = 2022 
	mesactual = 10
	diaactual = 7
	
	
	Escribir  " Introduce en que año nacistes " 
	Leer año 
	Escribir "___________________________________________________________" 
	Escribir  "     														"
	Escribir  " Introduce en que mes nacistes, en número " 
	Leer  mes 
    Escribir " 															"
	Escribir  " Introduce el dia el cual nacistes "
	Leer dia 
	
	Si mes < mesactual Entonces
		calculomes = mesactual - mes 
		calculoaño = añoactual - año
	FinSi
	
	Si mes > mesactual Entonces
		calculomes = (12 - mes) + mesactual
		calculoaño = (añoacltual - 1) - año
	FinSi
	
	Escribir "Tienes " calculoaño " añoss " " y " calculomes " meses. "
	
FinAlgoritmo 
