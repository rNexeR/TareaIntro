import java.util.Scanner;
public class Abc{
	public static void main(String[] args){
		char letras[] = new char[26];

		//Agregamos al arreglo todas las letras del abecedario
		for (int x = 97; x <= 122; x++) //a = 97 y z = 122 en la tabla ASCII
			letras[x - 97] = (char)x;

		//Titulo 1
		System.out.println("TODO EL ABECEDARIO"); 
		//Los valores de x corresponden a la enumeracion de los elementos del arreglo "letras"
		for (int x = 0; x < 26; x++)
			//Se imprime cada letra
			System.out.println(letras[x]);

		//Titulo 2
		System.out.println("\nEL ABECEDARIO SIN VOCALES");
		//Los valores de x corresponden a la enumeracion de los elementos del arreglo
		for (int x = 0; x < 26; x++){
			//Si un elemento del arreglo es igual a cualquier vocal, continuara con el ciclo y no imprimira nada
			if (letras[x] == 'a' || letras[x] == 'e' || letras[x] ==  'i' || letras[x] == 'o' || letras[x] == 'u')
				continue;
			//Si el elemento del arreglo no es igual a una vocal, la imprimira
			else
				System.out.println(letras[x]);
		}

		//Titulo 3
		System.out.println("\nEL ABECEDARIO DE DOS EN DOS");
		//Los valores de x corresponden a la enumeracion de los elementos del arreglo, pero aqui aumentan de dos en dos
		for (int x = 0; x < 26; x+=2)
			//Se imprime cada letra
			System.out.println(letras[x]);
	}
}