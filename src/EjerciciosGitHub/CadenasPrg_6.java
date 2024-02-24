package EjerciciosGitHub;
import java.util.*;
public class CadenasPrg_6 {
/***********************************************************************
 * 
 * @descripcion Ingresar una cadena y determinar cuantas palabras se 
 * encuentran en la cadena. Cada palabra se separa por medio de un espacio en blanco.
 * *********************************************************************/
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cont = 0;
        char anterior = ' ';
        String cadena;
     do {
        System.out.println("Introduce una cadena");
        
         cadena = sc.nextLine();
       
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) != ' ' && anterior == ' ') {
                cont++;
            }
            anterior = cadena.charAt(i);
        }
        
        System.out.println(cont);
     }while(!cadena.isEmpty());
    }

}
