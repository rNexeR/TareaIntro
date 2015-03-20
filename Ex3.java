import java.util.Scanner;
public class Ex3{
	public static void main(String[] args){

		Scanner rd = new Scanner(System.in);

		System.out.print("Ingrese un numero: ");
		int num= rd.nextInt();
		int x;
		String y =" ";
		String z ="";
		for( x=0; x<num; x++){
			System.out.print(z);
			System.out.println("*");
			z=z+y;
		}

	}
}

