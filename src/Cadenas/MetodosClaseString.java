package Cadenas;
import java.util.*;

public class MetodosClaseString {

	public static void main(String[] args) {
		Scanner tec=new Scanner(System.in);
		
		String s;
        String s2 = "Hola";
        String s3 = new String("Hola");//Constructor parametrizado
        String s4 = new String(s3);//Contructor copia
        
        s = s2;
        s = "Hola";
        System.out.println(s);
        System.out.println();

        System.out.println("Acceder a una posición para ver qué carácter hay:");
        //s[1] = 'a'; No se puede hacer. En su lugar:
        System.out.println(s.charAt(1));
        System.out.println();
        

        //replace
        System.out.println("Reemplazar un carácter por otro:");
        s = s.replace('o','a');
        System.out.println(s);
        System.out.println(s.charAt(1)); //-> "a"
        //System.out.print(s.charAt(4)); //-> Lanza una excepción pues es mayor de length()-1
        System.out.println();


        //int indexOf(int car)
        //int indexOf(String s)
        //int indexOf(String s, int pos)
        System.out.println("Encontrar posición de un carácter en una cadena:");
        System.out.println(s.indexOf("l")); //-> 2
        System.out.println(s.indexOf("a")); //-> -1
        System.out.println(s.indexOf("la")); //-> 2
        System.out.println(s.indexOf("lo")); //-> -1
        System.out.println();


        //Conversión de tipos
        System.out.println("Convertir un String en un char");
        char[] v = s.toCharArray();
        System.out.println(v);
        System.out.println(v[1]);
        System.out.println();
        
        System.out.println("Convertir un entero a String");
        int entero = 1;// long largo; float real; double realg;
        s = String.valueOf(entero);
        System.out.println(s);
        System.out.println();
        
        System.out.println("Convertir un String en un entero");
        String snumero = " 5 ";
        int numero = Integer.parseInt(snumero.trim());
        System.out.println(snumero);
        System.out.println(numero);
        System.out.println();
        
        System.out.println("Convertir un String en un real");
        String xsnumero = " 5.5 ";
        Double xnumero1 = Double.parseDouble(xsnumero.trim());
        double xnumero2 = xnumero1.doubleValue();
        double ynumero2 = Double.parseDouble(xsnumero.trim());;
        double znumero2 = Double.valueOf(xsnumero.trim()).doubleValue();

        System.out.println(xsnumero);
        System.out.println(xnumero1);
        System.out.println(xnumero2);
        System.out.println(ynumero2);
        System.out.println(znumero2);
        System.out.println();


        //Lectura por teclado
        System.out.print("Introduce una frase: ");
        String frase = tec.nextLine(); 
        System.out.print("Introduce una palabra: ");
        //String palabra = tec.next();  //NO es recomendable, pues no hace salto de línea
        //System.out.println(palabra);
        System.out.println(frase);
        System.out.println();


        ///////FUNCIONES STRING//////
        
        //equals
        System.out.println("Compara dos cadenas con la función equals");
        String cad1="Hola";
        String cad2=new String("Hello");
        System.out.println(cad1.equals(cad2));

        if(cad1.equals(cad2))
            System.out.println("Son iguales"); 
        else
            System.out.println("NO son iguales");
        
        System.out.println();


        //compareTo:
        //<0 si cad1 es menor que cad2
        //==0 si cad1 es igual que cad2
        //>0 si cad2 es menor que cad1
        //OJO! Mayor no se refiera a tamaño!
        System.out.println("compareTo");
        System.out.println(cad1.compareTo(cad2));
        System.out.println();


        //longitud
        System.out.println("Longitud de cad1");
        System.out.println(cad1.length());
        System.out.println();


        //Concatenación - 3 modos:
        frase = cad1 + "hola";
        frase = frase.concat("hola");
        frase += cad1; //frase = frase + palabra; 
        System.out.println(frase);
        System.out.println();    


        //Reemplazar 
        //además del visto anteriormente replace de un char (s = s.replace('o','a');)
        //Tenemos el replaceAll y el replaceFirst
        String cad = "Hola Mundo playa";
        System.out.println(cad.replace('o','a')); //reemplaza todos los char 'o' por 'a'
        System.out.println(cad.replaceAll("la","y")); //reemplaza todos strings "la" por "y"
        System.out.println(cad.replaceFirst("la","y"));//reemplaza sólo el primer "la" por "y"
        System.out.println();    


        //Subcadenas
        cad = "Hola Mundo";
        System.out.println(cad.substring(3,8)); //desde la pos 3 hasta la 8-1
        System.out.println(cad.substring(8)); //desde la pos 8 hasta el final
        System.out.println();    


        //toUppercase. También existe el contrario: toLowerCase
        System.out.println("Pasar a mayúscula:");
        System.out.println(Character.toUpperCase('c'));
        System.out.println(Character.toUpperCase(s4.charAt(1))); //s4 = "Hola"
        System.out.println();
        
        
        //quitar espacios únicamente del principio
        cad = "    Ho l a Mu n d o ";
        System.out.println(cad);
        System.out.println(cad.trim());
        System.out.println();


        //Empieza o acabar por...
        cad = "Hola Mundo";
        System.out.println(cad.startsWith("Hola")); //->true
        System.out.println(cad.endsWith("hola")); //->false
        System.out.println();


        //StringBuilder (clase no modificable. Crea un objeto nuevo)
        StringBuilder cadena3 = new StringBuilder();
        String miString = " Picando Código ";
        miString.trim(); //método para acortar los espacios
        System.out.println(miString); //realiza una copia del objeto sin espacios y la imprime
        System.out.println();


        //Funciones especiales que se pueden aplicar en StringBuilder:
        
        //append
        for (int i = 0; i < 5; i++) {
            cadena3.append("X");
        }
        System.out.println("cadena 3: " + cadena3);
        System.out.println();

        //setCharAt 
        String cad5 = "Kahoot";
        StringBuilder cad6 = new StringBuilder(cad5);
        cad6.setCharAt(1, cad6.charAt(0));
        System.out.println(cad6);

        s = "cadena";
        System.out.println(s.indexOf("l"));
        System.out.println(s.indexOf("1"));

        tec.close();
    }
}



