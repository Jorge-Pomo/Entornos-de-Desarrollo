package Exercicis;

import java.util.Scanner;

public class act1 {

	public static void main(String[] args) {
		// la suma de los "n" números pares a partir de "n"

		Scanner sc = new Scanner(System.in);
		
		//VARIABLES
		int num;
		int par = 0;
		int cont = 0;
		
		//ALGORITME
		
		System.out.println("Dime un número: ");
		num = sc.nextInt();

		cont = num;
		
			for (int i = 1; i <= cont; i++) {
				if(num % 2 == 0) {
					par = par + num;
					if(i != cont) {
						System.out.print(num+" + ");
					}else {
						System.out.print(num+" ");
					}
				}else {
					num = num + 1;
					par = par + num;
					if(i != cont) {
						System.out.print(num+" + ");
					}else {
						System.out.print(num+" ");
					}
				}
				num++;
			}
			System.out.print("= "+par);
	}

}
