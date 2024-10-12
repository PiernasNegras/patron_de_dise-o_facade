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
	
	public void CrearHomeTheaterFacade(ReproductorDeDvd dvd, Amplificador amp, Proyector proyector) {
		
	}
	
	
	
	
	
}
