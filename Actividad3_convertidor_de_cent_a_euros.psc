Algoritmo Actividad3_convertidor_de_cent_a_euros
	
	//Petici�n//
	Escribir  "Introduce el n�mero de centimos que quieras convertir a euros entre 1000 y 5000 "
	Leer centimos
	//Calculos// 
	euros = trunc(centimos / 100) 
	division = centimos / 100 
	cent = (division - euros) * 100
	//Condiciones//
	Si centimos < 1000 o centimos > 5000 Entonces
		Escribir " Los datos introducidos no est�n entre los l�mites establecidos (1000 y 5000) int�ntelo de nuevo "
	SiNo
		Escribir " Seg�n los datos introducidos tienes " euros " euros y " cent " centimos "
	FinSi
	
FinAlgoritmo
