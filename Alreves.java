import java.util.Scanner;

public class Alreves{
	public static void main (String[]args){
		Scanner rd= new Scanner (System.in);
		String a;//primera variable
		String b;//segunda variable
        System.out.println("ingrese una palabra");//mensaje de ingresar una variable
        a=rd.next();
        b="";
        for(int i=a.length()-1;i>-1;i--)//se utiliza el -1 y se dice que la variable i debe ser mayor que -1 para que tome en consideracion desde la primera letra y asi se escriba en reverso.
        {
        b=b+a.charAt(i);//la variable es igual a los caracteres pero puestos de manera contraria o al reves.	
        }
        System.out.println(b);//impresion de la palabra ya escrita de manera contraria.
    }
}        

