import java.util.Scanner;
public class Ejercicio4{
	public static void main(String[] args){
		//Inicializacion de variables
		//Variable Scanner
		Scanner rd = new Scanner(System.in);
		//En esta variable se guardara el texto ingresado por el usuario
		String texto;

		//Titulo del programa
		System.out.println("INVERTIDOR DE TEXTO");
		//Se solicita al usuario que ingrese un texto
		System.out.print("Ingrese un texto: ");
		//Aqui se guarda el texto ingresado
		texto = rd.next();

		//La variable "x" tomara el valor de la ultima posicion del texto.
		//Se detendra hasta llegar al valor de la primera posicion del texto (cuando x = 0)
		//Para que esto funcione, "x" debe ir decreciendo.
		for (int x = texto.length() - 1; x >= 0 ; x+=-1){
			//Se imprime cada caracter en la misma linea segun el valor de "x"
			System.out.print(texto.charAt(x));
		}
	}
}