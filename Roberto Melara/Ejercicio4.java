import java.util.Scanner;
public class Ejercicio4{
	public static void main(String[] args){
	//Realizar un programa que me imprima una cadena ingresada por el usuario, pero al reves.
		Scanner lea = new Scanner(System.in);
		String palabra;
		int cant;

		//Programa.
		System.out.println("A continuacion se le solicitara que ingrese una palabra.");
		System.out.println("Seguidamente, dicha palabra sera desplegada verticalmente.");

		System.out.println("Porfavor ingrese una palabra: ");
		palabra = lea.next(); // Aqui se almacena la palabra ingresada por el usuario.
		cant = palabra.length(); // Aqui se encuantra el tamano de la palabra y lo almacena en un int.

		do{
			System.out.print(palabra.charAt(cant-1)); // cant -1, porque la cant cuenta desde 1 y el char se ubica contando desde 0.
			cant --; //Cant -- para que se mueva una posicion hacia la Izquierda.
		}while(cant >= 1); // Cant >= porque si es 0, llega a cero y trata de ubicar la pos. -1 y como no la encuentra presenta conflicto.
	}
}
//Trate de usar un metodo distinto pero que funcionara.