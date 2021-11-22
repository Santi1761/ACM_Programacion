package model;

public class ProgramadorRepetidoException extends Exception {
	
	private static final long serialVersionUID = 1L;
	private String nombre;
	
	
	public ProgramadorRepetidoException(String nombre) {
		
		super("Este nombre ya esta en uso: "+nombre );	
		this.nombre = nombre;
	}

	
	public String getNombre() {
		
		return nombre;
	}
}
