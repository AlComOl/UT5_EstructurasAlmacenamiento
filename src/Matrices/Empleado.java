package Matrices;

import java.util.Scanner;

public class Empleado {

	
	
//		atributos
		private String nombre;
		private static final int N=3;
		private double sueldo[];
//		constructores
		
		public Empleado() {
			
		}
		
		public Empleado(String nombre) {
			
			this.nombre=nombre;
			this.sueldo = new double [N];
			
		}
		
		
		public Empleado(Empleado otroEmpleado) {
			this.nombre=otroEmpleado.nombre;
			this.sueldo=otroEmpleado.sueldo;
		}
		
		
//		setters y getters
		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public double[] getSueldo() {
			return sueldo;
		}

		public void setSueldo(double[] sueldo) {
			this.sueldo = sueldo;
		}
		
		
//	demás	Metodos 
		
		
		public double getTotal() {
			double suma=0;
			for (int i = 0; i <N; i++) {
	           suma +=sueldo[i]; 
			}
		return suma;
		}
		
		public String toString() {
			String in;
			in="El empleado "+this.getNombre()+" tiene un sueldo total de "+this.getTotal();
			
				
			return in;
		}
}
			
	


