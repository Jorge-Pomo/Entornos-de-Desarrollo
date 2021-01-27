package cafetera;

public class cafetera {

	// Atributos
	private int capacidadMaxima;
	private int cantidadActual;
	
	// Constructor predeterminado
	public cafetera() {
		this.capacidadMaxima = 2500;
		this.cantidadActual = 0;
	}
	
	// Constructor capacidad maxima = a la actual
	public cafetera(int capacidadMax) {
		cantidadActual = capacidadMaxima;
	}

	
	// Si la cantidad actual es mayor que la maxima, se ajusta al maximo
	public cafetera(int capacidadAMax, int capacidad) {
		if(cantidadActual > capacidadMaxima) {
			cantidadActual = capacidadMaxima;
		}
	}
	
	// Getters and Setters
	public int getCapacidadMaxima() {
		return capacidadMaxima;
	}

	public int getCantidadActual() {
		return cantidadActual;
	}
	
	// Metodos
	public void llenarCafetera() {
		this.cantidadActual = this.capacidadMaxima;
	}
	
	public void servirTaza(int taza) {
		taza = 50;
		
		if(cantidadActual < taza) {
			cantidadActual = 0;
		}else {
			cantidadActual = cantidadActual - taza;
		}
	}
	
	public void vaciarCafetera() {
		cantidadActual = 0;
	}
	
	public void agregarCafe(int añadeCafe) {
		cantidadActual = cantidadActual + añadeCafe;
	}

}
