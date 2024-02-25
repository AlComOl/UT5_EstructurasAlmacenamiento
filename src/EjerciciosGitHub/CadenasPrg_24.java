package EjerciciosGitHub;
import java.util.*;
/**************************************************
 * @autor Álvaro Comenge 
 * 
 * @fecha 24/02/24
 * 
 * @descripcion Dada una cadena de caracteres. Realizar lo siguiente:
a. Extraer los n primeros caracteres de una cadena.
b. Extraer los n últimos caracteres de una cadena.
c. Eliminar los espacios en blanco que haya al final de la cadena.
d. Eliminar los espacios en blanco que haya al comienzo de la cadena.
e. Eliminar de una cadena los n caracteres que aparecen a partir de la posición p.
f. Eliminar la primera aparición de una cadena dentro de otra.
g. Insertar una cadena dentro de otra a partir de la posición p.
h. Sustituir una cadena por otra.
i. Contar el número de veces que aparece una cadena dentro de otra.
j. Borrar todas las apariciones de una cadena dentro de otra.
k. Sustituir todas las apariciones de una cadena dentro de otra, por una tercera
 * 
 * 
 * *************************************************/
public class CadenasPrg_24 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce cadena");
		String cadena=sc.nextLine();
		System.out.println("Introduce n primeros caracteres de la cadena");
		int n=sc.nextInt();
		
	System.out.println(extraerNprimeros(cadena,n));
	
	System.out.println(extraerUltimosCaracteres(cadena,n));
	
	System.out.println(eliminarEspacioEnBlancoAlFinal(cadena));
	
	System.out.println(eliminarEspacioEnBlancoAlPrincipio(cadena));
	
	System.out.println(eliminarAPartirdeP(1,cadena));
	
	
	eliminarSubCadena(epe,holamellamoPepe);
	
	}

	public static String extraerNprimeros(String cadena,int n) {
		/******************************************************
		 * @author acome
		 * @param cadena
		 * @param numero donde termina la cadena
		 * @descripcion extrare la cadena mediante la duncion substring 
		 * de subcadenas pasando el principio de la cadena u el n numero final.
		 * ****************************************************/
		
		String nuevaCadena=cadena.substring(0, n);
		
		return nuevaCadena;
	}
	
	public static String extraerUltimosCaracteres(String cadena, int n) {
		/***************************************************************
		 * @author acome
		 * @param
		 * @param
		 * @descripcion	
		 * 
		 * *************************************************************/
		
		String nuevaCadena=cadena.substring(cadena.length()-n, cadena.length());
		
		
		return nuevaCadena;
		
	}
	
	public static String eliminarEspacioEnBlancoAlFinal(String cadena) {
		/***************************************************************
		 * @author acome
		 * @param
		 * @param
		 * @descripcion	Eliminar los espacios en blanco que haya al final de la cadena.
		 * 
		 * *************************************************************/
		String nuevaCadena=cadena.trim();
		return nuevaCadena;
		
	}
	public static String eliminarEspacioEnBlancoAlPrincipio(String cadena) {
		/***************************************************************
		 * @author acome
		 * @param
		 * @param
		 * @descripcion	Eliminar los espacios en blanco que haya al final de la cadena.
		 * 
		 * *************************************************************/
		String nuevaCadena=cadena.replaceAll("^\\s+", "");
		return nuevaCadena;
		
	}
	
	
	public static StringBuilder eliminarAPartirdeP(int p, String cadena) {
		boolean encontrado=true;
		StringBuilder nuevacadena=new StringBuilder();
		
		for(int i=0;i<cadena.length()&&encontrado;i++) {
			
			
			nuevacadena.append(cadena.charAt(i));
			
			if(i==p-1) {
				encontrado=false;
			}
		}
		
	return nuevacadena;	
	}
	
	public static HashSet<String> eliminarSubCadena(String subCadena, String cadena) {
		HashSet<String> cadenaHashSet=new HashSet();
		int i;
		
		cadenaHashSet.add(cadena);
		
		if(cadenaHashSet.contains(subCadena)==true) {
			for(String elemento:cadenaHashSet) {
				if(elemento.equalsIgnoreCase(subCadena)) {
				int pos=elemento.indexOf(cadena);
				
				for(i=0;i<subCadena.length();i++) 
					
				
				cadena.substring(i, pos);
					
				}
			}
		}
	return cadenaHashSet;	
	}
	
	
	
}
