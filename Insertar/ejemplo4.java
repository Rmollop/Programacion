//importamos la utilidad scanner para que java sepa lo que quieres hacer 
import java.util.Scanner;

public class ejemplo4 {

    
    public static void main(String[] args ){
       Scanner sc; 
       
       sc = new Scanner(System.in); //Decimos que lea el teclado (system.in)

       System.out.println("Escribe un numero entero"); //Al estar antes que el "int" sale primero 
       short numero1 = sc.nextShort(); //La variable "sc" le dije que escanee el teclado)
       
       System.out.println("Escribe un numero entero"); 
       short numero2 = sc.nextShort(); //cambiamos Int por Short para limitar rango

    
       int suma = numero1 + numero2; //variable para identificar la suma 
        
       int resta = numero1 - numero2; 
       int division = numero1 / numero2;  
       int multiplicacion = numero1 * numero2; 

       System.out.println("El resultado de la multiplicacion " + multiplicacion);
       System.out.println("El resultado de la division " + division);
       System.out.println("El resultado de la resta " + resta);
       System.out.println("El resultado de la suma " + suma); //usando esa variable suma sacamos el resultado de los dos numeros 
       System.out.println("Adios");
       
        sc.close();

    }
    

}

