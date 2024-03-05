package ExamenEscrito2evaluacion;

public class cliente {
	
	private static int identificador;
	private static int identificadorProducto;
	private String nombre;
	private String direccion;
	private boolean enviovip;
	
	
	
	public cliente(String nombre, String direccion, boolean enviovip) {
		identificador++;
		identificadorProducto++;
		this.nombre=nombre;
		this.direccion=direccion;
		this.enviovip=enviovip;
	}
	
	
	
	

}
