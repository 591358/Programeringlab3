package no.hvl.dat100;

import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;

//programmet tar en input i form av heltall, og finner fakulteten.
//programmet vil ikke fungere n�r fakulteten er h�yere en bit antallet til int
public class Oppgave3 {
	public static void main(String[] args) {
		int a = parseInt(showInputDialog("Heltall: "));
		int en = 1;
		for(int i = 1; i<=a; i++) {
			en=en*i;
			
		}
		System.out.println("Fakuluteten av " + a + " er " + en);
		showMessageDialog(null,"Fakulteten av " + a + " er " + en); //om  ut p� skjermen, tolkes bokstavlig talt.
		
	
	}

}

