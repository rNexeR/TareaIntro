import java.util.Scanner;
public class Ejercicio2{
	public static void main(String[] args){
		//Hacer un programa que solicite una string, y que imprima caracter por caracter (uno por linea).
		//Declaracion de variables.
		Scanner lea = new Scanner(System.in);
		String palabra;
		int cant;

		//Programa.
		System.out.println("A continuacion se le solicitara que ingrese una palabra.");
		System.out.println("Seguidamente, dicha palabra sera desplegada verticalmente.");

		System.out.println("Porfavor ingrese una palabra: ");
		palabra = lea.next(); //Almaceno una palabra.
		cant = palabra.length(); //Almaceno el tamano de la palabra.

		for(int x = 0; x < cant; x ++){ //Se indica que se leeran caracteres desde 0 hasta el fin de la palabra 1 por uno.
			System.out.println(palabra.charAt(x)); // se imprime el caracter que se esta leyendo.
		}
	}
}