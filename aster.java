import java.util.Scanner;
public class aster{
    public static void main(String[] args){
        Scanner rd = new Scanner(System.in);
        int k, l;
        String m = "" , n = " " ;

        System.out.print("Ingrese un numero: ");
        k = rd.nextInt();

        for( l = 0 ; l < k ; l++ ){
            System.out.print(m);
            System.out.println("*");
            m = m + n;
        }
    }
}