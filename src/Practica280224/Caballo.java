package Practica280224;
import java.util.*;

public class Caballo {
	
	
	
	public String nombre;
	public  String color ;
	private ArrayList<Paseo> paseos;//una lista de paseos cada caballo
	
	public Caballo() {
		paseos=new ArrayList<Paseo>();
		
	}
	public Caballo(String nombre,String color) {
		this.nombre=nombre;
		this.color=color;
		paseos=new ArrayList<Paseo>();
	}
	
	

	
	
	
	public Paseo getPaseos(int x) {
		return paseos.get(x);
	}
	public void addPaseo( Paseo p) {
		this.paseos.add(p);//añado paseo 
	}
	  
	
	 public String getNombre() {
			return nombre;
		}
	 
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public String getColor() {
			return color;
		}
		public void setColor() {
			this.color = color;
		}

		
	
	
	 

	
}