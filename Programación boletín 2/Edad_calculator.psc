Algoritmo Actividad1_Edad_calculator
	
	// Preguntar por el a�o mes y dia //	
	Escribir  " _____________________________________________________________"
	Escribir  "                                                                "
	Escribir "               Esto es un calculador de a�os " 
	Escribir  "                                                                "
	Escribir  " _____________________________________________________________"
	
	
	Escribir  " Debes de introducir la fecha en la que nacistes para poder llevar a cabo los calculos "
	Escribir "                                          "
	Escribir  " - Empecemos por el d�a - " 
	
	Escribir " Introduzca el d�a en el que naciste : " 
	
	Repetir 
		Leer dia 
	
		Si dia > 31 Entonces
			Escribir  " El n�mero introducido correspndiente con el d�a de nacimiento no es valido, debido a que es demasiado grande "
		FinSi
		
		Si dia < 1 Entonces
			Escribir " El n�mero introducido correspndiente con el d�a de nacimiento no es valido, debido a que es demasiado peque�o "
		FinSi
	Hasta que dia > 0 y dia < 32
	
	Escribir "																"
	Escribir "____________________________________________________________________________"
	Escribir "                                                             " 
	
	Escribir  " A continuaci�n introduce el mes en el que naciste en forma num�rica "
	
	Repetir
		Leer mes 
		
		Si mes > 12 Entonces
			Escribir " El n�mero introducido no es compatible debido a que es demasiado grande "
		FinSi
		
		Si mes < 1 Entonces
			Escribir " El n�mero introducido no es compatible debido a que es demasiado peque�o " 
		FinSi
	Hasta Que mes < 13 y mes > 0 
	
	
	Escribir "------------------------------------------------------------"
	
	Escribir " Para finalizar la extracci�n de datos para poder operar con ellos deber�s de introducir el a�o en el que nacistes "
	
	Escribir " 															"
	
	Repetir
		
	 Leer a�o
	 
	 Si a�o > 2017 Entonces
		 Escribir  " El n�mero de a�os establecido es demasiado bajo "
	 FinSi
		 
	 Si a�o < 1925 Entonces
		 Escribir  " El n�mero de a�os establecido es demasiado grande "
	 FinSi
		 
	Hasta Que a�o >= 1925 y a�o <= 2017 	 
	
	
	Escribir " Ahora que est�n todos los datos personales deber�s de introducir la fecha actual "
	
	Escribir "																"
	Escribir " introduce en n�mero en este orden d�a / mes / a�o "
	
	Escribir " ________________________________________________________________________________ "
	
	Leer diaactual
	
	Escribir  "/"
	
	Leer mesactual 
	
	Escribir "/"
	
	Leer a�oactual
	
	//Calculos//
	
	Si mesactual > mes 
		calculoa�o = a�oactual - a�o 
	FinSi
	
	Si mesactual < mes
		calculoa�o = (a�oactual - a�o) - 1 
	FinSi
	
	Si mes = mesactual y dia > diaactual
		calculoa�o = (a�oactual - a�o) - 1 
	FinSi
	
	Si mes = mesactual y dia <= diaactual
		calculoa�o = a�oactual - a�o 
	FinSi
	
	edad = calculoa�o
	
	// Si es su cumplea�os felicitarle //
	
	
	
	
	Si mesactual = mes y dia = diaactual Entonces
		Escribir " FELICIDADES; ES TU " edad " � " "CUMPLEA�OS :) " 
	SiNo
		Escribir " Tienes " edad " a�os"
	FinSi
	
	
	
	
	
	
	
FinAlgoritmo 
