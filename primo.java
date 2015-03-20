import java.util.Scanner;
public class primo{
    public static void main(String[] args){
        Scanner rd = new Scanner(System.in);
        //Declarando las variables y asignando el valor
        //de 0 a una variable contador "x"
        int n, i, x = 0;

        //Peticion de ingreso de variable "n"
        System.out.print("\nIngrese un numero: ");
        n = rd.nextInt();

        //Condicional que verificara si el numero
        //ingresado es divisible entre 1 y el mismo
        for ( i = 1 ; i < n + 1 ; i++ ){
            if(n % i == 0){
                //el valor de "x" aumentara por uno cada vez
                //que el residuo de "n" entre "i" sea cero
                x++;
            }
        }
        //Al final, si "x" llego a sumarse hasta 2, significa
        //que hubieron mas numeros que dividian "n", aparte
        //de 1 y el mismo. Por lo tanto, imprime que el numero
        //no resulta ser un numero primo.
        if ( x != 2 ){
            System.out.println(n + " no es numero primo.");
        }else{
            System.out.println(n + " es numero primo.");
        }
    }
}