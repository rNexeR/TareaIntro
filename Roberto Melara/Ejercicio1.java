import java.util.Scanner;
public class Ejercicio1{
	public static void main(String[] args){
		//Hacer un programa que ingrese un numero y diga si es un numero primo o no.
		//Declaracion de Variablee.
		Scanner lea = new Scanner(System.in);
		int prob = 2;  
      	int result = 0; 
      	int num = 0; 
		char sel;

		//Programa.
		System.out.println("A continuacion se le pedira que ingrese un numero.");
		System.out.println("El programa le dira si su numero es o no un numero primo.");
		
		System.out.println("Por favor, ingrese un numero: ");
		num = lea.nextInt(); 

   		while (prob <= num / 2){//Probara numeros hasta llegar a la mitad de el numero ingresado, sino encuentra un divisor hasta la mitad el numero es primo.
   			
   			if (num % prob == 0){
 			result = 1;  //La variable result se cambia a uno si se encuentra un divisor, esto indicara si el numero es primo o no.
    		}	
    		prob++;  //Incrementa prob por 1 para volver a probar.
  		
  		}

 		if (result == 1){
	 		System.out.println("El numero " + num + " no es un numero primo."); 
		}

 		else{
 			System.out.println("El numero " + num + " es un numero primo"); 
 		}       
			
	}
}
// Elimine la opcion de volver a ingresar numeros porque aunque no lo creas tenia un glitch y te decia que todos eran primos despues de algunos numeros.