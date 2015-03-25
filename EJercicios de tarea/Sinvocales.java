 
public class Sinvocales{ 

public static void main(String[] args) {  
String palabra = "abcdefghijklmnopqrstuvwxyz"; 
char l; 
for (int i = 0; i < palabra.length(); i++) { 

if (palabra.charAt(i) != 'a' 
&& palabra.charAt(i) != 'e' 
&& palabra.charAt(i) != 'i' 
&& palabra.charAt(i) != 'o' 
&& palabra.charAt(i) != 'u') { 

System.out.println(palabra.charAt(i)); 
} 
} 
} 
} 
