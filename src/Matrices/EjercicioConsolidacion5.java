package Matrices;

public class EjercicioConsolidacion5 {

	public static void main(String[] args) {
		

	}
	public class Empleado{
//		atributos
		private String nombre;
		private static final int N=3;
		private float sueldo[];
//		constructores
		
		public Empleado() {
			
		}
		
		public Empleado(String nombre,int sueldos[]) {
			
			this.nombre=nombre;
			this.sueldo=sueldo;
			
		}
		public Empleado(Empleado otroEmpleado) {
			this.nombre=otroEmpleado.nombre;
			this.sueldo=otroEmpleado.sueldo;
		}
		
		
	}
	
	

}
