Algoritmo Actividad5_Geometría
	
	Escribir "*****************************************************************"
	Escribir " Aplicación para calculos geométricos de circunferencia y esfera " 
	Escribir "*****************************************************************"
	Escribir "																	" 
	Escribir  " Introduzca la longitud del radio deseado "
	Escribir "												"
	
	Leer radio
	Escribir "												" 
	//Efecto de calculando//
	Escribir " Espere: "
	Escribir  " Calculando ..."
	Esperar 3 segundos 
	Escribir ";;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;"
	
	//Calculos// 
	
	
	radiocubo = radio * radio * radio 
	
	area = (radio * radio) *  pi
	
	volumen = ((4/3) * pi) * radiocubo
	
	Escribir " El área de la circunferencia es : " area "."
	
	Escribir ":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::"
	
	Escribir " El volumen de la esfera es : " volumen "."
	
	
	
FinAlgoritmo
