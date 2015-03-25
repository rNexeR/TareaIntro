//Hacer un programa que solicite una string, y que imprima caracter 
//por caracter (uno por linea). TIP: Investigar la funcion length de una string.
import java.util.Scanner;
public class Ejercicio2{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String palabra = scan.next();

		for(int i = 0; i < palabra.length(); i++){
			System.out.println(palabra.charAt(i));
		}
	}
}