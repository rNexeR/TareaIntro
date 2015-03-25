import java.util.*;

public class al_reves{
	
	public static void main (String[] args){

	Scanner lea = new Scanner(System.in); //Declarar la variable lea 

	System.out.println("Ingrese una palabra"); //salida de texto 
	String palabra = lea.nextLine(); // el texto ingresado estara almacenado en variable palabra

	String reves=""; //la variable reves no tiene espacio


	for(int i = palabra.length()-1; i >= 0; i--) //la variable i es igual al length de la variable palabra menos 1 ;  i es mayor igual a 0 ; la variable i le restan 1

		reves = reves + palabra.charAt(i); // declaramos que reves es igual a reves mas el caracter (i) de la variable palabra

		System.out.println(reves); //imprimimos la palabra al reves

	}

}