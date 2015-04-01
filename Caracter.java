import java.util.Scanner;

public class Caracter{
	public static void main (String[]args){
		Scanner rd= new Scanner (System.in);
		String palabra;
		System.out.println("ingrese palabra");
		palabra=rd.next();
		char[]array=palabra.toCharArray();
		for(int i=0; i<array.length; i++)
			System.out.print(array[i]+"\n");
        
	}
}