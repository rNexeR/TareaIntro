//Realizar un programa que me imprima una cadena ingresada por el 
//usuario, pero al reves. Por ejemplo: si ingreso Hola, me imprima aloH.
import java.util.Scanner;
public class Ejercicio4{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		//aqui la persona ingresa una palabra
		String palabra = scan.next();

		//este for toma la lengitud de la palabra ingresada en lugar de sumar
		//le resta desde su ultimo valor en el string para devolverla en reversa
		for(int i = palabra.length()-1; i >= 0; i--){
            System.out.println(palabra.charAt(i));
        }
        

	}
}