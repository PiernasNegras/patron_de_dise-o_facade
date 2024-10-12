package ar.com.ejemplofacade.model;


public class Amplificador {

	public boolean encendido;
	
	
	
	
	public Amplificador() {
		super();
	}
	
	
	public Amplificador(boolean encendido) {
		super();
		this.encendido = encendido;
		
	}


	public boolean isEncendido() {
		return encendido;
	}
	public void setEncendido(boolean encendido) {
		this.encendido = encendido;
	}
	
	
	
}
