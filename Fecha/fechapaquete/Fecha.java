
/**
* @author Pablo Morales Puertas
* @since 2023/03/02
* @implNote Optimizacion y documentacion del codigo
*/


//Creado el package correspondiente//
package fechapaquete;

public class Fecha {
     
    //Se ha puesto las variables a privado, se ha renombrado la variable anio a year//
    //Generado los guetters y setters de las variables//

    private int dia, year, mes;
    
    
    
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    //Este metodo introduce los valores a cada variable//

    public Fecha(int dia, int mes, int year) {
    
    this.dia = dia;
    
    this.mes = mes;
    
    this.year = year;
    
    }
    
    //Este metodo devuelve un valor buleano (true) o (false)//

    public boolean valida () {

    /**Añadido las llaves faltantes a los if, para mayor comprension visual//
    *
    *Este es un condicional "si", devuelve falso si la variable dia es menor de uno o mayor de 31, ej(0 , 32)**/

    if (dia < 1 || dia > 31){
        return false;
    }
    
    //Este es un condicional "si", devuelve falso si la variable dia es menor de 1 (0), o la variable mes es mayor de 12 (13);

    if (mes < 1 || mes > 12){
    return false;
    }
    //Introduce la variable diaMes, y la iguala a 0//

    int diasMes = 0;
    
    switch (mes) {
    
    case 1:
    
    case 3:
    
    case 5:
    
    case 7:
    
    case 8:
    
    case 10:
    
    case 12: diasMes = 31; break;
    
    case 4:
    
    case 6:
    
    case 9:
    
    case 11 : diasMes = 30; break;
    
    case 2 : 
    
    if ( (year % 400 == 0) || ( (year % 4 == 0) && (year % 100 != 0) ) )
    
    diasMes = 29;
    
    else diasMes = 28;
    
    break;
    
    }
    
    if (dia > diasMes)
    
    return false;
    
    else return true;
    
    }
    
    }