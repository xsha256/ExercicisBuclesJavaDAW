package com.devM.ExercicisBucles01;

import java.util.Scanner;

public class Enters01 {

	public static void main(String[] args) {

		Scanner enterInputN1 = new Scanner(System.in);
		Scanner enterInputN2 = new Scanner(System.in);
		int numero1 = 0;
		int numero2 = 0;
		boolean valid = false;

		do {
			System.out.print("Itrodueix el primer número enter n1: ");
			if (enterInputN1.hasNextInt()) {
				numero1 = enterInputN1.nextInt();
				System.out.println("El primer valor enter: " + numero1);
				valid = true;

			} else {
				while (enterInputN1.nextLine().equals("")) {
				}
				System.out.println("No has introduït un valor enter");
			}

		} while (!valid);

		valid = false;

		do {
			System.out.print("Itrodueix el segon número enter n2, ha de ser > " + numero1 + ": ");
			if (enterInputN2.hasNextInt()) {
				numero2 = enterInputN2.nextInt();
				if (numero2 > numero1) {

					System.out.println("Els nombres enters entre " + numero1 + " i " + numero2 + ": ");
					System.out.print("[");
					for (int i = numero1; i <= numero2; i++) {
						System.out.print(i);
						if (i < numero2) {
							System.out.print(", ");
						}

					}
					System.out.print("]");
					valid = true;
				} else {

					System.out.println("El valor enter ha de ser major que " + numero1);
				}

			} else {
				while (enterInputN2.nextLine().equals("")) {
				}
				System.out.println("No has introduït un valor enter");
			}
		} while (!valid);
		enterInputN1.close();
		enterInputN2.close();
	}

}
