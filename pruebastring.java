import java.util.*; 


public class pruebastring {

	public static void main(String[] args) {


		String letra; // declaramos la string letra
		Scanner lea = new Scanner (System.in); //declaramos la variable lea

		System.out.println(" Ingresar palabra "); //le decimos al usuario que ingrese una palabra
			letra = lea.nextLine(); //la palabra ingresada estara almacenada en letra
			
			String cadena = letra ; //declaramos la string cadena que es igual a letra

			for(int f=0; f<letra.length(); f++) // declaramo que la variable f es igual a 0; la variable f es menor a letra.lenght; sumamos 1 a la varible f

            System.out.println(letra.charAt(f)+"\n"); // imprimimos el texto ingresado

			
		
	}
}