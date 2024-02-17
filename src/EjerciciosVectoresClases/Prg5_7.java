package EjerciciosVectoresClases;
import java.util.*;
public class Prg5_7 {


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		final int CAPACIDAD=5;
		int opcion=0;
		String pal;	
		String ingles[]=new String[CAPACIDAD];
		String espanol[]=new String[CAPACIDAD];
		String frances[]=new String[CAPACIDAD];
		String traductor[]=new String[2];
			
		
			getmenu();
			opcion=sc.nextInt();
			do {
				switch (opcion) {
				
				case 1:
					introducePalabras(espanol,ingles,frances,sc);
					getmenu();
					opcion=sc.nextInt();
					break;
				case 2:
					System.out.println("Introducir palabra para traducir pulsa: \n 1-Espanol \n 2-Ingles \n 3-Frances");
					int key=sc.nextInt();
					switch (key) {
					case 1: {
						buscarPalabrasEspanol(espanol,ingles,frances,traductor);
						mostrar(traductor);
						getmenu();
						opcion=sc.nextInt();
						break;
						
					}
					case 2: {
						buscarPalabrasIngles(espanol,ingles,frances,traductor);
						mostrar(traductor);
						getmenu();
						opcion=sc.nextInt();
						break;
						
					}
					case 3: {
						buscarPalabrasEspanol(espanol,ingles,frances,traductor);
						mostrar(traductor);
						getmenu();
						opcion=sc.nextInt();
						break;
						
					}
					default:
						
					}
					
					
				case 3:
					
					break;
				case 4:
					
					break;
				case 5:
					
					break;

				default:
					break;
				}
			}while(opcion!=5);
		
	}
	
	
	
		public static void getmenu() {
			System.out.println("Menu:");
			System.out.println("\n 1-Cargar dicionario");
			System.out.println("\n 2-Buscar palabras");
			System.out.println("\n 3-Salir");
		}
	
	
		public static void introducePalabras(String espanol[],String ingles[], String frances[],Scanner sc) {
			
			
			boolean decision= true;
			String salir,pE,pI,pF;
			for(int i=0;i<espanol.length&&decision==true;i++) {
			
				System.out.println("Introduce palabras");
				System.out.println("En espanol");
				pE=sc.next();
				espanol[i]=pE;
//				sc.next();
				
				System.out.println("En Ingles");
				pI=sc.next();
				ingles[i]=pI;
				
				System.out.println("En Frances");
				pF=sc.next();
				frances[i]=pF;
				System.out.println("Dejar de introducir palabras pulsa (s/n)");
				salir=sc.next();
				
				if(salir.equalsIgnoreCase("s")) {
				decision=false;
				}
				
				
			}		
						
		}
		
	

	
		public static void buscarPalabrasEspanol(String espanol[],String ingles[], String frances[],String traductor[]) {
			int pos=0;
			boolean encontrado=false;
			Scanner sc=new Scanner(System.in);
			System.out.println("introduce palabra");
			String palabra=sc.next();
			for(int i=0;i<espanol.length&&encontrado==false;i++) {
				
				if(espanol[i].equalsIgnoreCase(palabra)) {
					encontrado=true;
					pos=i;
					traductor[0]=ingles[pos];
					traductor[1]=frances[pos];
					
				}if(encontrado==false) {
					System.out.println("No encuentra palabra");
					encontrado=false;
					getmenu();
			}
			
				
			}
			
		}		
			public static void buscarPalabrasIngles(String espanol[],String ingles[], String frances[],String traductor[]) {
				int pos=0;
				boolean encontrado=false;
				Scanner sc=new Scanner(System.in);
				System.out.println("introduce palabra");
				String palabra=sc.next();
				for(int i=0;i<ingles.length&&encontrado==false;i++) {
					
					if(ingles[i].equalsIgnoreCase(palabra)) {
						encontrado=true;
						pos=i;
						
					}else {
						System.out.println("The word is not in the dictionary");
					}
					
					traductor[0]=espanol[pos];
					traductor[1]=frances[pos];
					
				}
			
				
			
		}
			
			
			public static void buscarPalabrasFrances(String espanol[],String ingles[], String frances[],String traductor[]) {
				int pos=0;
				boolean encontrado=false;
				Scanner sc=new Scanner(System.in);
				System.out.println("introduce palabra");
				String palabra=sc.next();
				for(int i=0;i<frances.length&&encontrado==false;i++) {
					
					if(ingles[i].equalsIgnoreCase(palabra)) {
						encontrado=true;
						pos=i;
						
					}else {
						System.out.println("Le mot n'est pas dans le dictionnaire");
					}
					
					traductor[0]=espanol[pos];
					traductor[1]=ingles[pos];
					
				}
			
				
			
		}
			
			
	
			public static void mostrar(String traductor[]) {
				
				System.out.println("Traducion de la palabra elegida en Español Ingles y Frances");
					for (int i=0;i<traductor.length;i++) {
						
						System.out.println(traductor[i]);
				}
					System.out.println("********************");
		}
	
	
}