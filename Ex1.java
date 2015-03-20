import java.util.Scanner;  
public class Ex1{  
    public static void main(String[] args) {  
        Scanner rd = new Scanner(System.in);
        //definir que i, a y num son enteros y a inicia como 0  
        int i,num,a=0;  
        System.out.println("Ingrese numero");
        //asignar valor para num
        num= rd.nextInt(); 
        // i comienza como 1 y con 1++ aumentara su valor por cada ciclo 
        for(i=1;i<(num+1);i++){ 
        //como un numero primo se divide entre 1 y el mismo entonces el if num%1==0 
            if(num%i==0){
        // y de igual manera el valor de a ira aumentando  
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
