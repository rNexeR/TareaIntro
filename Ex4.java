import java.util.Scanner; 
public class Ex4{ 
	public static void main(String[]args){ 
		Scanner rd=new Scanner(System.in); 
		System.out.print("Ingresa una palabra: "); 
		String palabra=rd.nextLine(); 
		String x=""; 
		for(int i=palabra.length()-1;i>=0;i--){ 
			x=x+palabra.charAt(i); 
		} 
		System.out.print(x); 
	} 
}