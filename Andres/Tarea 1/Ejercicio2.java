import java.util.Scanner;
public class Ejercicio2{
	public static void main(String[] args){
		//Inicializacion de variables
		//Variable scanner
		Scanner rd = new Scanner(System.in);
		//En esta variable se almacenara el string que el usuario ingrese
		String texto;

		//Titulo del programa
		System.out.println("STRINGS");
		//Solicitar al usuario que ingrese un texto
		System.out.print("Ingrese un texto: ");
		//Aqui se almacena lo que el usuario ha ingresado
		texto = rd.next();

		//x representa la posicion de caracter. Inicia en 0 para imprimir el primer string.
		//Al texto.length() se le resta 1 para acomodarlo a numeracion de posicion de caracteres que Java utiliza.
		//Se detiene hasta que llega al numero de caracters que estan contenidos en el string.
		for (int x = 0; x <= texto.length() - 1; x++){
			//Se imprime un caracter por linea
			System.out.println(texto.charAt(x));
		}
	}
}