package PeliculaColeccion;

public class Pelicula {

	private String titulo ;
	private String director ;
	private int anyo;
	private int codigo;
	private static int proximoCodigo=0;
	private int genero;
    public final static int TERROR=0, CIENCIA_FICCION=1, ACCION=2, SUSPENSE=3, COMEDIA=4;
    private static final String [] generos = {"Terror" , "Ciencia ficcion " , "Accion", "Suspense", "Comedia" };
	
	 public Pelicula (String titulo , String director , int anyo, int genero) {
		 this . titulo = titulo ;
		 this . director = director ;
		 this .anyo = anyo;
		 this .genero = genero;
		 codigo = proximoCodigo;
		 proximoCodigo++;
		 }
	
		 public int getAnyo() {
		 return anyo;
		 }
	

		 public void setAnyo(int anyo) {
		 this .anyo = anyo;
		 }
	
		 public String getDirector () {
			 return director ;
		 }
	
	
		 public void setDirector (String director ) {
		 this . director = director ;
		 }
	
		 public String getTitulo () {
		 return titulo ;
		 }
	
		 public void setTitulo (String titulo ) {
		 this . titulo = titulo ;
		 }
		 
		 public int getCodigo() {
			  return codigo;
		 }
		 public int getGenero(){
			 return genero;
		 }
		 
		 
		 public void setGenero(int genero) {
			  this .genero=genero;
		 }
		 
		 public String toString (){
			  String cadenaGenero="";
			  switch (genero){
			  case 0: cadenaGenero="Terror";break;
			  case 1: cadenaGenero="Ciencia ficcion";break;
			  case 2: cadenaGenero="Accion";break;
			  case 3: cadenaGenero="Suspense";break;
			  case 4: cadenaGenero="Comedia"; break;
			  }
			  return "Codigo:"+codigo+"\n"+"Pelicula: "+ titulo +"\n"+"Director : "+director+
			  " \n"+"Anyo: "+anyo+"\n"+"Genero: "+cadenaGenero+"\n";
			 }
		 
		 
//		 public String toString (){
//			 
//			 return "Codigo:"+codigo+"\n"+"Pelicula: "+ titulo +"\n"+"Director : "+director+
//			 " \n"+"Anyo: "+anyo+"\n"+"Genero: "+generos[genero]+"\n";
//		 }
		 
		 public String getGeneroComoCadena(){
			 
			 return generos[genero];
		 }
		 
		 
		 
	 	}

	


