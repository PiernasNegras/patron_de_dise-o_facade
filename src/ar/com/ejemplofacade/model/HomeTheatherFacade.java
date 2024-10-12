package ar.com.ejemplofacade.model;

public class HomeTheatherFacade {

	private ReproductorDeDvd dvd;
	private Amplificador amp;
	private Proyector proyector;
	
	
	public HomeTheatherFacade() {
		super();
	}
	public HomeTheatherFacade(ReproductorDeDvd dvd, Amplificador amp, Proyector proyector) {
		super();
		this.dvd = dvd;
		this.amp = amp;
		this.proyector = proyector;
	}
	public ReproductorDeDvd getDvd() {
		return dvd;
	}
	public void setDvd(ReproductorDeDvd dvd) {
		this.dvd = dvd;
	}
	public Amplificador getAmp() {
		return amp;
	}
	public void setAmp(Amplificador amp) {
		this.amp = amp;
	}
	public Proyector getProyector() {
		return proyector;
	}
	public void setProyector(Proyector proyector) {
		this.proyector = proyector;
	}
	
	
	
	public void MirarPelicula(String pelicula) {
		dvd.setEncendido(true);
		dvd.setReproducirPelicula(pelicula);
		amp.setEncendido(true);
		proyector.setEncendido(true);
		System.out.println("Estado del dvd: "+dvd.isEncendido());
		System.out.println("Estado del amplificador: "+amp.isEncendido());
		System.out.println("Estado del proyector: "+proyector.isEncendido());
		System.out.println("Sistema home encendido");
		System.out.println("Mirando la siguiente película: "+dvd.getReproducirPelicula());
	}
	
	public void ApagarTodo() {
		
		dvd.setEncendido(false);
		amp.setEncendido(false);
		proyector.setEncendido(false);
		
		
		System.out.println("Apagando sistema...");
		System.out.println("Estado del dvd: "+dvd.isEncendido());
		System.out.println("Estado del amplificador: "+amp.isEncendido());
		System.out.println("Estado del proyector: "+proyector.isEncendido());
		System.out.println("Sistema Home apagado");
	}
	
	
	
	
}
