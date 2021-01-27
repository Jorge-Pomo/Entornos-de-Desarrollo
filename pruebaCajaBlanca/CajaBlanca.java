package pruebaCajaBlanca;

public class CajaBlanca {

	public static void ValidarTrinagulo(int a, int b, int c) {
		if (a <= 0 || b <= 0 || c <= 0) {
			System.out.println("Triangulo Inválido, lados negativos o ulos");
		}else {
			if ((a > b + c || b > a + c || c > a + b)) {
				System.out.println("Triangulo invalido, no desiguadad triangular");
			}else {
				if (a == b && b == c) {
					System.out.println("Triangulo Equilátero");
				}else {
					if (a == b || b == c || a == c) {
						System.out.println("Triangulo Is´steles");
					}else {
						System.out.println("Triangulo Escaleno");
					}
				}
			}
		}
		
		System.out.println("Fin del programa...");
	}

}
