package com.devM.ExercicisBucles01;

import java.util.Scanner;

public class SumarFins04 {

	public static void main(String[] args) {
		Scanner numeroInput = new Scanner(System.in);
		int numeroUsuari = 0;
		int sumar = 0;
		int obtenirNumero = 0;
		boolean valid = false;

		do {
			System.out.print("Introdueix un número enter positiu: ");
			if (numeroInput.hasNextInt()) {
				numeroUsuari = numeroInput.nextInt();
				if (numeroUsuari >= 0) {
					for (int k = 0; k < 1; k++) {
						System.out.print("Número " + numeroUsuari + ": cal sumar ");
						for (int i = 0; i <= numeroUsuari; i++) {
							sumar += i;
							if (sumar <= numeroUsuari) {
								System.out.print(i + " ");
								obtenirNumero += i;

							}

						}

						System.out.println("per obtenir el número " + obtenirNumero);
						valid = true;
					}
				} else {
					System.out.println("El valor enter ha de ser positiu.");
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
