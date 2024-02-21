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
		/**************************************************
		 * @author acome
		 * 
		 * @param cadena a tratar
		 * 
		 *toma una cadena que le des y te devuelve otra cadena que solo 
		 *contiene los caracteres que están en las posiciones impares de la cadena original. 
		 *Es como si estuvieras sacando solo los caracteres que están en las posiciones 1, 3, 5, etc.
		 *
		 *StringBuffer: Se instancia un objeto de la clase StringBuffer llamado impares. 
		 *Este objeto se utilizará para construir la nueva cadena que contendrá los caracteres de las posiciones impares.
		 * 
		 * 
		 * 
		 * ************************************************/
		
		StringBuffer impares=new StringBuffer();
		
		for(int i=0;i<cadena.length();i=i+2) {//i+=2 salta 2 posiciones
		
			impares.append(cadena.charAt(i));//Obtiene el caracter de i , i como salta 2 posiciones si empieza en 0 sera impar
		
		}
		
	return impares.toString();//tostring muesta la cadena
	}

}
