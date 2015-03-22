import java.util.Scanner;
public class Amigos{
      public static void main(String[]args){
      Scanner rd = new Scanner(System.in);
      int x;
      int di=2;
      Booleon pri = false;
      System.out.print("ingrese un numero: ")
      x= rd.nextInt();
      while(!pri && di<x){
             if(x%di==0){
                pri=true
             }else{
                 di++;
             }
             }
}