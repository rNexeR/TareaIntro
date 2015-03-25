import java.util.Scanner;
public class homework2{
	public static void main(String[] args) {
		Scanner rd = new Scanner(System.in);
		//Definir variables
		 String palabra;
         //Solicitar una String
		 System.out.print("Ingrese una palabra: ");
		 palabra = rd.next();// Definir la variables

		 int size = palabra.length();// Definir una variable que me indique la cantidad de caracteres.

		 for(int y = 0;y < size;y++){// Establecer una variable igual a 0, que sea menor que size y que aumente uno despues de cada ciclo.
		 	char lector = palabra.charAt(y);//Definir una variable que indique que se empezara a leer el String desde y, osea desde 0.
		 	
		 	System.out.println(palabra.charAt(y));//Imprimir el caracter en y.
		 	if(y<=size){
		 		continue;//Si despues de imprimir el lector esta ubicado antes del final o al final de la palabra, que repita el proceso hasta que imprima el ultimo caracter.
		 	}
		 }
	}
}