import java.util.Scanner;
public class Ejercicio3{
	public static void main(String[] args){
		//Inicializacion de variables
		//Variable scanner
		Scanner rd = new Scanner(System.in);
		//En esta variable se guardara el numero que el usuario ingrese
		int num = 0;

		//Titulo de programa
		System.out.println("ASTERISCOS");
		//Se solicita al usuario que ingrese un numero entero
		System.out.print("Ingrese un numero entero: ");
		//Aqui se guarda el numero ingresado
		num = rd.nextInt();

		//El primer for es para mostrar la cantidad de asteriscos segun el numero ingresado, para eso se utiliza la x como contador.
		//Se comienza a contar desde 1, si se ingresa un valor menor a este no se imprime nada.
		//Se detiene cuando x es igual al numero ingresado.
		for (int x = 1; x <= num; x++){
			//Este segundo for es para agregar los espacios a cada linea
			//Se comienza a contar desde 1 con la variable "y".
			//En la primera linea no se debe agregar un espacio. 
			//Inicialmente tenemos x = 1, y = 1. Como 1 no es menor que 1, no se agrega el espacio y continua con el primer for.
			//La variable "y" incrementara de uno en uno, en cada incremento se agregara un espacio hasta que la variable ya no sea menor que x. 
			//Una vez que termina este segundo for, cuando el primer for vuelve a comenzar y llega a esta linea, la variable "y" se reinicia a 1.
			for (int y = 1; y < x; y++){
				//Se agregan los espacios en la misma linea que estara el asterisco
				System.out.print(" ");
			}
			//Se imprime el asterisco
			System.out.println("*");

		}
	}
}