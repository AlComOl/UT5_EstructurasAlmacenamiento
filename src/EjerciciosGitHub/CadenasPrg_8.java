package EjerciciosGitHub;
import java.util.*;
/********************************************************************
 * @author Álvaro Comenge
 * 
 * @fecha 20/02/24
 * 
 * @descripcion
 * Ingresar una cadena de caracteres y obtener otra con todos los caracteres de las posiciones impares de la cadena.
 * 
 * 
 * *******************************************************************/
public class CadenasPrg_8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
	System.out.println("Introduce la cadena a tratar");
	
		String cadena=sc.nextLine();
	
		 
		System.out.println(obtenerImpares(cadena));		
		

	}
	public static String obtenerImpares(String cadena) {	
		
		StringBuffer impares=new StringBuffer();
		
		for(int i=0;i<cadena.length();i+=2) {
		
			impares.append(cadena.charAt(i));
		
		}
		
	return impares.toString();
	}

}
