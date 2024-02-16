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
					System.out.println("Introduce palabra");
					pal=sc.nextLine();
					sc.nextLine();
					buscarPalabrasEspanol(espanol,ingles,frances,traductor,pal);
					mostrar(traductor);
					getmenu();
					opcion=sc.nextInt();
					break;
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
			String salir;
			for(int i=0;i<espanol.length&&decision==true;i++) {
			
				System.out.println("Introduce palabras");
				System.out.println("En espanol");
				espanol[i]=sc.nextLine();
				sc.nextLine();
				System.out.println("En Ingles");
				ingles[i]=sc.nextLine();
				
				System.out.println("En Frances");
				frances[i]=sc.nextLine();
				
				System.out.println("Dejar de introducir palabras pulsa (s/n)");
				salir=sc.nextLine();
				
				if(salir.equalsIgnoreCase("s")) {
				decision=false;
				}
				
				
			}		
						
		}
		
	

	
		public static void buscarPalabrasEspanol(String espanol[],String ingles[],String frances[],String traductor[],String palabra) {
		
		
			boolean encontrado=false;
			int salir=0;
	
					for(int i=0;i<espanol.length&&encontrado==false;i++) {
						if(espanol[i].equalsIgnoreCase(palabra)) {
							encontrado=true;
						}
						traductor[0]=ingles[i];
						traductor[1]=frances[i];
						
					}	
		}
	
		public static void mostrar(String traductor[]) {
				for (int i=0;i<traductor.length;i++) {
					System.out.println(	traductor[i]);
			}
		}
	
	
}