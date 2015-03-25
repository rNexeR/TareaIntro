import java.util.Scanner;
public class Ejercicio1{
	public static void main(String[] args){
	Scanner rd = new Scanner(System.in);
         int a=0,i,n; // 3 variables: a para el resultado, i para contador y n para lo que el usuario  ponga 
         System.out.println("Ingrese numero: ");  
         n=rd.nextInt();  
         for(i=1;i<(n+1);i++){  // cree un for para una accion de 1 hasta n
         if(n%i==0){  
            a++; // a suma 1  
            }  
         }  
         //para saber si es primo
         if(a!=2){  
              System.out.println("No es Primo");  
         }else{
			  System.out.println("Si es Primo");
         }  
	}
}