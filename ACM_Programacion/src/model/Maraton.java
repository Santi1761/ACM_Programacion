package model;

import java.util.ArrayList;
import java.util.Collection;


public class Maraton {
	
	private Programador programador;
	
	
	public Maraton() {
		
	}
	
	
	public void agregarProgramador(String nombre, String telefono, String direccion, String eMail) throws ProgramadorRepetidoException {
		
		Programador paraAgregar = new Programador(nombre, telefono, direccion, eMail);
		
		if(programador == null) {
			
			programador = paraAgregar;
		}
		
		else {
			
			agregarProgramador(paraAgregar, programador );
		}
	}
	
	
	public void agregarProgramador(Programador programadorNuevo, Programador presente ) throws ProgramadorRepetidoException	{
		
		
		if(buscarProgramador(programadorNuevo)==null)	{
			
			if(programadorNuevo.compareTo(presente)<0) {
				
				if(presente.getIzq() != null) {
					
					agregarProgramador(programadorNuevo,presente.getIzq());
				} 
				
				else {
					
					presente.setIzq(programadorNuevo);
				}
				
			}
			else if(programadorNuevo.compareTo(presente) >= 0) {	
				
				if(presente.getDer() != null) {
					
					agregarProgramador(programadorNuevo, presente.getDer());
				} 
				
				else {
					presente.setDer(programadorNuevo);
					
				}
			}
		}
		
		else {
			
			throw new ProgramadorRepetidoException(programadorNuevo.darNombre());
		}
	}
	
	
	public Programador buscarProgramador(Programador programadorNuevo) {
		
		if(programador == null) {
			
			return null;
		}
		
		else {
			
			return buscarProgramador(programador, programadorNuevo);
		}

	}
	
	
	public Programador buscarProgramador(Programador presente, Programador programadorNuevo) {
		
		if(presente == null) {
			
			return presente;
		}
		
		else if(presente.darNombre().equalsIgnoreCase(programadorNuevo.darNombre()) ) {
			
			return presente;
		}
		
		else if( programadorNuevo.compareTo(presente) >= 0){
			
			return buscarProgramador(presente.getDer(), programadorNuevo);
		}
		
		else {
			
			return buscarProgramador(presente.getIzq(), programadorNuevo);
		}
	}
	
	
	public ArrayList<String> inorden( ArrayList<String> acumulado, Programador agregar) {
		
		if(agregar != null) {
			
			inorden(acumulado, agregar.getIzq());
			acumulado.add( agregar.darNombre());
			inorden(acumulado, agregar.getDer());
		}
		
		return acumulado;
	}	
	
	
	public int darAltura(Programador aux2) {
		
		if(aux2 != null)	{
			
			int alturaIzq = darAltura(aux2.getIzq());
			int alturaDer = darAltura(aux2.getDer());
			return 1 + Math.max( alturaIzq, alturaDer);
		}
		
		return 0;
	}
	
		
	public Collection<Programador> darListaProgramadores() {
		
		return null;
	}
	
	
	public void eliminarProgramador(String nombre) {
		
	}
	

	public Programador getProgramador() {
		
		return programador;
	}
}
