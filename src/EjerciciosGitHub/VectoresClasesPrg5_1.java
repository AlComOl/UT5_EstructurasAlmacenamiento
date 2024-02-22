package EjerciciosGitHub;
import java.util.*;

import PalabraVersionArchivos.Palabra;
import PalabraVersionArchivos.Vocabulario;
/*****************************************************************
 * @autor Álvaro Comenge
 * 
 * @fecha 20/2/24
 * 
 * @descripcion Todos los paquetes de software para ordenadores personales 
 *  deben indicar sus especificaciones de software y hardware. Por ejemplo,
 *  para un producto determinado podría ser:  Sistema operativo: OS/2  Memoria RAM: 5MB  
 *  Dispositivo de almacenamiento: Disco magnetóptico  Puerto paralelo: 1 Definir la estructura 
 *  correspondiente para almacenar dichos datos. Escribir un programa que lea desde teclado las
 *  especificaciones para una base de datos, una hoja de cálculo, un procesador de texto y un juego. 
 *  Sacar por pantalla las cuatro estructuras.
 * **************************************************************/
public class VectoresClasesPrg5_1 {
	
	
	public static class Ordenador {
		
		private static int contadorOrdenadores=0;
		private int numeroPc;
		
		public  String sistemaOperativo;
		public  String memoriaRam;
		public  String almacenamiento;
		public  String puerto;
		
		public Ordenador() {
			
			
			
		}
		public Ordenador(String sistemaOperativo,String memoriaRam,String almacenamiento,String puerto ) {
			contadorOrdenadores++;
			this.numeroPc=contadorOrdenadores;
			this.sistemaOperativo=sistemaOperativo;
			this.memoriaRam=memoriaRam;
			this.almacenamiento=almacenamiento;
			this.puerto=puerto;
		}
//		geters y setters
		public String getSistemaOperativo() {
			return sistemaOperativo;
		}
		public void setSistemaOperativo(String sistemaOperativo) {
			this.sistemaOperativo = sistemaOperativo;
		}
		public String getMemoriaRam() {
			return memoriaRam;
		}
		public void setMemoriaRam(String memoriaRam) {
			this.memoriaRam = memoriaRam;
		}
		public String getAlmacenamiento() {
			return almacenamiento;
		}
		public void setAlmacenamiento(String almacenamiento) {
			this.almacenamiento = almacenamiento;
		}
		public String getPuerto() {
			return puerto;
		}
		public void setPuerto(String puerto) {
			this.puerto = puerto;
		}
		
		 public static void getMenu(){
			 /***********************************************
			  * @autor acome
			  * @descripcion Es el menu de main 
			  * 
			  * **********************************************/
		        System.out.println("Elige una opcion:");
		        System.out.println("1.Anadir Caracteristicas a los Ordenadores");
		        System.out.println("2.Muestra caracteristicas de los Ordenadores");
		        System.out.println("3.Modificar palabra");
		        System.out.println("4.Eliminar palabra");
		        
		 }	 
		 public String toString() {
				StringBuilder caracteristicas=new StringBuilder();
				System.out.println("Pc numero ");caracteristicas.append(numeroPc);
				caracteristicas.append("\n Sistema Operativo : ") ;caracteristicas.append(sistemaOperativo);
				caracteristicas.append("\n Memoria RAM : ") ;caracteristicas.append(memoriaRam);
				caracteristicas.append("\n Almacenamiento : ") ;caracteristicas.append(almacenamiento);
				caracteristicas.append("\n Tipo Puerto : ") ;caracteristicas.append(puerto);
				
			return caracteristicas.toString();
	}
		 
		 
		
	}
	public static class Caracteristicas{
		 static ArrayList<Ordenador> NewOrdenador=new ArrayList<Ordenador>();
			static Scanner sc=new Scanner(System.in); 
			
			public static void cargarDatos() {
				int ordenador;
			 String sistemaOperativo;
			 String memoriaRam;
			 String almacenamiento;
			 String puerto;
			 System.out.println("Introduce el numero de ordenadores");
			 
			 ordenador=sc.nextInt();
			 

				for(int i=0;i<ordenador;i++) {
						System.out.println("PC numero "+i);
				    	System.out.println("Introduce el Sistema Operativo del Ordenador");
				    	sistemaOperativo=sc.next();
				    	
				    	System.out.println("Introduce la Memoria RAM del Ordenador");
				    	memoriaRam=sc.next();
				    	System.out.println("Introduce el Tipo de Almacenamiento del Ordenador");
				    	almacenamiento=sc.next();
				    	System.out.println("Introduce el Tipo de Puerto del Ordenador");
				    	puerto=sc.next();
				    	//introduzco en la instancia el valor
				    	Ordenador nuevoOrdenador =new Ordenador(sistemaOperativo,memoriaRam,almacenamiento,puerto);
					    //por medio de add la instancia en el arraylist<palabra>
					    NewOrdenador.add(nuevoOrdenador);
				}
			}
			
			
		
	}
 

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int key=0;
		Caracteristicas c=new Caracteristicas();
		
		
		do {
			Ordenador.getMenu();
			 key=sc.nextInt();
		switch (key) {
		case 1: {
			Caracteristicas.cargarDatos();
			
		}
		break;
		case 2: {
		for(Ordenador ordenadores:Caracteristicas.NewOrdenador) {
			
		
		
		System.out.println(ordenadores.toString());
		}	
		}
		break;
		case 3: {
			
			
		}
		break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + key);
		}
		
		}while(key!=4);
		
	}

}
