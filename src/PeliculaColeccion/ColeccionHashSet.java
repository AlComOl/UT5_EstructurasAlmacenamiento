package PeliculaColeccion;
 import java. util .HashSet;
 /***********************************************************************************
  * @author Álvaro Comenge
  * 
  * @echa:9/02/24
  * 
  * @category ArrayDePelículas
  * 
  * ********************************************************************************/
 
public class ColeccionHashSet {

	
	 private HashSet<Pelicula> peliculas;
	 
	 public ColeccionHashSet(){
	 peliculas=new HashSet<Pelicula>();
	 
	 
	 }

	 public boolean add(Pelicula p){
	 return peliculas .add(p);
	}
	
	 public String toString (){
	 String resultado="";
	 for (Pelicula p: peliculas )
	 resultado=resultado+p.toString()+"\n";
	 return resultado;
	
	 }
	
	
	 
	 public static void main(String[] argv) {
		 Coleccion coleccion=new Coleccion();
		 
		 coleccion.add(new Pelicula("2001: Una Odisea en el Espacio", "Stanley Kubrick",1968,Pelicula.CIENCIA_FICCION));
		 coleccion.add(new Pelicula("2046","Wong Kar Wai",2004,Pelicula .CIENCIA_FICCION));
		 System.out.println(coleccion);
		 }
}
