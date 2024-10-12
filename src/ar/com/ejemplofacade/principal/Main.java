package ar.com.ejemplofacade.principal;

import java.util.Scanner;

import ar.com.ejemplofacade.model.Amplificador;
import ar.com.ejemplofacade.model.HomeTheatherFacade;
import ar.com.ejemplofacade.model.Proyector;
import ar.com.ejemplofacade.model.ReproductorDeDvd;

public class Main {

	public static void main(String[] args) {
		
		menu();
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	public static void menu() {
		
		ReproductorDeDvd dvd = new ReproductorDeDvd();
		Amplificador amp = new Amplificador();
		Proyector proyector = new Proyector();
		String pelicula= null;
		String opcion;
		
		
		
		System.out.println("Bienvenido al sistema de homeTheater");
		
		System.out.println("Ingrese el nombre de la pelicula que quiere ver: ");
		
		Scanner ingreso = new Scanner(System.in);
		pelicula=ingreso.nextLine();
		
		HomeTheatherFacade homeTheater = new HomeTheatherFacade(dvd,amp,proyector); 
		homeTheater.MirarPelicula(pelicula);
		
		System.out.println("Desea ver otra película?: ");
		
		opcion = ingreso.nextLine();
		if(opcion.equals("no")) {
			homeTheater.ApagarTodo();
			
		}else {
			menu();
		}
		
		
	
		
		
		
		
		
		
	}


}

