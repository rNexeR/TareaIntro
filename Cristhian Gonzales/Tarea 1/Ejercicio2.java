import java.util.Scanner;
public class Ejercicio2{
	public static void main(String[] args){
		Scanner lea = new Scanner(System.in);
		String palabra;
		System.out.print("Introducir una palabra: ");// que iprim la palabra que introducí
		palabra = lea.next();
		int tamanio = palabra.length();
		for(int a = 0;a<tamanio;a++){
			char letra = palabra.charAt(a);
			System.out.println(letra);
		} 
	}
}