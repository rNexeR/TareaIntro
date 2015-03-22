import java.util.Scanner;
public class Letras{
      public static vaig main(String[]args) {
      Scanner rd= new Scanner(System.in);
      String palabra;
      char letra;
      System.out.print("Escriba una palabra ");
      palabra = rd.next();
           for(int x =0;x<palabra.lenght();x--){
               letra = palabra.chartArt(x);
               System.out.printIn(letra);
        }
      }
} 