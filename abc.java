
public class abc{

	public static void main(String[] args) {
		
	char abc[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
		
		int cant = abc.length;
		

		for(int x = 0; x<cant; x++){
			System.out.println(abc[x]);
		}

		for(int x =0; x<cant;x++){

		if(abc[x] == 'a' || abc[x] == 'e' || abc[x] == 'i' || abc[x] == 'o' || abc[x] == 'u'){
				System.out.println(" ");

			}else{

				System.out.println(abc[x]);
			}
		}


		for(int y = 0; y<cant; y+=2){

			System.out.println(abc[y]);
		}
	}
}