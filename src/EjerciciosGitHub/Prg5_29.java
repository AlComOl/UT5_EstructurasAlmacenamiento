package EjerciciosGitHub;
import java.util.*;
/**************************************************************************************************
 * 
 * @author Álvaro Comenge
 * 
 * @Fecha 17/02/24
 * 
 * @descripcion 
 *   Se tiene una lista de 12 nombres de alumnos/as. Escribia un programa que ordene la lista por orden
 *   alfabético y posteriormente solicite el nombre de un alumno y busque si el nombre está en la lista, 
 *   imprimiendo el nombre y lugar que ocupa.
 * ***************************************************************************************************/
public class Prg5_29 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int key=0;
		
		String personas[]=new String[12];
		
		do {
			getMenu();
			key=sc.nextInt();
			switch (key) {
			case 1: 
				CargarLista(personas,sc);
			
			break;	
			
			case 2: 
				ordenarLista(personas);
				MostrarLista(personas);
			
			break;	
			
			case 3: 
				System.out.println("Introduce nombre a buscar en la lista");
				String nombre=sc.next();
				int pos=buscarPers(personas,nombre);
				if(pos>1) {
					System.out.println("El "+nombre+" buscado esta en la posicion "+pos);
				}else if(pos<0){
					System.out.println("El "+nombre+" buscado no esta en la lista");
				}
			break;
			
			case 4: 
				System.out.println("Adios. Gracias por usar el programa.");
			break;	
			default: System.out.println("Opción no válida. Por favor, selecciona una opción válida.");
				
			}	
			
		}while(key!=4);
	}
	
	
	public static void CargarLista(String personas[],Scanner sc ) {
		/*********************************************************
		 * @author Álvaro Comenge
		 * @param lista de personas
		 * @scanner
		 * 
		 * @descripcion carga lista de personas.
		 * *******************************************************/
		
		for(int i=0;i<personas.length;i++) {
			System.out.println("Introduce persona");
			personas[i]=sc.next();
		}
	}
	
	public static void getMenu() {
		/*********************************************************
		 * @author Álvaro Comenge
		 * @descripcion Muestra el menu
		 * 
		 * *******************************************************/
		 
		System.out.println("\n Menu:");
		System.out.println("\n 1-Cargar Lista");
		System.out.println("\n 2-Ordenar/Mostrar Lista");
		System.out.println("\n 3-Buscar Nombre");
		System.out.println("\n 4-Salir");
	}
	
	public static void ordenarLista(String persona[]) {
		/*********************************************************
		 * @author Álvaro Comenge
		 * @param lista de personas.
		 * @nombre a buscar.
		 * 
		 * @descripcion Ordena mediante la clase Arrays.sort los
		 * elementos del array
		 * 
		 * *******************************************************/
		
		Arrays.sort(persona);	
	}
	
	public static int  buscarPers(String persona[],String nombre) {
		/*********************************************************
		 * @author Álvaro Comenge
		 * @param lista de personas
		 * @param nombre a buscar
		 * 
		 * @descripcion Busca el nombre en la lista de personas[]
		 * devolviendo la posicion o -1
		 * *******************************************************/
		boolean encontrado=false;
		int pos=-1;
		for(int i=0;i<persona.length&&encontrado==false;i++) {
			if(nombre.equalsIgnoreCase(persona[i])) {
				encontrado=true;
				 pos=i;
			}
			
		}
		
		return pos;
	}
	
		
	
	
	public static void MostrarLista(String personas[]) {
		/*********************************************************
		 * @author Álvaro Comenge
		 * @param lista de personas.
		 * 
		 * @descripcion Muestra el array con un foreach
		 * 
		 * *******************************************************/
		for(String persona:personas) {
			System.out.println(persona);
		}
	}

}
