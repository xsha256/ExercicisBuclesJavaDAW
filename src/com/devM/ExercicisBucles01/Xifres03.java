package com.devM.ExercicisBucles01;

import java.util.Scanner;

public class Xifres03 {

	public static void main(String[] args) {

		Scanner enterInput = new Scanner(System.in);
		int numero = 0;
		int xifra = 0;
		boolean valid = false;

		do {
			System.out.print("Introdueix un número enter: ");
			if (enterInput.hasNextInt()) {
				numero = enterInput.nextInt();
				xifra = Integer.toString(Math.abs(numero)).length();
				if (xifra <= 1) {
					System.out.println("Has introduït el número: " + numero);
					System.out.println("El número " + numero + " té " + xifra + " xifra");
					valid = true;
				} else {
					System.out.println("Has introduït el número: " + numero);
					System.out.println("El número " + numero + " té " + xifra + " xifres");
					valid = true;
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
