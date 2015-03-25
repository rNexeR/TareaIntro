import java.util.Scanner;
public class Abecedario1{
	public static void main(String[] args){
		Scanner rd = new Scanner(System.in);
				
	for(char a='a';a<='z';a++){
		System.out.println(a);
		}
		System.out.println("\n fin Abecedario \n ");

		System.out.println("\n Comienza Sin Vocales \n ");
	for(int x=97;x<122;x++){
		if(x!='a' && x!='e' && x!='i' && x!='o' && x!='u')
			System.out.println((char)x);
		}
		System.out.println("\n fin Sin Vocales \n ");

		System.out.println("\n Comienza de 2 en 2 \n ");

	for(char a='a';a<='z';a+=2){
		System.out.println(a);	
		}
		System.out.println("\n fin de 2 en 2 \n ");
	}

}