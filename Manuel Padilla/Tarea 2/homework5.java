import java.util.Scanner;
public class homework5{
	public static void main(String[] args) {
		Scanner rd = new Scanner(System.in);
		char letra[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
		int cant = letra.length;
		

		for(int x = 0; x<cant; x++){
			System.out.print(letra[x] + " ");
		}
		System.out.println("\nSegundo ciclo: ");

		for(int x =0; x<cant;x++){
			if(letra[x] == 'a' || letra[x] == 'e' || letra[x] == 'i' || letra[x] == 'o' || letra[x] == 'u'){
				System.out.print(" ");
			}else{
				System.out.print(letra[x] + " ");
			}
		}
		System.out.println("\nTercer ciclo: ");
		for(int y = 0; y<cant; y+=2){
			System.out.print(letra[y] + " ");
		}

	}
}