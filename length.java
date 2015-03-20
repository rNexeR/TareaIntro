import java.util.Scanner;
public class length{
    public static void main(String[] args){

        //Definiendo las variables
        Scanner rd = new Scanner(System.in);
        String in;
        char out;
        int n, l;

        //Solicitando la palabra para el String "in"
        System.out.print("\nIngrese una palabra: ");
        in = rd.next();

        //Hasta este punto es que se define el valor
        //de "l" como el length del String "in"
        l = in.length();

        //Empezando desde "n = 0" y sumando 1 a "n" cada vez
        //que termina la condicion "for", siempre que "n" sea
        //menor que el length de "in", va a imprimir
        //el caracter en la posicion "n" del String "in"
        for( n = 0 ; n < l ; n++ ){
            out = in.charAt( n );
            System.out.print("\n\t" + out);
        }
        System.out.print("\n");
    }
}