package Figuras;

public class Cuadrado implements iFigura2D{
    
    private double lado;

    public double perimetro(){
        return lado * 4;
    }

    public double area(){
        return lado * lado;
    }

/**
 * The function takes a double as a parameter and returns a double. If the parameter is less than 0,
 * the function returns 0. Otherwise, the function returns the value of the parameter multiplied by the
 * value of the variable lado
 * 
 * @param escala The scale to be applied to the square.
 * @return The value of the variable lado.
 */
    public double escalar(double escala){
        if(escala < 0){
           return 0;
        }else{
            return lado = lado * escala;
        }
    }
    public String imprimir(){
        System.out.println("Lado del cuadrado");
    }
}
