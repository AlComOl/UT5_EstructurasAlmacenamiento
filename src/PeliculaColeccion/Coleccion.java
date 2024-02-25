package PeliculaColeccion;
/***********************************************************************************
 * @author Álvaro Comenge
 * 
 * @Fecha:9/02/24
 * 
 * @category ArrayDePelículas
 * 
 * ********************************************************************************/
public class Coleccion {
	
	 private Pelicula [] peliculas ;
	 private static final int MAX=1;
	 private int posicionActual=0;

	 public Coleccion(){
	 peliculas=new Pelicula[MAX];
	
	 }
	
	 public boolean add(Pelicula p){
		 boolean ok=false;
			 if (posicionActual<MAX) {
				 peliculas [posicionActual]=p;
				 posicionActual++;
				 ok=true;
			 } else {
				 System.out.println(ok);
//				 System.out.println("La coleccion está llena. No se puede agregar mas peliculas.");
			    }
	 	return ok;
		}

		  public String toString (){
		  String resultado="";
		
		  for ( int i=0;i<posicionActual;i++)
		  resultado=resultado+peliculas[i]. toString ()+" \n";
		  return resultado;
		 
		  }
		 
		  public static void main(String[] argv) {
			  
				  Coleccion coleccion=new Coleccion();
				  
				  coleccion.add(new Pelicula("2001: Una Odisea en el Espacio","Stanley Kubrick",1968,
				  Pelicula .CIENCIA_FICCION));
				  coleccion.add(new Pelicula("2046","Wong Kar Wai",2004,Pelicula.CIENCIA_FICCION));
				  System.out.println(coleccion);
				  
				  
				  
				  }
	 }
		 
		 
		 
		 
		 
		 
