// NOMBRE DEL PROGRAMA: ASTE.JAVA
// NOMBRE DEL ALUMNO: LUIS ALFREDO ALVAREZ RAMIREZ
// CUENTA: 21511105
//
import java.util.Scanner;
public class Aste{
	public static void main(String[]asgr){
	Scanner rd = new Scanner(System.in);
	int x; // Es la variable que almacenara la cantidad de asteriscos.
	int z; // Es el primer contador que utilizaremos en el primer ciclo
	int y; // Es el segundo contador que utiliza el segundo ciclo
	System.out.println("Introduzca un numero:");
	x = rd.nextInt(); // Esperamos que el usuario ingrese un numero
		for(z=1;z<=x;z++){ // Ciclo que dice que se hara cuando z sea menor o igual a x y z aumentara 1.
			for(y=0;y<z;y++){ // Ciclo que dice que se hara cuando y sea menor que z 
				System.out.print(" "); // Imprime un espacio
			}
		System.out.println("*"); // Imprime un asterisco
		}
	}
}