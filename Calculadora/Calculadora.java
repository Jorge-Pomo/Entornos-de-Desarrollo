package Calculadora;

public class Calculadora {

	private double a;
	private double b;
	private double c;
	
	public Calculadora(double x, double y, double z) {
		a = x;
		b = y;
		c = z;
	}
	
	public double suma() {
		double resul = a+b;
		return resul;
	}
	
	public double resta() {
		double resul = a-b;
		return resul;
	}
	
	public double multi() {
		double resul = a*b;
		return resul;
	}
	
	public double divi() {
		double resul = 0;
		if(b == 0) {
			String resul2 = "No se puede dividir entre 0";
		}else {
			resul = a / b;
		}
		
		return resul;
	}
	
	public double max() {
		double resul = 0;
		
		if(a > c && b > c) {
			resul = c;
		}else {
			if(a > b) {
				resul = a;
			}else {
				resul = b;
			}
		}
		
		return resul;
	}

	
}
