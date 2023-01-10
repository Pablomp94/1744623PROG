import java.util.*;

public class App {

        public void ej1(){

            Scanner sc = new Scanner(System.in);
    
            int i; 
    
            i = 0;
    
            
    
            int[] num = new int[10];
    
            
    
            for(i = 0; i <= 9; i++){
    
                System.out.println("Introduce el valor " + (i + 1) + " :");
    
                num[i] = sc.nextInt();
    
            }
    
            System.out.println("Valores:");
    
            for(i = 0; i <= 9; i++){
            
                System.out.println ("El valor " + (i+1) + " es " + (num[i]));
            }
    
        }
    
        public void ej2(){

            Scanner sc = new Scanner(System.in);
        
        
                    //Variables//
            int i, suma;
        
            i = 0;
        
            suma = 0;
        
            int[] num = new int[10];
        
                
                    //Codigo//
            for(i = 0; i <=9 ; i++){
        
                System.out.println("Introduce el valor " + (i + 1) + " :");
        
                num[i] = sc.nextInt();
        
                suma = num[i] + suma;
            }
        
            for(i = 0; i <= 9; i++){
        
                System.out.println("El valor " + (i+1) + " es " + num[i]);
            }
            
            System.out.println("La suma de estos numeros es:" + suma);
        
            }

            public  void ej3(){

                Scanner sc = new Scanner(System.in);
        
                    //Variables//
        
                int i, mayor, menor;
        
                i = 0; 
        
                mayor = 0;
        
                menor = 1000000;
        
                int[] num = new int[10];
                
                    //Codigo//
        
                for(i = 0; i <= 9; i++){
        
                    System.out.println("Introduce el valor " + (i + 1) + " :");
        
                    num[i] = sc.nextInt();
        
                    if(num[i] > mayor){
        
                        mayor = num[i]; 
                    }
        
                    if(num[i] < menor){
        
                        menor = num[i];
                    }
                }
        
                System.out.println("El numero mayor es : " + mayor);
        
                System.out.println("El numero menor es : " + menor);
            }

            public void ej4() {

                Scanner sc = new Scanner(System.in);
        
                        //Variables//
        
                int i, sumapos, sumaneg;
        
                i = 0;
        
                sumapos = 0;
        
                sumaneg = 0;
        
                int[] num = new int[20];
        
                        //Codigo//
                for(i = 0; i <= 19; i++){
        
                    System.out.println("Introduce el valor " + ( i + 1 ) + ":");
        
                    num[i] = sc.nextInt();
        
                    if(num[i] > 0){
                        sumapos = sumapos + num[i]; 
                        
                    }
                    if(num[i] < 0){
                        sumaneg = sumaneg + num[i];
                        
                    }
                }
        
                System.out.println("La suma de los numeros positivos introducidos es de :" + sumapos);
                System.out.println("La suma de los numeros negativos introducidos es de :" + sumaneg);
        
            }

            public void ej5() {
        
                Scanner sc = new Scanner(System.in);
        
                        //Variables//
                
                int i, suma, media;
        
                i = 0;
        
                suma = 0; 
        
                int[] num = new int[20];
        
                        //Codigo//
        
                for( ; i <= 19; i++){
        
                    System.out.println("Introduce el valor para el " + i +"º numero");
        
                    num[i] = sc.nextInt();
        
                    suma = suma + num[i]; 
                }
                
                media = suma / 20;
        
                System.out.println("La media de los 20 numeros introducidos es de : " + media);
            }

            public  void ej6() {
        
                Scanner sc = new Scanner(System.in);
        
                        //variables//
                
                int i, n, m;
        
                i = 0;
        
                        //Codigo//
        
                System.out.println("Introduce la longitud del array (el numero de veces a introducir)");
        
                n = sc.nextInt(); 
        
                System.out.println("Introduce el numero que quieras que se introduzca en el array");
        
                m = sc.nextInt();
        
                int[] num = new int[n];
        
                System.out.println("--------------");
                System.out.println("Se va a introducir " + m + " ," +  n + " veces:");
                System.out.println("--------------");
        
        
                for( ; i <= (n - 1) ; i++ ){
        
                    num[i] = m; 
        
                    System.out.println(num[i]);
        
                }
        
            }

            public  void ej7() {
        
                Scanner sc = new Scanner(System.in);
        
                        //Variables//
                    
                int p , q , i ;
        
                i = 0; 
        
                System.out.println("Introduce un numero inicial");
        
                p = sc.nextInt();
        
                System.out.println("Introduce un numero de limite");
        
                q = sc.nextInt();
        
                System.out.println("Se mostrará los valores entre " + p + " y " + q);
        
                int[] num = new int[(q - p) + 2];
                
                        //Codigo//
        
                for( ;p <= q; i ++ ){
        
                    num[i] = p;
        
                    System.out.println(num[i]);
        
                    p ++; 
                }
            }


    }

