package fr.diginamic.testenumeration;

public class TestEnumeration {

	public static void main(String[] args) {
//		Afficher toutes les saisons
		Saison[] saisons = Saison.values();
		for (Saison saison : saisons) {
			System.out.println(saison.getSaison() + " " + saison.getOrdre());
		}
		
//		Retrouvé Ete
		String nom = "ETE";
		Saison saison = Saison.valueOf(nom);
		System.out.println(saison.getSaison() + " retrouvé");
		
//		Retourne instance en fonction du libellé
		String libelle = "Hiver";
		System.out.println(Saison.returnInstance(libelle));			
	}
}
