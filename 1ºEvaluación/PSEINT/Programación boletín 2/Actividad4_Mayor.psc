Algoritmo Actividad4_Mayor
	Escribir  "********************" 
	Escribir  " Mayor de 3 n�meros " 
	Escribir  "********************" 
	
	
	Escribir " Introduzca 3 n�meros para la selecci�n del mayor entre estos " 
	Escribir "______________________________________________________________"
	
	//Pedir N�meros// 
	
	Repetir
	
	Escribir " Introduzca el primer n�mero A " 
	
	Leer a 
	
	Escribir "-----------------------------------------"
	
	Escribir " Introduzca el segundo n�mero B " 
	
	Leer b 
	
	Escribir "-----------------------------------------"
	
	Escribir " Introduzca el tercer n�mero C "
	
	Leer c 
	
	Escribir "_________________________________________" 
	
	
	Si a = b o c = b o b = c Entonces
		Escribir  " No puedes introducir dos o m�s n�mero iguales " 
	FinSi
	
	Hasta Que a <> b y c <> b y b <> c 
	

	//Comparar N�meros//
	
	Si a > b y a > c Entonces
		Escribir " El mayor n�mero introducido fue el primer n�mero a : " a 
	FinSi
	
	Si b > a y b > c Entonces
		Escribir " El mayor n�mero introducido fue el segundo n�mero b :" b
	FinSi
	
	Si c > a y c > b Entonces
		Escribir " El mayor n�mero introducido fue el tercero c : " c 
	FinSi
	
	
	
	
	
	
	
	
FinAlgoritmo
