package EjerciciosVectoresClases;
import java.util.*;
public class Prg5_7 {


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		final int CAPACIDAD=5;
		int opcion=0;
		int opcion1=0;
		String pEspanol,pIngles,pfrances;
		int pos=0;
		
		
		
		String ingles[]=new String[CAPACIDAD];
		String espanol[]=new String[CAPACIDAD];
		String frances[]=new String[CAPACIDAD];
		
		
		do {
			System.out.println("\n 1-Cargar Diccionario"+"\n 2-Buscar Traduccion"+"\n 3-Salir");
			
			opcion=sc.nextInt();
			switch (opcion) {
			
			
			case 1: {
				introducePalabras(espanol,ingles,frances);
				break;
			}
			
			case 2: {
				System.out.println("\n 1-Espanol \n 2-Ingles \n 3-Frances");
				sc.nextLine();
				opcion1=sc.nextInt();
				
				switch (opcion1) {
				
						case 1: {
							System.out.println("Introduce palabra en espanol");
							sc.nextLine();
							pEspanol=sc.nextLine();
							buscarPalabrasEspanol(espanol,ingles,frances,pEspanol);
						break;
						}
						
						case 2: {
							
						}
						case 3: {
							
						}
						default:
							
						}
				break;
			}
			default:
				
			}
		}while(opcion!=0);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	public static void introducePalabras(String espanol[],String ingles[], String frances[]) {
		
		String pEspanol,pIngles,pfrances;
		Scanner sc=new  Scanner(System.in);
		boolean salir=true;
			
	
				for(int i=0;i<espanol.length&&salir;i++) {
					System.out.println("Introduce palabras");
					System.out.println("\n Espanol");
						pEspanol=sc.nextLine();
						if(pEspanol.equalsIgnoreCase("salir")) {
							salir=false;
						}else {
							espanol[i]=pEspanol;
						
						
							System.out.println("\n Ingles");
							ingles[i]=sc.nextLine();
							
						
						
							System.out.println("\n Frances");
							frances[i]=sc.nextLine();
							System.out.println("Si quieres salir escribe salir");
							
						}
				}
					
					
	}
		
	

	
	public static void buscarPalabrasEspanol(String espanol[],String ingles[],String frances[], String palabra) {
		int pos=0;
		String resIngles="",resFrances="";
		boolean encontrado=false;
		
				for(int i=0;i<espanol.length;i++) {
					if(espanol[i].equalsIgnoreCase(palabra)){
						 resIngles=ingles[i];
						 resFrances=frances[i];
						 encontrado=true;
						
					}else if(encontrado==false) {
						System.out.println("La palabra no esta en el diccionario");
					}
					
				
				}
				
				System.out.println("\n La traduccion de la palabra Espanola "+ palabra+ "\n En Ingles es :"+ resIngles+"\n "+"\n En Frances es:"+resFrances);
	}
	
	
}