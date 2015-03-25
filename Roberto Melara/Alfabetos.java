public class Alfabetos{
	public static void main(String[] args){
		char alf[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
		int pos = alf.length;

		System.out.print("Alfabeto Completo.");
		//Alfabeto Completo.
		for(int x = 0; x < pos; x++){
			System.out.println(alf[x]);
		}

		System.out.println("Alfabeto sin vocales.");
		//Alfabeto sin vocales.
		for(int x = 0; x < pos; x++){
			if(x == 0 || x == 4 || x == 8 || x == 14 || x == 20){
				continue;
			}
			else{
				System.out.println(alf[x]);
			}
		}

		System.out.println("Alfabeto letra de por medio.");
		//Alfabeto letra de por medio.
		for(int x = 0; x < pos; x++){
			if(x % 2 !=0 ){
				continue;
			}
			else{
				System.out.println(alf[x]);
			}
		}	
	}
}