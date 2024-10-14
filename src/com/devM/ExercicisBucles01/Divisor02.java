package com.devM.ExercicisBucles01;

import java.util.Scanner;

public class Divisor02 {

	public static void main(String[] args) {

		Scanner enterInput = new Scanner(System.in);
		int numero = 0;
		int majorDivisor = 0;
		boolean valid = false;

		do {
			System.out.print("Itrodueix un número enter major o igual que 2: ");
			if (enterInput.hasNextInt()) {
				numero = enterInput.nextInt();
				if (numero > 1) {
					for (int i = 2; i < numero; i++) {
						if (numero % i == 0) {
							majorDivisor = i;
							valid = true;
						}
					}
					if (valid) {
						System.out.println("El major divisor de " + numero + " ès: " + majorDivisor);
					} else {
						System.out.println("No s'ha trobat cap divisor de " + numero + ", ès un nombre primer.");
						valid = true;
					}

				} else {
					System.out.println("El valor ha de ser major o igual que 2");
				}

			} else {
				while (enterInput.nextLine().equals("")) {
				}
				System.out.println("No has introduït un valor enter");
			}

		} while (!valid);

		enterInput.close();
	}

}
