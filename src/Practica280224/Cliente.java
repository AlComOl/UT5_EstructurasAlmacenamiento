package Practica280224;
import java.util.*;
public class Cliente {
	
	
	
	private String nombre;
	private String apellidos;
	private int telefono;
	
	private ArrayList<Paseo> paseos;//aqui el cliente tieen un listado de paseos 
	
	
	public Cliente () {
		paseos=new ArrayList<Paseo>();
		
	}
	public Cliente (String nombre,String apellidos,int telefono) {
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.telefono=telefono;
		paseos=new ArrayList<Paseo>();
		
	}
	
	public Paseo getPaseos(int x) {
		return paseos.get(x);
	}
	
	public void addPaseo( Paseo p) {
		this.paseos.add(p);//añado paseo 
	}
		
	public  String toString() {
		
		String info= this.nombre+" "+this.apellidos+" "+this.telefono;
		
		for(Paseo x:paseos) {
			
			info+=x.toString();
			
		}
		
		return info;
	}
	
	

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	
	
	
}
	


