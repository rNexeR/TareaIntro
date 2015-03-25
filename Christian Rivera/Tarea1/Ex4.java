import java.util.Scanner; 
public class Ex4{ 
	public static void main(String[]args){ 
		Scanner rd=new Scanner(System.in); 
		System.out.print("Ingresa una palabra: ");
		//se define el string
		String palabra=rd.nextLine(); 
		String x=""; 
		//la varible i al restarle 1 retrocede una posiscion
		//al estalecer i-- retrocedera una posicion mas por cada ciclo hasta legar a -1 donde el for es falso 
		for(int i=palabra.length()-1;i>=0;i--){ 
			x=x+palabra.charAt(i); 
		} 
		//se imprime la posicion actual de x pero como recorre desde la posicion maxima hasta cero lo imprime al reves
		System.out.print(x); 
	} 
}
