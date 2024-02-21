package PalabraVersionArchivos;
/*********************************************************
 * @author Álvaro Comenge
 * 
 * @fecha 21/01/24
 * 
 * @descripcion main del vocabulario menu para aceder a las 
 * opciones de 1-cargar menu 2-traducir palabra 3-modificar
 * 4-eliminar
 * 
 * 
 * *******************************************************/

import java.util.*;



public class TestMainVocabulario {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int key;
		
		Vocabulario v=new Vocabulario();
		
		
		do {
		 Palabra.getMenu();
		 key=sc.nextInt();
		
		
			switch (key) {
			case 1: 
				v.cargarDiccionario();	
			
			break;
			case 2: 
				System.out.println("Introduce palabra a traducir");
				String p=sc.next();
				
				System.out.println("Introduce digito segun el idioma: \n 1-Espanol \n 2-Ingles \n 3-Frances");
				int idioma=sc.nextInt();
				v.buscarTraduccion(p,idioma);
			
			break;
			case 3:
				System.out.println("Introduce el nombre de la palabra que quieres modificar");
				String palabra=sc.next();
				System.out.println("Introduce la palabra nueva");
				String pamodificar=sc.next();
				
				v.modificarElemento(palabra,pamodificar);
				
			break;
			case 4:
				System.out.println("Introduce palabra a eliminar");
				String eliminar=sc.next();
				
				v.eliminarPalabra(eliminar);
				
			break;
			default:
				System.out.println("La opcion no esta contemplada");
			}
			
		}while(key!=5);
		
		
		
		
		sc.close();
	}

	

	
	
	
}
