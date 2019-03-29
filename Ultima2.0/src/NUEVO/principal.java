package NUEVO;

import java.util.Scanner;

public class principal {
	public static void main(String[] args) {
		String Nombre;
		String Apellido;
		
		Scanner teclado = new Scanner(System.in);
		alumno objeto = new alumno();
		alumno p1,p2,p3,p4;
			p1= new alumno("Marisol", "Luz");
			p2= new alumno(p1);
			
			String nombre = p1.getnombre();
			String apellido = p1.getapellido();
			
			System.out.println("Nombre1 = "+p1.getnombre());
			System.out.println("Apellido1 = "+p1.getapellido());
			System.out.println("Nombre2 = "+p2.getnombre());
			System.out.println("Apellido2 = "+p2.getapellido());
			
			if(nombre.equals(p2.getnombre()) & apellido.equals(p2.getapellido())){
				System.out.println("Son iguales");
			}else{
				System.out.println("Son distintos");
			}
			
			System.out.println("===========================");
			p2=p1;
			p1.setnombre("Juanito");
			String pepe = p1.getnombre();
			System.out.println("El objeto1 modificado es = " +p1.getnombre());
			System.out.println("El objeto2 es = " +p2.getnombre());
			
			if(pepe.equals(p2.getnombre())){
				System.out.println("Son iguales");
			}else{
				System.out.println("Son distintos");
			}
			
			System.out.println("===========================");
			System.out.println("Por favor introduzca un nombre por pantalla:");
			Nombre=teclado.nextLine();
			System.out.println("Por favor introduzca un apellido por pantalla:");
			Apellido=teclado.nextLine();
			
			p3 = new alumno();
			p4 = new alumno (Nombre, Apellido);
			System.out.println("El nombre3 es = " +p3.getnombre());
			System.out.println("El apellido3 es = " +p3.getapellido());
			System.out.println("El nombre4 es = " +p4.getnombre());
			System.out.println("El apelido4 es = " +p4.getapellido());
			
			if(p3.getnombre().equals(p4.getnombre()) | p3.getapellido().equals(p4.getapellido())){
				System.out.println("Son iguales");
			}else{
				System.out.println("Son distintos");
			}
			
			System.out.println("===========================");
			System.out.println("Numero de alumnos = " +p3.getnumalumno());
			p3.resultado();
			System.out.println("La nota media es = " +p3.getNotamedia());
	}
}
