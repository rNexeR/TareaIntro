//Hacer un programa que ingrese un numero y diga si es un numero primo o no. TIP: Un numero primo es 
//aquel que solo es divisible entre 1 y el mismo. Por ejemplo 3, es divisible solo entre 1 y 3.
import java.util.Scanner;
public class Ejercicio1{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
        int x = 0;
        int indivisibles = 0;
        //aqui la persona ingresa el numero 
		System.out.print("Inserte un numero: ");
		x = scan.nextInt();

		for(int i = 1; i <= x; i++){
			if(x%i == 0)
				indivisibles++;	
		}
		if (indivisibles > 2 || x == 1)
			System.out.println("No es primo");
		else 
			System.out.println("Es primo");

	}

}