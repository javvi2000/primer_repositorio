package practicas;
import java.util.Scanner;
public class segundo_array {
			public static void main(String args[]){
				Scanner teclado = new Scanner (System.in);
				double[][] matriz = new double [2][3];
				int opcion=0;
				
				for (int i = 0; i < matriz.length; i++){
					for (int j = 0; j <matriz[i].length; j++){
						System.out.println("Introduzca los valores de la matriz por pantalla: ");
						opcion=teclado.nextInt();
						matriz[i][j]=opcion;
					}
				}

				System.out.println("Viva yo");

				System.out.println("Viva Espana");//github.com/javvi2000/primer_repositorio.git
				System.out.println("====================");
				
				for (int i = 0; i < matriz.length; i++){
					for(int j = 0; j <matriz[i].length; j++){
						System.out.print(matriz[i][j] + "\t");
					}
					System.out.println("");
				}
			}
	}

