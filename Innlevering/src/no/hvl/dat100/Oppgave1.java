package no.hvl.dat100;

import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;

public class Oppgave1 {

	public static void main(String[] args) {
		//programmet skal regne skatt, og vise trinnskatten
		
		double brutto = parseInt(showInputDialog("Brutto inntekt: "));
		double skatt = 0.0;
		double trinn1 = 0.017;
		double trinn2 = 0.04;
		double trinn3 = 0.132;
		double trinn4 = 0.162;

		if (brutto < 184800) {
			skatt = 0.0;
			System.out.println("Siden du tjente " + brutto + " som er mindre enn 184800 kr " + "må du betale " + skatt
					+ "kr i skatt.");
		} else if (brutto >= 184800 && brutto <= 260100) {
			skatt = (brutto - 184800) * trinn1;
			System.out.println("Siden du tjente " + brutto + "kr som er innenfor skattetrinn 1, må du betale " + skatt
					+ "kr i skatt.");
			double trinnSkatt1 = (brutto - 184800) * trinn1;
			System.out.println("Selve trinnskatten er: " + trinnSkatt1 + "kr.");
		} else if (brutto >= 260100 && brutto <= 651250) {
			skatt = (brutto - 260100) * trinn2 + (260100 - 184800) * trinn1;
			System.out.println("Siden du tjente " + brutto + "kr som er innenfor skattetrinn 2, må du betale " + skatt
					+ "kr i skatt.");
			double trinnSkatt2 = (brutto - 260100) * trinn2;
			System.out.println("Selve trinnskatten er: " + trinnSkatt2 + "kr.");
		} else if (brutto >= 651250 && brutto <= 1021550) {
			skatt = (brutto - 651250) * trinn3 + (651250 - 260100) * trinn2 + (260100 - 184800) * trinn1;
			System.out.println("Siden du tjente " + brutto + "kr som er innenfor skattetrinn 3, må du betale " + skatt
					+ "kr i skatt.");
			double trinnSkatt3 = (brutto - 651250) * trinn3;
			System.out.println("Selve trinnskatten er: " + trinnSkatt3 + "kr.");
		} else {
			skatt = (brutto - 1021550) * trinn4 + (1021550 - 651250) * trinn3 + (651250 - 260100) * trinn2
					+ (260100 - 184800) * trinn1;
			System.out.println("Siden du tjente " + brutto + "kr som er innenfor skattetrinn 4, må du betale " + skatt
					+ "kr i skatt.");
			double trinnSkatt4 = (brutto - 1021550) * trinn4;
			System.out.println("Selve trinnskatten er: " + trinnSkatt4 + "kr.");
		}
	}


}


