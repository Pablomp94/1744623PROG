Algoritmo Actividad1_Edad_calculator
	
	// Preguntar por el año mes y dia //	
	Escribir  " _____________________________________________________________"
	Escribir  "                                                                "
	Escribir "               Esto es un calculador de años " 
	Escribir  "                                                                "
	Escribir  " _____________________________________________________________"
	
	
	Escribir  " Debes de introducir la fecha en la que nacistes para poder llevar a cabo los calculos "
	Escribir "                                          "
	Escribir  " - Empecemos por el día - " 
	
	Escribir " Introduzca el día en el que naciste : " 
	
	Repetir 
		Leer dia 
	
		Si dia > 31 Entonces
			Escribir  " El número introducido correspndiente con el día de nacimiento no es valido, debido a que es demasiado grande "
		FinSi
		
		Si dia < 1 Entonces
			Escribir " El número introducido correspndiente con el día de nacimiento no es valido, debido a que es demasiado pequeño "
		FinSi
	Hasta que dia > 0 y dia < 32
	
	Escribir "																"
	Escribir "____________________________________________________________________________"
	Escribir "                                                             " 
	
	Escribir  " A continuación introduce el mes en el que naciste en forma numérica "
	
	Repetir
		Leer mes 
		
		Si mes > 12 Entonces
			Escribir " El número introducido no es compatible debido a que es demasiado grande "
		FinSi
		
		Si mes < 1 Entonces
			Escribir " El número introducido no es compatible debido a que es demasiado pequeño " 
		FinSi
	Hasta Que mes < 13 y mes > 0 
	
	
	Escribir "------------------------------------------------------------"
	
	Escribir " Para finalizar la extracción de datos para poder operar con ellos deberás de introducir el año en el que nacistes "
	
	Escribir " 															"
	
	Repetir
		
	 Leer año
	 
	 Si año > 2017 Entonces
		 Escribir  " El número de años establecido es demasiado bajo "
	 FinSi
		 
	 Si año < 1925 Entonces
		 Escribir  " El número de años establecido es demasiado grande "
	 FinSi
		 
	Hasta Que año >= 1925 y año <= 2017 	 
	
	
	Escribir " Ahora que están todos los datos personales deberás de introducir la fecha actual "
	
	Escribir "																"
	Escribir " introduce en número en este orden día / mes / año "
	
	Escribir " ________________________________________________________________________________ "
	
	Leer diaactual
	
	Escribir  "/"
	
	Leer mesactual 
	
	Escribir "/"
	
	Leer añoactual
	
	//Calculos//
	
	Si mesactual > mes 
		calculoaño = añoactual - año 
	FinSi
	
	Si mesactual < mes
		calculoaño = (añoactual - año) - 1 
	FinSi
	
	Si mes = mesactual y dia > diaactual
		calculoaño = (añoactual - año) - 1 
	FinSi
	
	Si mes = mesactual y dia <= diaactual
		calculoaño = añoactual - año 
	FinSi
	
	edad = calculoaño
	
	// Si es su cumpleaños felicitarle //
	
	
	
	
	Si mesactual = mes y dia = diaactual Entonces
		Escribir " FELICIDADES; ES TU " edad " º " "CUMPLEAÑOS :) " 
	SiNo
		Escribir " Tienes " edad " años"
	FinSi
	
	
	
	
	
	
	
FinAlgoritmo 
