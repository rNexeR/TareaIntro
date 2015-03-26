import java.util.Scanner;
public class fibonacci {
    public static void main(String args[]) {
 
        System.out.print("Ingresar numero de la serie Fibonacci: ");
        int numero = new Scanner(System.in).nextInt();
 
        System.out.println("\n\nSerie Fibonacci hasta " + numero +" numeros : ");
       
        for(int i=1; i<=numero; i++){
            System.out.print(RecursionFibonacci(i) +" ");
        }
    } 
    public static int RecursionFibonacci(int numero){
        if(numero == 1 || numero == 2){
            return 1;
        }
 
        return RecursionFibonacci(numero-1) + RecursionFibonacci(numero -2); 
    }
 
    public static int fibonacciLoop(int numero){
        if(numero == 1 || numero == 2){
            return 1;
        }
        int fibo1=1, fibo2=1, fibonacci=1;
        for(int i= 3; i<= numero; i++){
            fibonacci = fibo1 + fibo2; 
            fibo1 = fibo2;
            fibo2 = fibonacci;
 
        }
        return fibonacci; 
    }     
}