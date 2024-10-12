package ar.com.ejemplofacade.model;

public class ReproductorDeDvd {
	
	public boolean encendido;
	public String reproducirPelicula;
	
	
	
	public ReproductorDeDvd() {
		super();
	}
	public ReproductorDeDvd(boolean encendido, String reproducirPelicula) {
		super();
		this.encendido = encendido;
		this.reproducirPelicula = reproducirPelicula;
	}
	public boolean isEncendido() {
		return encendido;
	}
	public void setEncendido(boolean encendido) {
		this.encendido = encendido;
	}
	public String getReproducirPelicula() {
		return reproducirPelicula;
	}
	public void setReproducirPelicula(String reproducirPelicula) {
		this.reproducirPelicula = reproducirPelicula;
	}
	
	
}
