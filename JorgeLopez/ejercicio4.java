import java.util.Scanner;     //declarar la libreria scanner
public class JavaApplication12 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); //declara la variable scanner
System.out.println("Ingresa una palabra"); //texto
String cad = sc.nextLine();     //scanee la palabra           
String aux="";                      //declaramos la variable que imprimira la palabra al reves
for(int i=cad.length()-1;i>=0;i--)  //operacion para darle vuelta a la palabra
{ 
aux=aux+cad.charAt(i);       
} 
System.out.println(aux);          //palabra impresa
    }
    
}
