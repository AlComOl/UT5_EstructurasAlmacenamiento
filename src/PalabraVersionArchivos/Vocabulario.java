package PalabraVersionArchivos;
/*Estas clases son necesarias para manejar listas de elementos 
* y para leer la entrada del usuario desde la consola.*/
import java.util.ArrayList;
import java.util.Scanner;
/***************************************************************
 * @autor Álvaro Comenge
 * @descripcion Esta clase contiene métodos para buscar traducciones de palabras en diferentes idiomas
    y para cargar palabras en el diccionario.
 * @version ArrayList
 * @Fecha 20-2-2024
 * 
 *  
 * 
 * **************************************************************/


public class Vocabulario{
	/* vocabulario es un ArrayList que almacenará instancias de la clase Palabra, 
	   representando el diccionario*/
		 static ArrayList<Palabra> vocabulario=new ArrayList<Palabra>();
		static Scanner sc=new Scanner(System.in); 
		
		
		
			
		
		
		    public void buscarTraduccion(String palabra) {
		    	/****************************************************
		    	 * @author acome
		    	 * @param palabra a buscar
		    	 * @descripcion  Este método recibe una palabra como parámetro 
		    	 * y busca su traducción en el diccionario. Itera sobre el ArrayList
		    	 * de palabras y compara la palabra proporcionada con las palabras en español, 
		    	 * inglés y francés de cada instancia de Palabra. Si encuentra una coincidencia,
		    	 * imprime la traducción en los tres idiomas. Si no encuentra ninguna coincidencia, 
		    	 * imprime un mensaje indicando que la palabra no está en el diccionario.
		    	 * 
		    	 * **************************************************/
		    	boolean encontrado=false;
		    	
		    	for(Palabra Voca:vocabulario) {
		    		
		    		if(Voca.getEspanol().equalsIgnoreCase(palabra)&&!encontrado) {
		    			encontrado=true;
//		    			System.out.println(Voca.ingles);
//		    			System.out.println(Voca.frances);
		    			System.out.println(Voca.toString());
		    			
		    		}else if(Voca.getIngles().equalsIgnoreCase(palabra)&&!encontrado) {
		    			encontrado=true;
//		    			System.out.println(Voca.espanol);
//		    			System.out.println(Voca.frances);
		    			System.out.println(Voca.toString());
		    			
		    		}else if(Voca.getFrances().equalsIgnoreCase(palabra)&&!encontrado) {
		    			encontrado=true;
//		    			System.out.println(Voca.ingles);
//		    			System.out.println(Voca.espanol);
		    			System.out.println(Voca.toString());
		    		
		    		}
		    	}
		    	if(!encontrado) {
	    			System.out.println("la palabra no esta en el dicionario");
	    		}
		    		
		    	}
		    
		    public void cargarDiccionario() {
				/***********************************************************
				 * @author acome
				 * 
				 * @descripcion Este método se encarga de cargar palabras en
				 * el diccionario. Primero solicita al usuario el número de palabras
				 *  que desea ingresar (variable N). Luego, mediante un bucle, 
				 *  solicita al usuario que ingrese cada palabra en español, inglés y francés y 
				 *  crea una instancia de Palabra con esos datos para agregarla al diccionario.
				 * 
				 * ***********************************************************/
				String espanol;
			    String ingles;
			    String frances;
			    
			    int i,N;//numero de palabras a leer N 
			    
			    do {
			    	System.out.println("Numero de palabras a cargar DATO INT");
			    	N=sc.nextInt();
			    }while(N<0);
			    sc.nextLine();
			    
			    for(i=1;i<=N;i++) {
			    	System.out.println("Palabra "+i);
			    	System.out.println("Palabra en espanol");
			    	espanol=sc.nextLine();
			    	System.out.println("Palabra en Ingles");
			    	ingles=sc.nextLine();
			    	System.out.println("Palabra en Frances");
			    	frances=sc.nextLine();
			    	//introduzco en la instancia el valor
			    	Palabra instancia =new Palabra(espanol,ingles,frances);
				    //por medio de add la instancia en el arraylist<palabra>
				    vocabulario.add(instancia);
			    }
			}
		    
		    public void modificarElemento(String palabra, String pamodificar) {
		    	
		    	for(int i=0;i<vocabulario.size();i++) {
		    		Palabra pal=vocabulario.get(i);//obtiene el elemento de la pos i y lo almacena en pal 
		    		if(pal.getEspanol().equalsIgnoreCase(palabra)||//si el i= palabra
		    		   pal.getIngles().equalsIgnoreCase(palabra)||
		    		   pal.getFrances().equalsIgnoreCase(palabra)) {
		    			//el problema aqui es que quiero mediante set y la posicion donde esta la palabra modificar la 
//		    			pamodificar pero no puedo.
		    			vocabulario.set(i, pamodificar);	
		    	}
		    	
		    	
		    }
			 
		    }
}
