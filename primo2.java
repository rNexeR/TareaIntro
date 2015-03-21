import java.util.*; // importamos libreria para utilizar el scanner

public class primo2{ // iniciamos programa
	
	 public static void main(String[] args) {

	 	Scanner lea = new Scanner (System.in); //declaramos la variable lea para que nos sirva como scanner

	 	// declaramos las demas variables que usaremos
	 	int n; 
	 	int i;
	 	int a = 0;

	 	System.out.println( " Ingresar numero "); // Enviamos un mensaje al ususario que ingrese un numero
	 		n = lea.nextInt(); // el valor ingresado se almacena en la variable n

	 		for(i = 1; i < (n+1); i++)	// Con el ciclo for establecemos un rango, una comparacion y un contador
				
				if(n%i==0)	// si el remanente de n / i = 0 entonces que la variable a cuente 1 y diga que el numero ingresado no es numero primo 
					a++;

				if(a!=2)  // si el valor de a es distinto a 2 entonces que me diga que el numero ingresado es primo

					System.out.println(" No es un numero primo ");
				else
					System.out.println( " Es un numero primo ");

	 	}

}