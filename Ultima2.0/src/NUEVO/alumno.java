package NUEVO;

import java.io.Serializable;

public class alumno implements Serializable{
	
	String nombre;
	String apellido;
	private int numalumno;
	static double Notamedia;
	
	alumno (alumno r){
		this.nombre= r.getnombre();
		this.apellido= r.getapellido();
	}
	
	alumno(){
		nombre=apellido="vacio";
		
		numalumno++;
	}
	
	alumno (String nombre1, String apellido1){
		this.nombre=nombre1;
		this.apellido=apellido1;
	}
	
	public void setnombre (String nombre){
		this.nombre=nombre;
	}
	public String getnombre(){
		return nombre;
	}
	public void setapellido (String apellido){
		this.apellido=apellido;
	}
	public String getapellido(){
	return apellido;
	}
	public int getnumalumno(){
		return numalumno;
	}
	public void Incrementar(){
		Notamedia++;
	}
	public void resultado(){
		Incrementar();
	this.Incrementar();
	}
	public double getNotamedia(){
		return Notamedia;
	}
}