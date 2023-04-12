package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.CompteTaux;

public class TestBanque {

	public static void main(String[] args) {
		Compte bq1 = new Compte(34837, 10000);
		String chaine = bq1.toString();
		System.out.println(chaine);
		
		Compte bq2 = new CompteTaux(58478, 100, 10);
		String chaine2 = bq2.toString();
		System.out.println(chaine2);
		
		System.out.println("-----------------------------------------");
		
		Compte[] tableau = {bq1, bq2};
		
		for (Compte i : tableau) {
			System.out.println(i.toString());
		}
		
		
	}
}
