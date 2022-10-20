
//AUTOR : Pablo Morales Puertas. NRE : 1744623//
//FECHA : 20/10/22//
//Descripcion = Calculador de compras de teclados en el cual su precio varia dependiendo del numero a comprar//
//calcular a base de condicionales las distintas cantidades a pagar//
//Mostrar resultados//



Algoritmo Ejercicio1_Tiendainformatica
	
	//Preguntar por el numero de teclados a comprar//
	//Introduccion del precio segun el numero a comprar//
	//Precio total estimado//
	
	Escribir ("************************************************")
	Escribir (" BIENVENIDO A LA TIENDA DE TECLADOS INFORMATICOS ")
	Escribir ("************************************************")
	Escribir ("												")
	
	//Preguntar por el numero de teclados a comprar//
	Escribir ("Introduce la cantidad de teclados que desea comprar")
	
	teclados = numero 
	
	Leer teclados 
	
	
	//Introducir el coste segun la cantidad de teclados//
	
	promo1 = 20 * teclados 
	
	promo2 = 26 * teclados 
	
	promo3 = 30 * teclados 
	
	//Si son mas de 8 teclados//
	si teclados > 8 Entonces
		
		Escribir ("Has pedido ") teclados (" teclados")
		
		Escribir ("Segun los teclados pedidos te sale a 20 auros el teclado")
		Escribir ("__________________________________")
		Escribir ("En total son ") promo1 (" euros")
		
	FinSi
	
	//Si son entre 4 y 8, incluyendose estos//
	si teclados >= 4 y teclados <= 8 Entonces
		
		Escribir ("Has pedido ") teclados (" teclados")
		
		Escribir ("Segun los teclados pedidos te sale a 26 auros el teclado")
		Escribir ("__________________________________")
		Escribir ("En total son ") promo2 (" euros")
		
	FinSi
	
	//Si son menos de 4// 
	si teclados < 4 y teclados > 0  Entonces
		
		Escribir ("Has pedido ") teclados (" teclados")
		
		Escribir ("Segun los teclados pedidos te sale a 30 auros el teclado")
		Escribir ("__________________________________")
		Escribir ("En total son ") promo3 (" euros")
		
	FinSi
	
	//Dar error si introduces numeros negativos//
	si teclados <= 0 Entonces
		Escribir ("Los datos introducidos son erroneos debido a que no has pedido suficientes teclados")
	FinSi
	
	
	
	
FinAlgoritmo
