package ar.com.ejemplofacade.model;


public class Amplificador {

	public boolean encendido;
	public String volumen;
	
	
	
	public Amplificador() {
		super();
	}
	
	
	public Amplificador(boolean encendido, String volumen) {
		super();
		this.encendido = encendido;
		this.volumen = volumen;
	}


	public boolean isEncendido() {
		return encendido;
	}
	public void setEncendido(boolean encendido) {
		this.encendido = encendido;
	}
	public String getVolumen() {
		return volumen;
	}
	public void setVolumen(String volumen) {
		this.volumen = volumen;
	}
	
	
}
