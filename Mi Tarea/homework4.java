import java.util.Scanner;
public class homework4{
public static void main(String[] args) {
	Scanner rd = new Scanner(System.in);
    //Definir variables
	String palabra;
    //Solicitar una String.
	System.out.print("Ingrese una palabra: ");
	palabra = rd.next();
    //Definir una variable que me indique el numero de caracteres.
	int size = palabra.length();

	for(int x = size-1; x<size;x--){//Establecer una variables "x" que empiece desde el caracter (que sea size -1) para ubicarse en el ultimo caracter, y despues que disminuya en uno despues de cada ciclo.
		char lector = palabra.charAt(x);//Definir un lector que empiece a leer desde x(o sea desde el ultimo caracter)
		System.out.println(palabra.charAt(x));//Imprimir ese caracter.

		if(x>0){//Si "x" sigue ubicado despues del primer caracter
			continue;//que repita la operacion
			}else if(x==0){//hasta que se ubica en la posicion igual a 0
		    break;//Si se encuentra en 0 que finalice el proceso.
		}
	}
}
}