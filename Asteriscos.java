import java.util.Scanner;

public class Asteriscos{
	public static void main (String[]args){
		Scanner rd= new Scanner (System.in);
		int n;
		System.out.println("ingrese un numero");
		n=rd.nextInt();
        System.out.println("la cantidad de * a mostrar son"+ "\n");
		for (int i=0;i<n;i++)
		System.out.println("-*-");
				
	}
}		
		

