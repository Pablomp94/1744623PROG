Algoritmo Ejercicio05_Test
	//AUTOR : Pablo Morales Puertas. NRE : 1744623//
	//FECHA : 22/10/22//
	//Descripcion = //EXAMEN TIPO TEST//
	//INTRODUCIR PREGUNTAS, RESPUESTAS, FALLOS TOTALES//	
	//MOSTRAR FALLOS TOTALES//
	
	
	//Introducción//
	Escribir ("TEST DE BANDAS DE MÚSICA")
	Escribir ("************************")
	
	//Preguntas//
	
	Escribir ("¿DE QUE GRUPO ES LA CANCION WAR PIGS?")
	
	Escribir ("A) METALLICA")
	Escribir ("B) SCORPIONS")
	Escribir ("C) BLACK SABBATH")
	
	Leer respuesta1 
	
	Si respuesta1 = "C" o respuesta1 = "c" Entonces
		Escribir ("Enhorabuena Acertastes") 
		fallo1 = 0
	SiNo 	
		Escribir ("Has fallado") 
		fallo1 = 1
	FinSi
	
	Escribir ("_________________________________________________________")
	
	Escribir ("ENTRE ESTAS; ¿QUE CANCION ES DEL GRUPO METALLICA?")
	Escribir ("A) SYMPHONY OF DESTRUCTION")
	Escribir ("B) SEEK AND DESTROY")
	Escribir ("C) PARANOID")
	
	Leer respuesta2
	
	Si respuesta2 = "B" o respuesta1 = "b" Entonces
		Escribir ("Enhorabuena Acertastes") 
		fallo2 = 0
	SiNo 	
		Escribir ("Has fallado") 
		fallo2 = 1
	FinSi
	Escribir ("__________________________________________________________")
	
	
	Escribir ("¿CUAL DE ESTAS LISTAS DE CANCIONES PERTENECEN AL GRUPO DE JUDAS PRIEST?")
	
	Escribir ("A) THE SENTINEL / BEYOND REALMS OF DEATH / BREAKING THE LAW")
	Escribir ("B) STAIRWAY TO HEAVEN / WHOLE LOTTA LOVE / IMMIGRANT SONG")
	Escribir ("C) FEAR OF THE DARK / THE TROOPER / DANCE OF DEATH")
	
	Leer respuesta3
	
	Si respuesta3 = "A" o respuesta1 = "a" Entonces
		Escribir ("Enhorabuena Acertastes") 
		fallo3 = 0 
	SiNo 	
		Escribir ("Has fallado") 
		fallo3 = 1
	FinSi
	
	Escribir ("*****************************************************************")
	
	
	//CALCULO FALLOS//
	
	fallostotales = fallo1 + fallo2 + fallo3 
	
	Escribir ("HAS TENIDO ") fallostotales (" FALLOS ") 
	
	
FinAlgoritmo
