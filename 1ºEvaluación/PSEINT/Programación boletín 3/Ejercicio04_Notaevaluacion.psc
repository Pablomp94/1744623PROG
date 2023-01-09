Algoritmo Ejercicio04_Notaevaluacion
//AUTOR : Pablo Morales Puertas. NRE : 1744623//
//FECHA : 21/10/22//
//Descripcion = Calculador de nota necesaria para sacar la media deseada//
//Introducir primera nota, la cual vale un 40 porciento de la nota final//	
//Introducir nota deseada por la cual calcularemos la nota requerrida en la segunda nota para sacar dicha media// 
//La segunda nota vale un 60 porciento de la nota total//
//Mostrar resultados//
	
	
	Escribir ("******************")
	Escribir ("CALCULADOR DE NOTA")
	Escribir ("******************")
	
	Escribir ("Introduzca la nota adquirida en la primera prueba")
	
	Leer nota1
	
	Escribir ("¿Que nota deseas sacar en la media total?")
	
	Leer mediadeseada
	
	nota1_media = nota1 * 0.4
	
	nota2_media = (mediadeseada - nota1_media)

	nota2_real = nota2_media / 0.6
	
	Escribir ("Para sacar la media deseada tendrás que sacar en la segunda prueba un ") (nota2_real)
	
	Si nota2_real > 10 Entonces
		Escribir ("Por lo que la nota necesaria en la segunda prueba es mayor de la nota maxima de un examen por lo que no es posible sacar dicha media deseada")
	FinSi
	
	
	
	
FinAlgoritmo
