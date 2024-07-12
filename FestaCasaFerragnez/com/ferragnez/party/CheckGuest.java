package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {

	public static void main(String[] args) {
		

		String [] invitati = {"Dua Lipa" , "Paris Hilton" , "Manuel Agnelli" , "J-Ax" , "Francesco Totti" , "Ilary Blasi" , "Bebe Vio", "Luis", "Pardis Zarei" , "Martina Maccherone", "Rachel Zeilic"};
		String nome;
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Inserire nome utente");
		nome = scanner.nextLine();
		
		scanner.close();

		boolean valoreFalso = false;
		

		
	   int i = 0;
	   while (i < invitati.length && valoreFalso == false ) {
			if (nome.equals(invitati[i])) {
				valoreFalso = true;
		}
		i++;
		} if (valoreFalso) {
		System.out.println("Presente in lista");
		} else
			System.out.println("Non presente in lista");

	}
}
