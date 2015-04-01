import java.util.Scanner;

public class Primo{
	public static void main(String[] args){
         
         Scanner rd = new Scanner(System.in);
        int a;//primera variable
        int b=0;//segunda variable
         System.out.println("Ingrese numero");//muestra el mensaje para ingresar un numero. 
         a=rd.nextInt();  
         for(int i=1;i<=a;i++){  //el numero a debe ser mayor o igual a uno y ser positivo.
         if(a%i==0){ //el resutado de la division entre la variable cambiante y la fija debe ser igual a 0. 
            b=b+1; //el resultado del numero es divisible entre si mismo y el 1.
            }  
         }  
         if(b==2){ //condicion de si la variable es igual a dos.
              System.out.println("Es un numero Primo"); //aparecera el mensaje que es numero primo.
            }else{  
                System.out.println("No es un numero Primo"); //aparecera el mensaje que no es numero primo.  
         }  
     }  
}  