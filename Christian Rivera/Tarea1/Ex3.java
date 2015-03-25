import java.util.Scanner;
public class Ex3{
	public static void main(String[] args){
		Scanner rd = new Scanner(System.in);
		System.out.print("Ingrese un numero: ");
		//se declara que el numero se debe ingresar como un entero
		int num= rd.nextInt();
		//x nos servira como contador
		int x;
		//el string y sirve como un espacio que se le puede ir concatenando a z
		String y =" ";
		String z ="";
		//x es cero por lo tanto se cumple el for y aumentara hasta llegar al valor de num
		for( x=0; x<num; x++){
			//aqui imprime un espacio y un asterisco normal
			System.out.print(z);
			System.out.println("*");
			//esta es la clave, z se ira aumentando mas 1 gracias a la y que se le concatena
			//si sumaramos z=z+z entonces el espeacio iria aumentando el doble
			z=z+y;
		}
	}
}
//este me costo tanto que me tarde 2 dias en hacerlo !!!!

