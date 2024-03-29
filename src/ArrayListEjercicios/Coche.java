package ArrayListEjercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Coche {
	
		private String matricula; 
		private String marca;
		private String modelo;
		private int Km;
		public int getKm() {
			return Km; 
		} 
		public void setKm(int Km) {
			this.Km = Km; 
			} 
		public String getMarca() {
			return marca; 
			}
		public void setMarca(String marca) { 
			this.marca = marca;
			}
	
		public String getMatricula() {
			return matricula; } 
		public void setMatricula(String matricula) {
			this.matricula = matricula; 
			}
		public String getModelo() {
			return modelo; 
			} 
		public void setModelo(String modelo) {
			this.modelo = modelo; 
			}
		@Override 
		public String toString() {
				StringBuilder sb = new StringBuilder(); 
				sb.append("\nMatrícula: ");sb.append(matricula);
				sb.append("\nMarca: ");sb.append(marca);
				sb.append("\nModelo: ");sb.append(modelo);
				sb.append("\nKm: ");sb.append(Km); 
				return sb.toString(); 
		}
	
	public static class Basico1 {
		//Se crea un ArrayList para guardar objetos de tipo Coche.
		static ArrayList<Coche> coches = new ArrayList<Coche>();
		static Scanner sc = new Scanner(System.in);	

		public static void main(String[] args) {
			leerCoches(); 
			System.out.println("\nCoches introducidos:");
			mostrarCoches(); 
			mostrarPorMarca(); 
			mostrarPorKm();
			System.out.println("\nCoche con mayor número de Km: " + mostrarMayorKm()); 
			System.out.println("\nCoches ordenados de menor a mayor número de Km"); 
			mostrarOrdenadosPorKm(); 
		}
		
		public static void leerCoches(){ 
			
			
			//Declaración de variables para leer los datos de los coches 
			String matricula;
			String marca;
			String modelo;
			int Km; //Variable auxiliar que contendrá la referencia a cada coche nuevo. Coche aux;
		
			
			int i, N; //se pide por teclado el número de coches a leer
			do {
				System.out.print("Número de coches? ");
				N = sc.nextInt(); 
			} while (N < 0); 
			   sc.nextLine();//limpiar el intro //lectura de N coches 
				for (i = 1; i <= N; i++) { //leer datos de cada coche 
					System.out.println("Coche " + i); 
					System.out.print("Matrícula: ");
					matricula = sc.nextLine();
					System.out.print("Marca: ");
					marca = sc.nextLine(); 
					System.out.print("Modelo: ");
					modelo = sc.nextLine();
					System.out.print("Número de Kilómetros: ");
					Km = sc.nextInt(); sc.nextLine(); //limpiar el intro 
					Coche aux = new Coche(); //Se crea un objeto Coche y se asigna su referencia a aux //se asignan valores a los atributos del nuevo objeto 
					aux.setMatricula(matricula);
					aux.setMarca(marca);
					aux.setModelo(modelo);
					aux.setKm(Km); //se añade el objeto al final del array 
					coches.add(aux); 
					} 
			} //fin método leerCoches() //Método para mostrar todos los coches 
			
			public static void mostrarCoches(){ 
				for(int i = 0; i< coches.size(); i++) 
					System.out.println(coches.get(i)); //se invoca el método toString de la clase Coche }
					}
			
			public static void mostrarPorMarca(){
				String marca; System.out.print("Introduce marca: "); 
				marca = sc.nextLine();
				System.out.println("Coches de la marca " + marca);
				for(int i = 0; i<coches.size(); i++){
					if(coches.get(i).getMarca().equalsIgnoreCase(marca)) System.out.println(coches.get(i));
					} 
				}
			
			public static void mostrarPorKm(){
				int Km;
				System.out.print("Introduce número de kilómetros: ");
				Km = sc.nextInt(); System.out.println("Coches con menos de " + Km + " Km");
				for(int i = 0; i<coches.size(); i++){ 
					if(coches.get(i).getKm() < Km) System.out.println(coches.get(i));
					}
			}
			public static Coche mostrarMayorKm(){
				Coche mayor = coches.get(0);
				for(int i = 0; i < coches.size(); i++){
					if(coches.get(i).getKm() > mayor.getKm()) mayor = coches.get(i); 
					}
				return mayor; 
				}
			
			public static void mostrarOrdenadosPorKm(){ 
				int i, j; Coche aux;
				for(i = 0; i< coches.size()-1; i++)
					for(j=0;j<coches.size()-i-1; j++) 
						if(coches.get(j+1).getKm() < coches.get(j).getKm()){
							aux = coches.get(j+1); coches.set(j+1, coches.get(j));
							coches.set(j, aux); } mostrarCoches();
			}
}
	

		
		
}


