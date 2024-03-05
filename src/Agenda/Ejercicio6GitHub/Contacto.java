package Agenda.Ejercicio6GitHub;
/************************************************
 * @author acome
 * 
 * **********************************************/



public class Contacto {
	

	private String dni;
	private String nombre;
	private int edad;
	private int ntelefono;
	
	public Contacto() {
		
	}
	
	public Contacto( String dni,String nombre, int edad, int ntelefono) {
			this.dni=dni;
			this.nombre=nombre;
			this.edad=edad;
			this.ntelefono=ntelefono;
		}
	
	
	
	
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getNtelefono() {
		return ntelefono;
	}

	public void setNtelefono(int ntelefono) {
		this.ntelefono = ntelefono;
	}

	public String toString() {
		
		return   "\n dni:"+dni
				+"\n nombre: "+ nombre
				+"\n edad: "+edad
				+"\n Telefono :"+ntelefono;
		
		
	}
}
