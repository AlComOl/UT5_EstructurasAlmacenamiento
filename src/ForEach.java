import java.util.*;

public class ForEach {
public static void main (String[] args) {
	Scanner sc=new Scanner(System.in);
	String [] paises  =new String [8];
	
	for(int i=0;i<paises.length;i++) {
		System.out.println("Introduce paises");
		paises[i]=sc.next();
	}
	
	 {
		for(String pais:paises) {
			System.out.println(pais);
		}
	}
}
}
