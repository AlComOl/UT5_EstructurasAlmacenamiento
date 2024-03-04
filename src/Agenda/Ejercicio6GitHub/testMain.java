package Agenda.Ejercicio6GitHub;

import java.util.*;

public class testMain {

	
	private static ArrayList<Contacto> contactos=new ArrayList<>();
	
	
	public static void main (String [] args) {
		
		Scanner sc=new Scanner(System.in);
		byte key=0;
		
		
		
		do {
			getmenu();
			key=sc.nextByte();
			switch (key) {
			case 1:
				
				addContacto();
				System.out.println("El contacto ha sido anadido");
				sc.nextLine();
				break;
			case 2:
				
				
							
				break;
			case 3:
				System.out.println("Introduce nombre a buscar");
				String busqueda=sc.next();
//				sc.next();
				int busca=buscarContacto(busqueda);
				
				if(busca!=-1) {
					System.out.println(contactos.get(busca).toString());
				}else {
					System.out.println("No se ha encontrado el nombre en la Agenda");
				}
				getmenu();
				break;
			case 4:
				System.out.println("Introduce Dni a buscar");
				String dnibusqueda=sc.next();
				int	busdni=buscarDni(dnibusqueda);
				
				if(busdni!=-1) {
					System.out.println(contactos.get(busdni).toString());
				
				}else if(busdni==-1){
					System.out.println("El dni no esta entre los contactos");
				}
				
				break;
			case 5:
				System.out.println("Introduce SubCadena para filtar Dni ");
				String subcat=sc.next();
				contLetraDni(subcat);
				break;
			case 6:
				
				break;

			default:
				break;
			}
			
		}while(key!=6);
		
		
	}
	
	public static void getmenu() {
		
		System.out.println("menu:");
		System.out.println("1-Registrar Contactos");
		System.out.println("2-Eliminar Contacto");
		System.out.println("3-Buscar Contacto nombre");
		System.out.println("4-Buscar por Dni ");
		System.out.println("5-Buscar dni por letra");
	}
	
	public static void addContacto() {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Introduce dni");
		 String dni=sc.nextLine();
		System.out.println("Introduce nombre");
		 String nombre=sc.nextLine();
		System.out.println("Introduce edad"); 
		 int edad=sc.nextInt();
		System.out.println("Introduce telefono");
		 int ntelefono=sc.nextInt();
		 
		 Contacto c=new Contacto( dni,nombre,edad,ntelefono);
		 
		 contactos.add(c);

	}
	
	public static int  buscarContacto(String busqueda) {
		int rdo=-1, i=0;
				for(Contacto x : contactos) {
		
			
			if(x.getNombre().equalsIgnoreCase(busqueda)) {
				
				rdo=i;
			}
			i++;
		}
//		System.out.println(rdo);
	 return rdo;
	}
	
	public static int buscarDni(String dni) {
		int rdo=-1,i=0;
		
		for(Contacto x : contactos) {
			
			if(x.getDni().equalsIgnoreCase(dni)) {
				
				rdo=i;
			}
			
			i++;
		}
		
		return rdo;
		
	}
	
	public static void contLetraDni(String letra) {
		
		
		for(Contacto x : contactos) {
			
			if(x.getDni().contains(letra)){
				
				System.out.println(x.getDni()+" ,");
			}
			
			
		}
		
	}
}
