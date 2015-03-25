// NOMBRE DEL PROGRAMA: INVER.JAVA
// NOMBRE DEL ALUMNO: LUIS ALFREDO ALVAREZ RAMIREZ
// CUENTA: 21511105
//
import java.util.Scanner; 
public class Inver{ 
public static void main(String[]args){ 
Scanner rd = new Scanner(System.in); 
System.out.println("Escriba una frase o palabra"); //Linea de codigo que imprime una intruccion para el usuario 
String palabra = rd.nextLine(); // Este linea espera que el usuario ingrese la informacion
String letra = ""; // Siempre tenemos que iniciar la variable letra  
	for(int x=palabra.length()-1;x>=0;x--){ // Ciclo que cuenta las letras que trae la variable palabra, si x es mayor o igual a 0 va revisar si es menor el ciclo de detiene.
	letra=letra+palabra.charAt(x); // en el charAt() el valor que trae x es la ultima letra de la frase o palabra cada ves que llega en este punto la variable x va venir con un valor menor que el anterior haste llegar con O. 
	} 
	System.out.print(letra); //Imprime las letras del la frases de la ultima hasta la primera. 
	} 
}