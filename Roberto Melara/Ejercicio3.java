import java.util.Scanner;
public class Ejercicio3{
	public static void main(String [] args){
		//Programa que solicite un entero y que luego imprima esa cantidad de veces asteriscos en lineas diferentes. En cada linea nueva, debe de agregarse un espacio.
		//Declaracion de Variables.
		Scanner lea = new Scanner(System.in);
		int cant;

		//Programa.
		System.out.println("A continuacion se le solicitara un numero.");
		System.out.println("En base a ese numero se creara un arreglo de asteriscos.");
		System.out.println("Por favor, introduzca un numero: ");
		cant = lea.nextInt(); // Se alamcena el valor ingresado por el usuario.
		
		for(int ast = 0; ast < cant; ast ++){ //Se indica que se hara en base al numero ingresado por el usuario.
			for(int esp = 0 ; esp < ast ; esp ++){ //Se indica medinte el contador como se desplegaran los espacios.
				System.out.print(" "); //Se indica la impresion del espacio.
			}
			System.out.println("*"); //Se indica la impresion del asterico.
		}
	}
}