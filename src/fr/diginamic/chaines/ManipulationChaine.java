package fr.diginamic.chaines;

import entites.Salarie;
import java.util.Arrays;

public class ManipulationChaine {

	public static void main(String[] args) {
		
		String chaine = "Durand;Marcel;2 523.5";
		
		System.out.println("Premier caractère: " + chaine.charAt(0));		

		System.out.println("Longueur: " + chaine.length());
		
		char c = ';';
		System.out.println("Index premier ';': " + chaine.indexOf(c));
		
		String nomFamille = chaine.substring(0, 6);
		System.out.println("Nom de famille: " + nomFamille);
		
		System.out.println("En majuscule: " + nomFamille.toUpperCase());

		System.out.println("En minuscule: " + nomFamille.toLowerCase());
		
		String[] mots = chaine.split(";");
		System.out.println(Arrays.toString(mots));
		
		System.out.println("-------------------------------");
		
		mots[2] = mots[2].replaceAll("\\s", "");		
		System.out.println(Arrays.toString(mots));
		
		Salarie salarie1 = new Salarie(mots[0], mots[1], Double.parseDouble(mots[2]));
		System.out.println(salarie1.toString());
	}

}
