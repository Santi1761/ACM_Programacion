package model;

import java.util.Collection;

public class Programador {

	private String nombre;
	private String telefono;
	private String direccion;
	private String eMail;
	private Programador izq;
	private Programador der;

	
	public Programador( String nombre, String telefono, String direccion, String eMail)	{
		
		this.nombre = nombre;
		this.telefono = telefono;
		this.direccion = direccion;
		this.eMail = eMail;
	}
		
	public int compareTo(Programador comparar) {
		
		return nombre.compareTo(comparar.darNombre());
	}
	
	
	public String darNombre() {
		
		return nombre;
	}
		

	public String darTelefono() {
		return telefono;
	}
	

	public String darDireccion() {
		
		return direccion;
	}

	
	public String dareMail() {
		
		return eMail;
	}
	
	
	public boolean esHoja()	{
		
		return true;
	}
	
	
	public Programador darMenor() {
		
		return null;
	}
	
	
	public Programador darMayor() {
		
		return null;
	}
	
	
	public int darAltura() {
		
		return 0;
	}
	
	
	public int darPeso() {
		
		return 0;
	}
	
	
	public void insertar(Programador toInsert){
		
	}
	
	
	public void buscar(String nombre) {
		
	}
	
	public void eliminar(String nombre)	{
		
	}
	
	
	@SuppressWarnings("rawtypes")
	public void inorden(Collection collection)	{
		
	}	
	
	
	public Programador getIzq() {
		
		return izq;
	}
	
	public Programador getDer() {
		
		return der;
	}
	

	
	
	
	public void setIzq(Programador izq) {
		this.izq = izq;
	}
	
	public void setDer(Programador der) {
		this.der = der;
	}
	

	
	
	
	public String toString() {
		
		return "El nombre es: "+ nombre+"\nSu telefono es: " + telefono +"\nSu ubicacion es: "+direccion+"\nSu correo electronico es: "+ eMail+"\n";
	}
	
}
