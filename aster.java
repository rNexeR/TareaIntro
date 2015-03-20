import java.util.Scanner;
public class aster{
    public static void main(String[] args){

        //Definiendo las variables y asignando
        //al String "n" un espacio
        Scanner rd = new Scanner(System.in);
        int k, l;
        String m = "" , n = " " ;

        //Peticion de numero "k"
        System.out.print("Ingrese un numero: ");
        k = rd.nextInt();

        //Empezando desde "l" = 0 y aumentando "l"
        //de uno en uno, el programa imprime la
        //cantidad de espacios guardados en el
        //String "m", que iran aumentando conforme
        //se le va sumando el espacio del String "n"
        for( l = 0 ; l < k ; l++ ){
            System.out.print(m);
            System.out.println("*");
            m = m + n;
        }
    }
}