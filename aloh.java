import java.util.Scanner;
public class aloh{
    public static void main(String[] args){

        //Declarando las variables, asignandole un
        //String vacio al String "x"
        Scanner rd = new Scanner(System.in);
        String w, x = "";

        //Solicitando la palabra
        System.out.print("Ingrese una palabra: ");
        w = rd.nextLine();

        //Empezando desde el final y retrocediendo
        //desde ese punto hasta llegar a 0, se imprime
        //el String "x", el cual sera igual al caracter
        //sacado de la palabra en la posicion "i"
        for( int i = w.length() - 1 ; i >= 0  ; i-- ){
            x = x + w.charAt(i);
        }

        //Se imprime el resultado
        System.out.println(x);
    }
}