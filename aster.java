import java.util.Scanner;

public class aster{
	public static void main(String[] args){

		Scanner lea = new Scanner(System.in);

		int x; //declaramos varibale x

		System.out.println("Ingrese un numero: "); //pedimos al usuario que ingrese un numero
		
		int num= lea.nextInt(); // el numero que ingreso lo ingresamos a la variable num
	
		String d =" "; // declaramos la string d como un espacio
		String c ="";	// declaramos la string c como ningun espacio
	
		for( x=0; x<num; x++){ // establecemos que x es igual a 0; x es menos a la variable num ; y que a x le sumamos 1
		
			System.out.print(c); //el resultado sale 

			System.out.println("*");// imprimimos el asterisco
			
			c=c+d; //aqui hacemos que el espacio se haga en cada linea
		}
	}
}