public class abecedario2{
	public static void main(String[] args){

		char abecedario[] = {'a',+'b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		int t = abecedario.length;

		for(int x = 0 ; x<t; x++){
			System.out.print(abecedario[x] + " ");
		}
		System.out.println("\nSegundo Ciclo: ");

		for(int x=0; x<t; x++){
			if(abecedario[x] == 'a' || abecedario[x] == 'e' || abecedario[x] == 'i' || abecedario[x] == 'o' || abecedario[x] == 'u'){
				System.out.print(" ");
			
			}else{
				System.out.print(abecedario[x] + " ");
			}
		}

			System.out.println("\nTercer Ciclo: ");
	for(int y = 0; y < t; y++){
		if(y%2 == 0)
		System.out.print(abecedario[y] + " ");
		}
	}
		
	}