//***********************************************//
package javaapplication5;     
import java.util.Scanner;   //libreria de scanner
public class JavaApplication5 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n;                                       //declarar variables de scanner y los enteros
    do{                                          //un while para que opere infinitamente
    System.out.println("\nIngrese un numero: "); //texto para ingresar el numero
    n = sc.nextInt();                            //scannear eñ numero 
    if(n == 2 || n == 3 || n == 1 || n % 2 > 0 || n % 3 > 0){    //se establece un if y la operacion para ver si es primo o no
        System.out.println("El numero es primo.");
    }
    else{ 
        System.out.println("El numero no es primo.");           //el sistema analiza si se cumple o no la operacion para ver si es o no es primo
    }
    }while(true);
    }
}   
//************************************************//
package javaapplication14;

import java.util.Scanner;
public class JavaApplication14{
    public static void main(String[] args) {
    Scanner rd = new Scanner(System.in); //establecer variables
    String palabra;
    System.out.print("Ingrese una palabra: ");
    palabra = rd.next(); //escanear palabra 
    int size = palabra.length();    // declarar en una variable el numero de caracteres
    for(int x = 0;x < size;x++){  //x sera la posicion 0 y su contador para que sume al lado derecho y lea los caracteres
    char lector = palabra.charAt(x);  //empezar a leer desde x
    System.out.println(palabra.charAt(x));//Imprimir el caracter en 0 y que continuo imprmiendo los siguientes
		 	if(x<=size){
		 		continue;
		 	}
		 }
	}
}

//*********************************************//
package javaapplication13;
import java.util.Scanner;       //declaramos scanner
public class JavaApplication13 {

    public static void main(String[] args) {
       int numero;  //declaramos variables
       Scanner sc = new Scanner(System.in);
       System.out.print("Ingrese un numero: ");  //texto para ingresar un numero
       numero = sc.nextInt();                    //scannear ese numero
      
       while(numero>0){                    //un while para que no ingresen negativos y sus respectivos contadores para ingresar la linea de asteriscos
           for(int n = 0; n<numero; n++){
               System.out.print("*");
           }
           System.out.print("\n");
           numero=numero-1;              
       }
    }
    
}
//*******************************************//
package javaapplication12;
import java.util.Scanner;     //declarar la libreria scanner
public class JavaApplication12 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); //declara la variable scanner
System.out.println("Ingresa una palabra"); //texto
String cad = sc.nextLine();     //scanee la palabra           
String aux="";                      //declaramos la variable que imprimira la palabra al reves
for(int i=cad.length()-1;i>=0;i--)  //operacion para darle vuelta a la palabra
{ 
aux=aux+cad.charAt(i);       
} 
System.out.println(aux);          //palabra impresa
    }
    
}
