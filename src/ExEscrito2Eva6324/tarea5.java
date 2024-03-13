package ExEscrito2Eva6324;

public class tarea5 {

	public static void main(String[] args) {
		
		
		

	}
	
	public String elimina(String c) {
		String cadena="";
		
		for(int i=0;i<c.length();i++) {
			if(c.charAt(i)>=' '&&c.charAt(i)<='~') {
				cadena+=c.charAt(i);
				
			}
		}
		
		
		return cadena;
		
	}
}
