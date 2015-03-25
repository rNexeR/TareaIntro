import java.util.Scanner;       //declaramos scanner
public class JavaApplication13 {

    public static void main(String[] args) {
       int numero;  //declaramos variables
       Scanner sc = new Scanner(System.in);
       System.out.print("Ingrese un numero: ");  //texto para ingresar un numero
       numero = sc.nextInt();                    //scannear ese numero
      
       while(numero>0){                    //un while para que no ingresen negativos y sus respectivos contadores para ingresar la linea de asteriscos
           for(int n = 0; n<numero; n++){
               System.out.print("*");
           }
           System.out.print("\n");
           numero=numero-1;              
       }
    }
    
}
