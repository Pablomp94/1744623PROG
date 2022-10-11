Algoritmo Actividad4_Mayor
	Escribir  "********************" 
	Escribir  " Mayor de 3 números " 
	Escribir  "********************" 
	
	
	Escribir " Introduzca 3 números para la selección del mayor entre estos " 
	Escribir "______________________________________________________________"
	
	//Pedir Números// 
	
	Repetir
	
	Escribir " Introduzca el primer número A " 
	
	Leer a 
	
	Escribir "-----------------------------------------"
	
	Escribir " Introduzca el segundo número B " 
	
	Leer b 
	
	Escribir "-----------------------------------------"
	
	Escribir " Introduzca el tercer número C "
	
	Leer c 
	
	Escribir "_________________________________________" 
	
	
	Si a = b o c = b o b = c Entonces
		Escribir  " No puedes introducir dos o más número iguales " 
	FinSi
	
	Hasta Que a <> b y c <> b y b <> c 
	

	//Comparar Números//
	
	Si a > b y a > c Entonces
		Escribir " El mayor número introducido fue el primer número a : " a 
	FinSi
	
	Si b > a y b > c Entonces
		Escribir " El mayor número introducido fue el segundo número b :" b
	FinSi
	
	Si c > a y c > b Entonces
		Escribir " El mayor número introducido fue el tercero c : " c 
	FinSi
	
	
	
	
	
	
	
	
FinAlgoritmo
