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
	
		
//			System.out.println(extraerNprimeros(sc));
			
//			System.out.println(extraerUltimosCaracteres(sc));
			
//			System.out.println(eliminarEspacioEnBlancoAlFinal(sc));
			
//			System.out.println(eliminarEspacioEnBlancoAlPrincipio(sc));
			
//			System.out.println(eliminarAPartirdeP(sc));
				
//			System.out.println(eliminarSubCadena(sc));
				
//			System.out.println(insertarCadena(sc));	
			
//			System.out.println(SustituirCadena(sc));
			
//			System.out.println(ContarNecesCadena(sc));
			
//			System.out.println(borrarSubcadena(sc));
			
			System.out.println(sustituirSubcadena(sc));
	
	
	
	
	}
	/******************************************************
	 * @param scanne sc
	 * @descripcion a. Extraer los n primeros caracteres de una cadena.
	 * ****************************************************/
	public static String extraerNprimeros(Scanner sc) {
		System.out.println("Introduce la cadena");
		String cadena=sc.nextLine();
		System.out.println("Introduce n primeros caracteres (dato Entero");
		int n=sc.nextInt();
		
		String nuevaCadena=cadena.substring(0, n);
		
		return nuevaCadena;
	}
	/***************************************************************
	   @param scanne sc
	 * @descripcion	b. Extraer los n últimos caracteres de una cadena.
	 * 
	 * *************************************************************/
	public static String extraerUltimosCaracteres(Scanner sc) {
		System.out.println("Introduce la cadena");
		String cadena=sc.nextLine();
		
		System.out.println("Introduce n(ultimos caracteres dato entero)");
		int n=sc.nextInt();
		
		
		String nuevaCadena=cadena.substring(cadena.length()-n, cadena.length());
		
		
		return nuevaCadena;
		
	}
	/***************************************************************
	 * @param scanne sc
	 * @descripcion	c. Eliminar los espacios en blanco que haya al final de la cadena.
	 * 
	 * *************************************************************/
	public static String eliminarEspacioEnBlancoAlFinal(Scanner sc) {
		System.out.println("Introduce la cadena");
		String cadena=sc.nextLine();
		
		String nuevaCadena=cadena.trim();
		return nuevaCadena;
		
	}
	/***************************************************************
	 * @param scanne sc
	 * @descripcion	c. Eliminar los espacios en blanco que haya al final de la cadena.
	 * 
	 * *************************************************************/
	public static String eliminarEspacioEnBlancoAlPrincipio(Scanner sc) {
		System.out.println("Introduce la cadena");
		String cadena=sc.nextLine();
		String nuevaCadena=cadena.replaceAll("^\\s+", "");
		return nuevaCadena;
		
	}
	
	/***************************************************************
	 * @param scanne sc
	 * @descripcion	e. Eliminar de una cadena los n caracteres que aparecen a partir de la posición p.
	 * 
	 * *************************************************************/
	public static StringBuilder eliminarAPartirdeP(Scanner sc) {
		System.out.println("Introduce la cadena");
		String cadena=sc.nextLine();
		System.out.println("Introduce p");
		int p=sc.nextInt();
		
		
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
	
	/***************************************************************
	 * @param scanne sc
	 * @descripcion	f. Eliminar la primera aparición de una cadena dentro de otra.
	 * 
	 * *************************************************************/
	public static String eliminarSubCadena(Scanner sc) {
		System.out.println("Introduce la cadena");
		String cadena=sc.nextLine();
		System.out.println("Introduce p");
		String subCadena=sc.nextLine();
		
		
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
	 * @param scanne sc
	 * @descripcion	g. Insertar una cadena dentro de otra a partir de la posición p.
	 * 
	 * *************************************************************/
	public static String insertarCadena(Scanner sc) {
		System.out.println("Introduce la cadena");
		String cadena=sc.nextLine();
		System.out.println("Introduce la cadena");
		String Subcadena=sc.nextLine();
		System.out.println("Introduce p");
		int p=sc.nextInt();
		
		String nuevaCadena=cadena.substring(p);
		String nuevaSubCadena=Subcadena;
		String nuevaPrincipioCadena=cadena.substring(0,p);
		
		return  nuevaPrincipioCadena+nuevaSubCadena+nuevaCadena;
		
		
	}
	/***************************************************************
	 * @param scanne sc
	 * @descripcion	h. Sustituir una cadena por otra.
	 * *************************************************************/
	public static String SustituirCadena(Scanner sc) {
		System.out.println("Introducir cadena");
			String cadena=sc.nextLine();
		System.out.println("Introducir Cadena a reemplazar");
			String cadenaNueva=sc.nextLine();
			
		String nuevaReemplazada=cadena.replaceAll(cadena, cadenaNueva);
		
		return nuevaReemplazada;
	}
	/***************************************************************
	 * @param scanne sc
	 * @descripcion	i. Contar el número de veces que aparece una cadena dentro de otra.
	 *  si la cadena principal es "Hola me llamo Alvaro" y la subcadena es "a", la expresión 
	 *  cadena.substring(i, i + subcadenaLength) tomará subcadenas de longitud 1 comenzando
	 *  desde cada posición i en la cadena principal y comparará esa subcadena con la subcadena
	 *  que estamos buscando. Así es como se comprueba si la subcadena que buscamos está presente
	 *  en la cadena principal.
	 * *************************************************************/
	public static int ContarNecesCadena(Scanner sc) {
		int veces=0;
		System.out.println("Introduce cadena");
		String cadena=sc.nextLine();
		System.out.println("Introduce cadena");
		String cadenaBuscar=sc.nextLine();
		
		
	
		int contador = 0;
	    int subcadenaLength = cadenaBuscar.length();
	    int cadenaLength = cadena.length();

	    for (int i = 0; i <= cadenaLength - subcadenaLength; i++) {
	        if (cadena.substring(i, i + subcadenaLength).equals(cadenaBuscar)) {
	            contador++;
	        }
	    }
	    return contador;
	}
	
	/***************************************************************
	 * @param scanne sc
	 * @descripcion	j. Borrar todas las apariciones de una cadena dentro de otra.
	 * *************************************************************/
	public static String borrarSubcadena(Scanner sc) {
	    System.out.println("Introduce cadena");
	    String cadena = sc.nextLine();
	    System.out.println("Introduce subcadena a borrar");
	    String subCadena = sc.nextLine();

	    int indice;
	    while ((indice = cadena.indexOf(subCadena)) != -1) {
	        String parteAnterior = cadena.substring(0, indice);
	        String partePosterior = cadena.substring(indice + subCadena.length());
	        cadena = parteAnterior + partePosterior;
	    }

	    return cadena;
	}
	/***************************************************************
	 * @param scanne sc
	 * @descripcion	k. Sustituir todas las apariciones de una cadena dentro de otra, por una tercera
	 * *************************************************************/
	public static String sustituirSubcadena(Scanner sc) {
	    System.out.println("Introduce cadena");
	    String cadena = sc.nextLine();
	    System.out.println("Introduce subcadena a reemplazar");
	    String subCadenaABuscar = sc.nextLine();
	    System.out.println("Introduce nueva subcadena");
	    String nuevaSubCadena = sc.nextLine();

	    int indice;
	    while ((indice = cadena.indexOf(subCadenaABuscar)) != -1) {
	        String parteAnterior = cadena.substring(0, indice);
	        String partePosterior = cadena.substring(indice + subCadenaABuscar.length());
	        cadena = parteAnterior + nuevaSubCadena + partePosterior;
	    }

	    return cadena;
	}
	
	
}
