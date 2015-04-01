
import java.util.Scanner;
public class homework3{
	public static void main(String[] args) {
		Scanner rd = new Scanner(System.in);
		//Definir variables
        int num;
        //Exigir un numero
		System.out.print("Introduzca un numero: ");
		num = rd.nextInt();

		for(int y = 0;y<num;y++){//Establecer un contador que me sirva para la cantidad de asteriscos.
			
			for(int z = 0;z<y;z++){// Establecer otro contador para los espacios y que sea menor que el primer contador-
				
					System.out.print(" ");// para que me introduzca un espacio menos que la posicion en la que se encuentra.
					
					

				
				
				
				
			}
			System.out.println("*");// Imprimir los asteriscos.
		}

	}
}