import java.util.*;

public class App {

  public static void main(String[] args) {
    Ej_Metodos Metodo = new Ej_Metodos();

    Scanner sc = new Scanner(System.in);

    int num, opcion;
  do{
    System.out.println("...................");
    System.out.println(" -------MENU------");
    System.out.println("...................");
    System.out.println("1.Capicua");
    System.out.println("2.Primo");
    System.out.println("3.Siguiente Primo");
    System.out.println("4.Potencia");
    System.out.println("5.Cuenta el numero de digitos de un numero entero.");
    System.out.println("6.Voltea");
    System.out.println("7.Devuelve el digito que esta en la posición n de un numero entero.");
    System.out.println("8.Da la posición de la primera ocurrencia de un digito dentro de un numero entero.");
    System.out.println("9.Le quita a un numero n digitos por detras (por la derecha).");
    System.out.println("10.Le quita a un nuumero n digitos por delante (por la izquierda).");
    System.out.println("11.Añade un digito a un numero al final.");
    System.out.println("12.Añade un digito a un numero por delante.");
    System.out.println("0.SALIR");
    System.out.println("------------------");
    System.out.println("Elije una opción: ");
    opcion = sc.nextInt();
    System.out.println("------------------");









    
    //Metodo.capicua(num);//
  
  if(opcion == 1){

    System.out.println("Introduce un número");

    num = sc.nextInt();

    Metodo.capicua(num);

  }



  if(opcion == 2){

    //PRIMOS//
    System.out.println("Introduce un numero entero");

    num = sc.nextInt();    
    Metodo.primo(num);
  }

  if(opcion == 3){
    //SiguientePrimo//

     System.out.println("Introduce un numero entero");

    
    num = sc.nextInt();


    Metodo.sigprimo(num);
  }

  if(opcion == 4){
    //Potencia//
    System.out.println("Introduce la base de la potencia:");

    int base = sc.nextInt();
    System.out.println(" ");
    System.out.println("Introduce el exponente de la potencia:");

    int exponente = sc.nextInt();
    System.out.println(" ");

    Metodo.potencia(base, exponente);
  }

  if(opcion == 5){
    //Digitos//
    System.out.println("Introduce un numero para calcular sus digitos: ");

    int numdig = sc.nextInt();

    Metodo.digitos(numdig);
  }

  if(opcion == 6){
    //Volteo//

    System.out.println("Introduce un numero a realizar el volteo:");

    int number = sc.nextInt();

    System.out.println("Numero volteado");
    
    Metodo.voltea(number);
    System.out.println(Metodo.voltea(number));
  }


  if(opcion == 7){
    //DigitoN//

    System.out.println("Introduce un numero a trabajar");

    num = sc.nextInt();

    System.out.println("Introduce la posición a mostrar");

    int pos = sc.nextInt();

    Metodo.digitoN(num, pos);
  }

  if(opcion == 8){
    //posiciondeDigito// 
  }

  if(opcion == 9){
    //Quitar por detrás//

    System.out.println("Introduce el numero a trabajar");

    num = sc.nextInt();

    System.out.println("Introduce el numero de digitos a retirar por la derecha");

    int n = sc.nextInt();

    Metodo.quitaPorDetras(num, n); 
  }

  if(opcion == 10){

    //Le quita a un número n dígitos por delante (por la izquierda).//

    System.out.println("Introduce el numero a trabajar");

    num = sc.nextInt();

    System.out.println("Introduce el numero de digitos a retirar por la izquierda");

    int n = sc.nextInt();

    Metodo.quitaPorDelante(num, n);
  }

  if(opcion == 11){

    System.out.println("Introduce un numero");

    num = sc.nextInt();

    System.out.println("Introduce un digito a agregarle al final");

    int añadido = sc.nextInt();

    Metodo.añadirFinal(num, añadido);

  }


  if(opcion == 12){

    System.out.println("Introduce un numero");

    num = sc.nextInt();

    System.out.println("Introduce un digito a agregarle al inicio");

    int añadido = sc.nextInt();

    Metodo.añadirInicio(num, añadido);

  }

  }while(opcion!=0);
}
}
