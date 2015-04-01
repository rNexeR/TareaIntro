import java.util.Scanner;   //libreria de scanner
public class JavaApplication5 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n;                                       //declarar variables de scanner y los enteros
    do{                                          //un while para que opere infinitamente
    System.out.println("\nIngrese un numero: "); //texto para ingresar el numero
    n = sc.nextInt();                            //scannear eñ numero 
    if(n == 2 || n == 3 || n == 1 || n % 2 > 0 || n % 3 > 0){    //se establece un if y la operacion para ver si es primo o no
        System.out.println("El numero es primo.");
    }
    else{ 
        System.out.println("El numero no es primo.");           //el sistema analiza si se cumple o no la operacion para ver si es o no es primo
    }
    }while(true);
    }
}   https://slidebean.com/p/T7MG7ZXQP1/Github
