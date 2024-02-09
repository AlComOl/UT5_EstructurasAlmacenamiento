package PeliculaColeccion;

import java.io.PrintStream;

public class testPelicula {

	public static void main(String[] args) {
		
		
		 Pelicula peli1=new Pelicula("La historia interminable","No lo se ",1975,Pelicula.CIENCIA_FICCION); 
		 Pelicula peli2=new Pelicula("Los inmortales", "Eliot Ness",1975,Pelicula.ACCION);
		 
		 
		 System.out.println(peli1.toString());
		 
		 System.out.println(peli2.getGeneroComoCadena());

	}

}
