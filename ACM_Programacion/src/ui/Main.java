package ui;

import java.util.ArrayList;
import model.Maraton;
import model.Programador;
import model.ProgramadorRepetidoException;


public class Main {
	
	private static Maraton maraton;
	
	public static void main(String[] args) {
		
		maraton = new Maraton();
		
		System.out.println("Holaa Bienenid@ :D\n");
		agregar("Santiago", "911", "Cali", "pepflores@yopmail.com");
		agregar("Felipe", "123", "Bogota", "bot22@hotmail.com");
		agregar("Karen", "321", "Medellin", "barbIe@yahoo.es");
		agregar("Gonzalo", "317", "Ibague", "gozocongonzo@instagram.com");
		
		printInorder(maraton.getProgramador());
		
		ArrayList<String> recolectado = new ArrayList<String>();
		printList( maraton.inorden(recolectado, maraton.getProgramador()), 0);
		
		System.out.println("La altura del registro es: "+maraton.darAltura(maraton.getProgramador()));
	}

	public static void agregar(String nombre, String telefono, String direccion, String eMail) {
		
		try {
			
			maraton.agregarProgramador(nombre,telefono,direccion, eMail);
		} 
		
		catch (ProgramadorRepetidoException exception) {
			
			System.err.println(exception.getMessage());
		}
	}
	
	
	public static void printInorder(Programador person) {
		
		if(person != null) {	
			
			printInorder (person.getIzq());
			System.out.println(person.toString());
			printInorder(person.getDer());	
		}
	}


	public static void printList(ArrayList<String> recolectado, int aux) {
		
		if(aux<recolectado.size() && recolectado.get(aux) != null ) {
			
			System.out.println(recolectado.get(aux));
			aux = aux+1;
			printList(recolectado, aux);
		}
	}
}
