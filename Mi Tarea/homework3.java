
import java.util.Scanner;
public class homework3{
	public static void main(String[] args) {
		Scanner rd =  new Scanner(System.in);

		int x, y;

		System.out.print("Ingrese un numero: ");
		x = rd.nextInt();
        y = 0;

        for(y=0;y<x;y++){
				System.out.println("*");
				for(z=0;z<y;z++){
					System.out.println(" ");
				}
				if(y<x){
					continue;
				}else{
					break;
				}
	    }
    }
}