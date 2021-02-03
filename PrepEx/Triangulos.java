package PrepEx;

public class Triangulos {

	public static String ValidarTriangulo(int a, int b, int c) {
		String resu = "h";

		if (a <= 0 || b <= 0 || c <= 0) {

			resu = "Triangulo Inválido, lados negativos o nulos";
		} else {

			if ((a > b + c || b > a + c || c > a + b)) {
				resu = "Triangulo Inválido, no desigualdad triangular";
			} else {
				if (a == b && b == c) {
					resu = "Triangulo Equilatero";
				} else {
					if (a == b || b == c || a == c) {
						resu = "Triangulo Isosteles";
					} else {
						resu = "Triangulo Escaleno";
					}
				}
			}

		}

		return resu;
	}
}
