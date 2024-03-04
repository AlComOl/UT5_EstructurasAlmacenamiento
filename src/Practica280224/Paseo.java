package Practica280224;

public class Paseo {

	private int dia;
	private int mes;
	private int anyo;
	
	
	public Paseo() {
		
	}
	
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public int getAnyo() {
		return anyo;
	}
	public void setAnyo(int anyo) {
		this.anyo = anyo;
	}
	@Override
	public String toString() {
		return "Paseo [dia=" + dia + ", mes=" + mes + ", anyo=" + anyo + "]";
	}
	
}
