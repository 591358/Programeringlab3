package no.hvl.dat100;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;

public class Oppgave2 {
	public static void main(String[] args) {
		int poengSum = parseInt(showInputDialog("Poeng sum:"));
		for (int i = 1; i <= 10; i++) {
			if (poengSum >= 0 && poengSum <= 39) {
				System.out.println("Din poeng sum var " + poengSum + " som tilsvarer karakteren F");
				poengSum = parseInt(showInputDialog("Poeng sum:"));

			} else if (poengSum >= 40 && poengSum <= 49) {
				System.out.println("Din poeng sum var " + poengSum + " som tilsvarer karakteren E");
				poengSum = parseInt(showInputDialog("Poeng sum:"));

			} else if (poengSum >= 50 && poengSum <= 59) {
				System.out.println("Din poeng sum var " + poengSum + " som tilsvarer karakteren D");
				poengSum = parseInt(showInputDialog("Poeng sum:"));

			} else if (poengSum >= 60 && poengSum <= 79) {
				System.out.println("Din poeng sum var " + poengSum + " som tilsvarer karakteren C");
				poengSum = parseInt(showInputDialog("Poeng sum:"));

			} else if (poengSum >= 80 && poengSum <= 89) {
				System.out.println("Din poeng sum var " + poengSum + " som tilsvarer karakteren B");
				poengSum = parseInt(showInputDialog("Poeng sum:"));

			} else if (poengSum >= 90 && poengSum <= 100) {
				System.out.println("Din poeng sum var " + poengSum + " som tilsvarer karakteren A");
				poengSum = parseInt(showInputDialog("Poeng sum:"));

			} else {
				System.out.println("Feilmedling: Ugyldig tall!");
				poengSum = parseInt(showInputDialog("Poeng sum: Husk Gyldig tall!"));
				i--;
				//i--; for å ikke telle ugyldige verdier som en av de 10 innlesningene.

			}
			
		}

	}

}

