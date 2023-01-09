Algoritmo Actividad3_calculo_paga_semanal
	
	// Introducción de datos //
	
Escribir " * Calculo de paga semanal * " 
Escribir "_____________________________"
Escribir "								"
Escribir "								"	

Escribir " Deberás de introducir tus datos "

Escribir ";;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;"

Escribir  " Introduce tu nombre: "

Leer nombre 

Escribir "							"

Escribir " Introduce las horaas trabajadas esta semana " 

// Como míinimo 35 h debido a que son las horas establecidas // 
Leer horastrabajadas

	// CALCULOS //  //22 $ la hora //  //Horas extras apartir de 35 h // 

horasextras = horastrabajadas - 35 

salarioextras = horasextras * (22 * 1.5)

salario = (35 * 22) + salarioextras 

salarioimpuestos = salario - 350

Si salarioimpuestos > 350 Entonces
	primersalario = (350 / 100) * 25 
	segundosalario = ((salarioimpuestos - 350) / 100) * 45 
	salariototal = primersalario + segundosalario 
	
FinSi

Escribir  " La cuenta establecida es de " nombre


Escribir " Las horas trabajadas son : "

Escribir  horastrabajadas 

Escribir  " De esas horas trabajadas, tienes " horasextras " horas extras " 

Escribir " Tu salario es de " salario 


Escribir " Primer impuesto ------- :" primersalario

Escribir  " Segundo impuesto ------ : " segundosalario 

Escribir " Salario total : " salariototal

Escribir " Tu salario semanal neto es de " salario - salariototal 

FinAlgoritmo
