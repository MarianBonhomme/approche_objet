package fr.diginamic.essais;

import fr.diginamic.salaire.*;

public class TestIntervenant {

	public static void main(String[] args) {
		Salarie salaire = new Salarie("DUPONT", "Jean", 1890.3);		
		System.out.println(salaire.getSalaire());
		
		Pigiste pigiste = new Pigiste("TEST", "testeur", 10, 65.4);
		System.out.println(pigiste.getSalaire());
		
		System.out.println(salaire.afficherDonnees());
		System.out.println(pigiste.afficherDonnees());
	}

}
