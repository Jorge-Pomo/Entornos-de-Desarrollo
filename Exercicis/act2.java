package Exercicis;

public class act2 {

	public static int vector (int[] vector) {
		int resu = 0;
		
		for (int i = 0; i < vector.length; i++) {
			if ((i % 2) == 0) {
				if((vector[i] % 2) == 0) {
					resu++;
				}
			}
		}
		return resu;
	}
	
	
	public static void main(String[] args) {
		
		int[] vector = {3,2,6,7,8,9,1};
		
		int resu = vector(vector);
		System.out.println(resu);
	}

}
