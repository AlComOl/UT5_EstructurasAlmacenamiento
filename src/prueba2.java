
public class prueba2 {

	public static void main(String[] args) {
		int v[]={3,3,3,2,2,2,1,1,1,7};
		int f[]=new int[10];
		int valor,aux=0;
		
		for(int i=0; i<v.length;i++) {	
			for(int j=v.length-1;j>i;j--) {
				if(v[j-1]>v[j]) {
					aux=v[j-1];
					v[j-1]=v[j];
					v[j]=aux;
				
			}
		}
	}
		
		for(int i=0;i<v.length;i++) {
			System.out.print(v[i]);
		}
		
		for(int i=0;i<v.length;i++) {
			valor=v[i];//valor del array dentro de valor
			
			f[valor]++;//incremento la pos de f en valor = veces repite elemento
			System.out.print(i+"se repite "+f[i]+", ");
		}
		
		
		
		

	}

}
