package ArrayListEjercicios;
/***************************************************************
 * @autor Álvaro Comenge
 * @descripcion Ejerccio Vocabulario
 * @version ArrayList
 * @Fecha 20-2-2024
 * 
 * **************************************************************/

import java.util.ArrayList;
import java.util.Scanner;

public class Palabra1 {
	
	private String espanol;
	private String ingles;
	private String frances;
	
	
	public String getEspanol() {
		return espanol;
	}


	public void setEspanol(String espanol) {
		this.espanol = espanol;
	}


	public String getIngles() {
		return ingles;
	}


	public void setIngles(String ingles) {
		this.ingles = ingles;
	}


	public String getFrances() {
		return frances;
	}


	public void setFrances(String frances) {
		this.frances = frances;
	}
	
	@Override
	public String toString() {
		StringBuilder idioma = new StringBuilder();
		idioma.append("\n Traduccion al Espanol : ");idioma.append(espanol);
		idioma.append("\n Traduccion al Ingles : ");idioma.append(ingles);
		idioma.append("\n Traduccion al Frances : ");idioma.append(frances);
		return idioma.toString();
	}
	
	
	 public static void getMenu(){
	        System.out.println("Elige una opcion:");
	        System.out.println("1.Añadir una palabra");
	        System.out.println("2.Buscar una palabra en otro idioma");
	 }
	 
	public static class Voca{
		static ArrayList<Palabra1> vocabulario=new ArrayList<Palabra1>();
		static Scanner sc=new Scanner(System.in); 
		
		public static void main(String[] args) {
			
//			int key=sc.nextInt();
//			
//			
//			do {
//				switch (key) {
//				case 1: {
//					
//					
//				}
//				case 2: {
//					
//					
//				}
//				default:
//					throw new IllegalArgumentException("Unexpected value: " + key);
//				}
//				
//			}while();
			
			cargarDiccionario();
			
			System.out.println("introduce palabra a traducir");
			String p=sc.next();
			buscarTraduccion(p);
		}
		
		public static void cargarDiccionario() {
			/*****************************************
			 * @author acome
			 * 
			 * @descripcion Carga las palabras en el array list 
			 * mediante el bucle for, de manera que cada vocbulario
			 * tiene 3 atributos
			 * 
			 * ****************************************/
			String espanol;
		    String ingles;
		    String frances;
		    
		    String palabra;
		    
		    int i,N;//numero de palabras a leer
		    
		    do {
		    	System.out.println("Numero de palabras a cargar");
		    	N=sc.nextInt();
		    }while(N<0);
		    sc.nextLine();
		    
		    for(i=1;i<=N;i++) {
		    	System.out.println("Palabra "+i);
		    	System.out.println("Palabra en español");
		    	espanol=sc.nextLine();
		    	System.out.println("Palabra en Ingles");
		    	ingles=sc.nextLine();
		    	System.out.println("Palabra en Frances");
		    	frances=sc.nextLine();
		    	
		    	Palabra1 pa =new Palabra1();
			    
			    pa.setEspanol(espanol);
			    pa.setIngles(ingles);
			    pa.setFrances(frances);
			    
			    vocabulario.add(pa);
		    }
		}
		    public static void buscarTraduccion(String palabra) {
		    	/****************************************************
		    	 * @author acome
		    	 * @param palabra a buscar
		    	 * @descripcion itera con el foreach por el array entra en la 
		    	 * condicion que cumple y muestra las otras 2 palabras 
		    	 * si no lo cumple muestra que no esta en el diccionario.
		    	 * 
		    	 * **************************************************/
		    	boolean encontrado=false;
		    	
		    	for(Palabra1 Voca:vocabulario) {
		    		
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
		    }
		    
		    
		}
	
	


