import java.util.Scanner;
public class Ejercicio1{
	public static void main(String[] args){
		//Inicialización de las variables
		//Variable scanner
		Scanner rd = new Scanner(System.in);
		//Esta será la variable en donde se almacenará el número que ingrese el usuario
		int num = 0;
		//Este boolean se usara para identificar si el numero es primo o no. Inicia en true y cambia a false hasta que se indique lo contrario.
		boolean primo = true;

		//Titulo del programa
		System.out.println("NUMEROS PRIMOS");
		//Se indica que el numero debe ser mayor que 1 ya que el 1 no es primo, al igual que el 0 y los numeros negativos.
		System.out.println("Ingrese un numero mayor que 1");
		//Aqui se ingresara el numero. Si el numero es menor o igual que 1, el programa solicitara al usuario que ingrese otro numero.
		do {
			//Mensaje que solicita al usuario que ingrese un número.
			System.out.print("Ingrese un numero: ");
			//Se almacena el número en esta variable.
			num = rd.nextInt();
			//Si el numero es menor o igual que 1 mostrar un mensaje de error
			if (num <= 1)
				System.out.println("ERROR: No ha ingresado un numero mayor que 1. Vuelva a intentarlo.");
		} while (num <= 1);
		
		//La variable x representa todos los valores con los que se dividira el numero ingresado para probar si es primo.
		//La variable x tomara valores entre el numero ingresado y 2.
		for (int x = 2; x < num; x++){
			//Si en un momento el numero es divisible entre x, entonces el numero no es primo.
			if (num % x == 0){
				//Se muestra el mensaje
				System.out.print("No es primo");
				//Se cambia el boolean a false
				primo = false;
				break;
			}
		}

		//Si el boolean se mantuvo en true entonces el numero es primo.
		if(primo == true)
			//Se muestra el mensaje
			System.out.print("Es primo");
			
	}
}
	