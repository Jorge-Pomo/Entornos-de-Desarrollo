package act1;

public class Euro extends Moneda{
	
	//Atributos
	private String denominacion;
	
	//Constructor
	public Euro(int monedas, String denominacion) {
		cantidad = monedas;
		this.denominacion = "EUR";
	}

	//Metodos
	public Moneda multiplicadoPor(int num) {
		return Moneda.euro(cantidad * num);
	}
	
	public String denominacion() {
		return denominacion;
	}
	
	
//	public boolean equals(Object object) {
//		Euro euro = (Euro) object;
//		return cantidad == euro.cantidad;
//	}

}
