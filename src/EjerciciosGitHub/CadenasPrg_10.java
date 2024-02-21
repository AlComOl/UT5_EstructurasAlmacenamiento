package EjerciciosGitHub;
import java.util.*;
/***************************************************************************
 * @autor Álvaro Comenge
 * 
 * @fecha 21/02/24
 * 
 * @descripcion Ingresar una frase y modificarla convirtiendo el primer carácter
 *  de cada palabra si esta fuera una letra, de minúsculas a mayúsculas.
 * 
 * 
 * *************************************************************************/
public class CadenasPrg_10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Introduce la frase");
		String frase=sc.nextLine();
		
	System.out.println(aMayuscula1caracter(frase));
		sc.close();
	}

	
	public static String aMayuscula1caracter(String cadena) {
		StringBuilder cadenaMayusculas=new StringBuilder();
		for(int i=0;i<cadena.length();i++) {
			if(cadena.charAt(i)==' '){
				 if(i+1<cadena.length()) {
					 cadenaMayusculas.append(Character.toUpperCase(cadena.charAt(i+1)));
				 }else {
					 cadenaMayusculas.append(cadena.charAt(i));
				 }
			}
			
			
		}
		
		return cadenaMayusculas.toString();
	}
}
