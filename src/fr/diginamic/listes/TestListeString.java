package fr.diginamic.listes;

import java.util.ArrayList;

public class TestListeString {

	public static void main(String[] args) {
		ArrayList<String> liste = new ArrayList<String>();

		liste.add("Nice");
		liste.add("Carcasonne");
		liste.add("Narbonne");
		liste.add("Lyon");
		liste.add("Foix");
		liste.add("Pau");
		liste.add("Marseille");
		liste.add("Tarbes");

//		Trouver ville avec le plus grand nombre de lettres
		int maxLettre = 0;
		String villeMax = "";
		for (String i : liste) {
			if (i.length() > maxLettre) {
				maxLettre = i.length();
				villeMax = i;
			}
		}
		System.out.println(villeMax + " " + maxLettre);

//		Mettre tout en majuscule
		for (String i : liste) {
			liste.set(liste.indexOf(i), i.toUpperCase());			
		}
	
//		Supprimer vilels commencant par 'N'
		for (int j = 0; j < liste.size(); j++) {
			String test = liste.get(j);
			String a = "N";
			if (test.charAt(0) == a.charAt(0)) {
				liste.remove(j);
			}			
		}
		System.out.println(liste);


	}

}
