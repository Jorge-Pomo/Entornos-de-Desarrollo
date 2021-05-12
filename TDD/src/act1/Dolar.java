package act1;

public class Dolar extends Moneda{

	//Cosas por hacer
		//TODO 5 USD + 10 EUR = 10 USD si el cambio es 2:1
		//TODO Usare punto flotante - redondeo?
		//TODO hashCode()
		//TODO Equal null
		//TODO Equal object
		//TODO multiplicarPor duplicado
		//TODO Duplicación Dolar Euro
	
		// 5 USD * 2 = 10 USD
		// Crear una moneda con 5 dolares
		// Efectos laterales de Dolar?
		// equals()
		// Hacer "cantidad" privado
		// **5 EUR*2 = 10 EUR**
		// equals duplicado
		// Comparar euros con dólares
		// Denominacion moneda?
		
	
	//Atributos
	private String denominacion;

	//Constructor
	public Dolar(int monedas, String denominacion) {
		cantidad = monedas;
		this.denominacion = denominacion;
	}

	//Metodos
	public Moneda multiplicadoPor(int num) {

		return Moneda.dolar(cantidad * num);
	}
	
	public String denominacion() {
		return denominacion;
	}
	
//	public boolean equals(Object object) {
//		Dolar dolar = (Dolar) object;
//		return cantidad == dolar.cantidad;
//	}

}
