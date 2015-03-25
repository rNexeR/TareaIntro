// NOMBRE DEL PROGRAMA: LETRAS.JAVA
// NOMBRE DEL ALUMNO: LUIS ALFREDO ALVAREZ RAMIREZ
// CUENTA: 21511105
//
import java.util.Scanner;	
public class Letras{
	public static void main(String[] args) {
	Scanner rd = new Scanner(System.in);
	String palabra;
	char letra;
	System.out.print("Escriba una palabra: ");
	palabra = rd.next(); // Espera que el usuario ingrese un valor
		for(int x = 0;x<palabra.length();x++){ // Ciclo que inicia con la variable x=0;Si x es menor que la longitud de la frase ingresada;a x se le suma 1
			letra = palabra.charAt(x); // el charAt(x) saca la letra en la posicion que trae x 
			System.out.println(letra); // Imprime en una linea la letra
		}
	}
}