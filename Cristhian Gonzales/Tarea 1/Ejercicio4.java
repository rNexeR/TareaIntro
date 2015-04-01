import java.util.Scanner;
public class Ejercicio4{
	public static void main(String[] args){
		Scanner lea = new Scanner(System.in);
		System.out.println("Ingresa una frase o palabra: "); // que lea la palabra que yo ingrese
		String palabra = lea.nextLine();
		String letra =""; // debemos de iniciar la variable.
		for(int a=palabra.length()-1;a>=0;a--) // cree un for de -1 para que lea al reves la palabra
		{ 
		letra=letra+palabra.charAt(a);
		} 
		System.out.print(letra); // que imprima el cambio ya hecho
		

	}
}