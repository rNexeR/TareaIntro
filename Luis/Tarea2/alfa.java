// NOMBRE DEL PROGRAMA: alfa.JAVA
// NOMBRE DEL ALUMNO: LUIS ALFREDO ALVAREZ RAMIREZ
// CUENTA: 21511105
//
import java.util.Scanner;
public class alfa{
	public static void main(String[]args){
	Scanner rd = new Scanner(System.in);
	char abc[] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		for(int x=0;x<abc.length;x++){
		System.out.print(abc[x] + " ");
		}
		System.out.println(" ");
		for(int x=0;x<abc.length;x++){
			if(abc[x]==abc[0] || abc[x]==abc[4] || abc[x]==abc[8] || abc[x]==abc[14] || abc[x]==abc[20]){
				System.out.print("  ");
			}else{
				System.out.print(abc[x] + " ");	
			}
		}
		System.out.println(" ");
		for(int x=0;x<abc.length;x+=2){
			System.out.print(abc[x] + " ");
			System.out.print("  ");
		}
	}
}