import java.util.Scanner;  
public class Ex1{  
    public static void main(String[] args) {  
        Scanner rd = new Scanner(System.in);  
        int i,num,a=0;  
        System.out.println("Ingrese numero");  
        num= rd.nextInt();  
        for(i=1;i<(num+1);i++){  
            if(num%i==0){  
                a++;  
            }  
        }  
        if(a!=2){  
            System.out.println("No es Primo");  
        }else{  
            System.out.println("Si es Primo");  
         }  
     }  
}  