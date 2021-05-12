package act1;

abstract public class Moneda {

	//Atributos
	protected int cantidad;
	protected String denominacion;
	
	//Constructores
	
	//Metodos
	public boolean equals(Object object) {
		Moneda moneda = (Moneda) object;
		return cantidad == moneda.cantidad && this.getClass().equals(moneda.getClass());
	}
	
	static Moneda dolar(int cantidad) {
		return new Dolar(cantidad, "USD");
	}
	
	static Moneda euro(int cantidad) {
		return new Euro(cantidad, "USD");
	}
	
	abstract Moneda multiplicadoPor(int num);
	
	static String denominacion() {
		return denominacion;
	}
}
