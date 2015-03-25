import java.util.Scanner;
public class Ex2{
	public static void main(String[] args){
//definir la variable de scanner para importar
		Scanner rd = new Scanner(System.in);
//declarar la string que se quiere ingresar
		String palabra;
//darle salida a la instruccion para el usuario seguida del ingreso de texto
		System.out.print("Ingrese una palabra: ");
		palabra= rd.next();
//defino un entero que represente la cantidad de caracteres que tiene el string
		int size=palabra.length();
//declaro que x=0 para que se unique en el primer caracter de la palabra y este continuara
//hasta que llegue a ser igual al total de letras en la palabra
		for( x=0; x<size; x++){
//se declara un char que convierta la palabra en char y se seleccionar el caracter 
//deseado gracias a x que aumentara con cada ciclo e imprimira el caracter posicionado en ese ciclo
			char primero= palabra.charAt(x);
			System.out.println(primero);
		}
	}
}