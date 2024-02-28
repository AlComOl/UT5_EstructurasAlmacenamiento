package Character;
import java.util.Scanner;


public class MetodosClaseCharacter {
	public static void main(String[] args) {

	Scanner sc=new Scanner(System.in);
	
	Character letra= 'e';
    Character num='4';
    Character esp= ' ';
    Character letraMayus ='A';
    Character letraMinus = 'a';
     

     
   //Comprobar si el carácter es una letra o no 
   System.out.println(Character.isLetter(letra));//->Devuelve true
   					  Character.isLetter(num);//->Devuelve false
  //Comprobar si el carácter es un digito o no 	
   					 Character.isDigit(num);//->Devuelve true
   					 Character.isDigit(letra);//->Devuelve false
  //Comprobar si el carácter es un espacio en blanco
   			        Character.isWhitespace(esp);//->Devuelve true
   			        Character.isWhitespace(letra);//->Devuelve false
  //Comprobar si el carácter es una letra mayuscula
				    Character.isUpperCase(letraMayus);//->Devuelve true
				    Character.isUpperCase(letraMinus);//->Devuelve false			        
  //Comprobar si el carácter es una letra minuscula
					Character.isLowerCase(letraMinus);//->Devuelve true
					Character.isLowerCase(letraMayus);//->Devuelve false

 //Convierte la cadena en mayuscula
					Character.toUpperCase(letraMinus);//->Devuelve 'A'

 //Convierte la cadena en minuscula
					Character.toLowerCase(letraMayus);//->Devuelve 'a'

					letraMayus.toString();//Devuelve A en un String 


   			        
   			        
   			        
}
	
}