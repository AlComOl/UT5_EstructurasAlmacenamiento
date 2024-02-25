package EjerciciosGitHub;
import java.util.*;
/**************************************************************
 * @Autor: Álvaro Comenge
 * @Fecha: 25/02/24
 * @Descripción: Invertir todas las palabras de una frase.
 ***************************************************************/
public class CadenasPrg_31 {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	
    	System.out.println("Introduce la frase a imvertir las palabras");
    	
        String frase = sc.nextLine();
        
        InvertirPalabras(frase);
       
    }
    
    public static void InvertirPalabras(String frase) {
    	
    	 StringBuilder fraseInvertida = new StringBuilder();
    	 
         for (int i = frase.length() - 1; i >= 0; i--) {
        	 fraseInvertida.append(frase.charAt(i));
         }
         System.out.println(fraseInvertida);
    }
}


	


