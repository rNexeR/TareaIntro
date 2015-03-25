import java.util.Scanner;
public class homework1{
	public static void main(String[] args) {
		Scanner rd = new Scanner(System.in);
        //Definir variables
		int num;
        int x = 2;
        Boolean y = false; //Definir una interrogante

		System.out.print("Introduzca numero: ");

		num = rd.nextInt();
		
		while(!y && x<num){ //Que se desarrolle mientras "y" sea true y x menor que el numero introducido.
			if(num%x==0){//si el porciento del numero entre x=2 es 0, entonces el boolean es true, y el numero no es primo.
				y = true;

			System.out.println("El numero " + num + " no es primo");//Si es true imprimir que no es primo
			break; //finalizar la accion.
		
			}else{//Pero si el porciento de numero entre x es 0.
				x++;// Entonces la variable x aumentara 1 y realizara la division de nuevo hasta que llegue al numero.
			}
		}
		if(y == false){//Si al final de comprobar todos los divisores "x", todos los resultados son diferentes de 0. el boolean se hace falso, por lo tanto el numero es primo.
			System.out.println("El numero " + num + " es primo");// Imprimir que es primo.
		}
        }
}