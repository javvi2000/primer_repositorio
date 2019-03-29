package NUEVO;

import java.io.*;
import java.util.Scanner;

public class total implements Serializable{

	public static void main(String[] args){
		String nombre, apellido, nombre1, nombre2, nombre3, nombre4, nombre5, apellido1, apellido2, apellido3, apellido4, apellido5;
		String fichero=fichero="C:/Users/jorge/Desktop/carpeta";

		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca un nombre por pantalla: ");
		nombre=teclado.nextLine();
		System.out.println("Introduzca un apellido por pantalla: ");
		apellido=teclado.nextLine();
		alumno archivo = new alumno(nombre, apellido);

		try{
			ObjectOutputStream juan = new ObjectOutputStream(new FileOutputStream("C:/Users/jorge/Desktop/carpeta"));
			juan.writeObject(archivo);

			juan.close();

			ObjectInputStream maria = new ObjectInputStream(new FileInputStream("C:/Users/jorge/Desktop/carpeta"));
			alumno objeto=(alumno)maria.readObject();

			System.out.println("Nombre: "+objeto.getnombre() + " " +objeto.getapellido());
			maria.close();
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("Algo no ha funcionado");
		}

		FileReader lector=null;
		try{
			lector=new FileReader(fichero);
			int caracter=lector.read();

			while(caracter !=-1){
				System.out.print((char)caracter);
				caracter=lector.read();
			}
			lector.close();

			teclado.nextLine();

			alumno clase[]= new alumno[5];
			System.out.println("Introduzca un nombre por pantalla: ");
			nombre1=teclado.nextLine();
			System.out.println("Introduzca un apellido por pantalla: ");
			apellido1=teclado.nextLine();
			clase[0]=new alumno(nombre1,apellido1);
			System.out.println("Introduzca un nombre por pantalla: ");
			nombre2=teclado.nextLine();
			System.out.println("Introduzca un apellido por pantalla: ");
			apellido2=teclado.nextLine();
			clase[1]=new alumno(nombre2,apellido2);
			System.out.println("Introduzca un nombre por pantalla: ");
			nombre3=teclado.nextLine();
			System.out.println("Introduzca un apellido por pantalla: ");
			apellido3=teclado.nextLine();
			clase[2]=new alumno(nombre3,apellido3);
			System.out.println("Introduzca un nombre por pantalla: ");
			nombre4=teclado.nextLine();
			System.out.println("Introduzca un apellido por pantalla: ");
			apellido4=teclado.nextLine();
			clase[3]=new alumno(nombre4,apellido4);
			System.out.println("Introduzca un nombre por pantalla: ");
			nombre5=teclado.nextLine();
			System.out.println("Introduzca un apellido por pantalla: ");
			apellido5=teclado.nextLine();
			clase[4]=new alumno(nombre5,apellido5);

			for(int x=0; x<clase.length; x++){
				System.out.println("El alumno es: "+ clase[x].getnombre()+ " " + clase[x].getapellido());
			}

			ObjectOutputStream pepa = new ObjectOutputStream(new FileOutputStream("C:/Users/jorge/Desktop/carpeta"));
			pepa.writeObject(clase);
			pepa.close();
			ObjectInputStream marta = new ObjectInputStream(new FileInputStream("C:/Users/jorge/Desktop/carpeta"));
			alumno nuevaclase[]= new alumno[5];
			nuevaclase=(alumno[])marta.readObject();
			for(int x=0; x<clase.length; x++){
				System.out.println("El alumno es: "+ nuevaclase[x].getnombre()+ " " + nuevaclase[x].getapellido());
			}

			marta.close();

			File guardar = new File("C:/Users/jorge/Desktop/carpeta");
			File bin=new File("bin");
			File directorio=new File("C:/Users/jorge/Desktop/PruebaDirectorio");
			System.out.println("");
			System.out.println("El fichero existe, "+guardar.exists());
			System.out.println("");
			if(guardar.exists()==true){
				if(guardar.isFile()==true){
					System.out.println("El fichero es un fichero");
				}else if(guardar.isDirectory()==true){
					System.out.println("El fichero es un directorio");
				}else{
					System.out.println("El archivo no es ni un fichero ni un directorio");
				}
			}
			System.out.println("");
			System.out.println("Ruta absoluta: "+guardar.getAbsolutePath());
			System.out.println("");

			String[] listado=bin.list();
			for(String z: listado){
				System.out.println(z + " , ");
			}
			directorio.mkdir();
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("No hemos encontrado tu fichero");
		}
	}
}