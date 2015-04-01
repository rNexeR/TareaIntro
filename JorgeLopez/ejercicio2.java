package javaapplication14;

import java.util.Scanner;
public class JavaApplication14{
    public static void main(String[] args) {
    Scanner rd = new Scanner(System.in); //establecer variables
    String palabra;
    System.out.print("Ingrese una palabra: ");
    palabra = rd.next(); //escanear palabra 
    int size = palabra.length();    // declarar en una variable el numero de caracteres
    for(int x = 0;x < size;x++){  //x sera la posicion 0 y su contador para que sume al lado derecho y lea los caracteres
    char lector = palabra.charAt(x);  //empezar a leer desde x
    System.out.println(palabra.charAt(x));//Imprimir el caracter en 0 y que continuo imprmiendo los siguiente
		 	} 
		 }
	}
}
