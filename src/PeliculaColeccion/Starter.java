package PeliculaColeccion;
import javax.swing.JOptionPane;
/***********************************************************************************
 * @author Álvaro Comenge
 * 
 * @echa:9/02/24
 * 
 * @category ArrayDePelículas
 * 
 * ********************************************************************************/


public class Starter {
	int anyo;
	

	
	 public static void main(String[] args) {
		 
		 
	 String nombre,director;
	 int anyo,genero,continuar;
	 Coleccion coleccion=new Coleccion();
	 String [] generos={"Terror","Ciencia ficcion " , "Accion","Suspense","Comedia"};
	 
	 do {
		 
		 nombre=JOptionPane.showInputDialog(null,"Introduce nombre de la pelicula ");
		 
		 director =JOptionPane.showInputDialog(null,"Introduce el director de la pelicula " );
		 
//		 anyo=Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el anyo de la pelicula " ));
		 
		 		// try cath maneja una excepcion 
		 try {
			  anyo=Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el anyo de la pelicula " ));
			  //intenta convertir el dato en entero, si no pueda anyo=0
			  } catch (NumberFormatException excepcion){ 
				  anyo=0; 
			  };
		 
		 genero=JOptionPane.showOptionDialog(null,"Introduce genero de la pelicula ","Genero", JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,null,generos,generos[0]);
		 
		 continuar= JOptionPane.showConfirmDialog(null,"Quieres continuar?","Seleccione la opcion deseada",JOptionPane.YES_NO_OPTION);
		 
		 coleccion.add(new Pelicula(nombre, director, anyo, genero));
		 
	 } while (continuar==0);
	 JOptionPane.showMessageDialog(null,coleccion);
	 }
 }

