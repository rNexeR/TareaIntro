 public class Ex5{
    public static void main(String args[]){

    	char abc[]="abcdefghijklmnopqrstuvwxyz".toCharArray();
		System.out.println("\n" + "Abecedario");
    	for ( int i = 0 ; i < 26 ; i++){

    		System.out.println(abc[i]);
    	}
		System.out.println("\n" + "Abecedario sin vocales");

    	for(int x=0;x<26;x++){
    		switch(abc[x]){
    			case 'a': case 'e': case 'i': case 'o': case 'u':
    			break;
    			default : System.out.println(abc[x]);
    		}
    	}
        System.out.println("\n" + "Abecedario de 2 en 2");
        int y=0;
        while(y<26){
            System.out.println(abc[y]);
             y=y+2;
        } 
    }
}
