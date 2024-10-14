package com.devM.ExercicisBucles01;

import java.util.Scanner;

public class Piramide05 {

	public static void main(String[] args) {

		Scanner numeroInput = new Scanner(System.in);
		int numeroUsuari = 0;
		boolean valid = false;

		do {
			System.out.print("Introdueix un número enter postiu: ");
			if (numeroInput.hasNextInt()) {
				numeroUsuari = numeroInput.nextInt();
				
				if (numeroUsuari >= 0) {
					
					System.out.println("Has introduït el número: " + numeroUsuari);
					for (int k = 0; k <= numeroUsuari; k++) {
						for (int i = k; i <= numeroUsuari; i++) {
							System.out.print(" ");
						}
						for (int j = 0; j < (k * 2 - 1); j++) {
							System.out.print("*");
						}
						System.out.println("");
						valid = true;
					}
				} else {
					System.out.println("El valor ha de ser positiu.");
				}
			} else {
				while (numeroInput.nextLine().equals("")) {
				}
				System.out.println("No has introduït un valor enter.");
			}
		} while (!valid);
		numeroInput.close();
	}

}
