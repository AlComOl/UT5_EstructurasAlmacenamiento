package PalabraVersionArchivos;


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
				System.out.println("introduce palabra a traducir");
				String p=sc.next();
				v.buscarTraduccion(p);
			
			break;
			case 3:
				System.out.println("Introduce el elemento que quieres modificar");
				
			break;
			case 4:
				
			break;
			default:
				throw new IllegalArgumentException("Unexpected value: " + key);
			}
			
		}while(key!=5);
		
		
		
		
		sc.close();
	}

	
	
	
}
