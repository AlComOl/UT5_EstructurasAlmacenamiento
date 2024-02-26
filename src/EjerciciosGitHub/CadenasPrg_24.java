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
		
		
//		System.out.println("Introduce cadena");
//		String cadena=sc.nextLine();
//		System.out.println("Introduce n primeros caracteres de la cadena");
//		int n=sc.nextInt();
		
//	System.out.println(extraerNprimeros(cadena,n));
//	
//	System.out.println(extraerUltimosCaracteres(cadena,n));
//	
//	System.out.println(eliminarEspacioEnBlancoAlFinal(cadena));
//	
//	System.out.println(eliminarEspacioEnBlancoAlPrincipio(cadena));
//	
//	System.out.println(eliminarAPartirdeP(1,cadena));
		
//	System.out.println("Introduce sucadena");
//		String subCadena=sc.nextLine();
//		String resultado=eliminarSubCadena(cadena,subCadena);
//		System.out.println(resultado);	
		
		
	System.out.println(insertarCadena("Hola llamo Avaro","me",5));	
	
	
	}
	/******************************************************
	 * @author acome
	 * @param cadena
	 * @param numero donde termina la cadena
	 * @descripcion extrare la cadena mediante la duncion substring 
	 * de subcadenas pasando el principio de la cadena u el n numero final.
	 * ****************************************************/
	public static String extraerNprimeros(String cadena,int n) {
		
		
		String nuevaCadena=cadena.substring(0, n);
		
		return nuevaCadena;
	}
	/***************************************************************
	 * @author acome
	 * @param
	 * @param
	 * @descripcion	
	 * 
	 * *************************************************************/
	public static String extraerUltimosCaracteres(String cadena, int n) {
		
		
		String nuevaCadena=cadena.substring(cadena.length()-n, cadena.length());
		
		
		return nuevaCadena;
		
	}
	/***************************************************************
	 * @author acome
	 * @param
	 * @param
	 * @descripcion	Eliminar los espacios en blanco que haya al final de la cadena.
	 * 
	 * *************************************************************/
	public static String eliminarEspacioEnBlancoAlFinal(String cadena) {
		
		String nuevaCadena=cadena.trim();
		return nuevaCadena;
		
	}
	
	public static String eliminarEspacioEnBlancoAlPrincipio(String cadena) {
		
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
	
	public static String eliminarSubCadena(String cadena, String subCadena) {
//		hola me llamo alvaro	
		int posini=cadena.indexOf(subCadena);//empezamos subcadena
//		posini= sacaria la posicion 5 entero
		int posfin=posini+subCadena.length();
//		posfin=llamo alvaro
		
		String nuevaCadena=cadena.substring(0,posini);
		
		String  posdespues=cadena.substring(posfin);
	
	return nuevaCadena+posdespues;	
	}
	/***************************************************************
	 * @param
	 * @param
	 * @descripcion	g. Insertar una cadena dentro de otra a partir de la posición p.
	 * 
	 * *************************************************************/
	public static String insertarCadena(String cadena,String Subcadena, int p) {
		
		String nuevaCadena=cadena.substring(p);
		String nuevaSubCadena=Subcadena;
		String nuevaPrincipioCadena=cadena.substring(0,p);
		
		return  nuevaPrincipioCadena+nuevaSubCadena+nuevaCadena;
		
		
	}
	
	
}
