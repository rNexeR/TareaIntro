// NOMBRE DEL PROGRAMA: PRIMOS.JAVA
// NOMBRE DEL ALUMNO: LUIS ALFREDO ALVAREZ RAMIREZ
// CUENTA: 21511105
//
import java.util.Scanner;
public class Primos{
	public static void main(String[]args){
	Scanner rd = new Scanner(System.in);
	int x;
	int di=2;
	Boolean pri= false; // Primero inicializamos la varia pri como falsa
	System.out.print("Intruduzca un numero: ");
	x = rd.nextInt(); // Espera que el usuario ingrese un valor
	while(!pri && di<x){ // Ciclo que se ejecuta cuando pri sea falso y di sea menor que x
			if(x%di==0){ // Decision que si x es dirisible entre di y sea igual que 0
				pri=true; // pri va se verdadera
			}else{
				di++; // Se le aumenta uno a di
			}	
		}
	if(pri){ // Si pri es verdadera
		System.out.println("El numero " + x +" es primo");
	}else{
		System.out.println("El numero " + x + " no es primo");
	}
	}
}