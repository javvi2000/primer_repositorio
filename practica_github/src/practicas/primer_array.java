package practicas;

public class primer_array {
		public static void main(String args[]){
			
			int[] numero = new int [50];
			
			for (int i=0; i<numero.length; i++){
			numero [i] = i+1;
			}
			System.out.println("Viva España");
			System.out.println("Multiplos de 10: ");
			System.out.println("");
			for (int i=0; i<numero.length; i++){
			
				if(numero[i]%10==0){
				System.out.println(numero[i]);
					}
				}
			}
	}

