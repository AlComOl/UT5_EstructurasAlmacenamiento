package Practica280224;
import java.util.*;
public class Cliente {
	
	
	
	private String nombre;
	private String apellidos;
	private int telefono;
	private Date diaSet;
	
	
	public Cliente () {
		
	}
	public Cliente (String nombre,String apellidos,int telefono) {
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.telefono=telefono;
		
		
	}
	
	
	
	
	public static void reservarPaseo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese nombre cliente: ");
        int nombre = sc.nextInt();
        System.out.print("Ingrese el caballo: ");
        int caballo = sc.nextInt();
        System.out.print("Ingrese la fecha del paseo  ");
        int fecha = sc.nextInt();
        
        

	}
	
//	public static String toString() {
//		
//		
//		Cliente.toString();
//		
//	}
	
	

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
	public Date getDiaSet() {
		return diaSet;
	}
	public void setDiaSet(Date diaSet) {
		this.diaSet = diaSet;
	}
	
	
}
	


