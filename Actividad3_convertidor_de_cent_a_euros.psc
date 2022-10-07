Algoritmo Actividad3_convertidor_de_cent_a_euros
	
	//Petición//
	Escribir  "Introduce el número de centimos que quieras convertir a euros entre 1000 y 5000 "
	Leer centimos
	//Calculos// 
	euros = trunc(centimos / 100) 
	division = centimos / 100 
	cent = (division - euros) * 100
	//Condiciones//
	Si centimos < 1000 o centimos > 5000 Entonces
		Escribir " Los datos introducidos no están entre los límites establecidos (1000 y 5000) inténtelo de nuevo "
	SiNo
		Escribir " Según los datos introducidos tienes " euros " euros y " cent " centimos "
	FinSi
	
FinAlgoritmo
