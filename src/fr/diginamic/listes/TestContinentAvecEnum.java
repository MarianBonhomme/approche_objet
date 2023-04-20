package fr.diginamic.listes;

import java.util.ArrayList;
import java.util.List;

public class TestContinentAvecEnum {

	public static void main(String[] args) {
		List<Ville> listeVilles = new ArrayList<Ville>();
		listeVilles.add(new Ville("New York", 22116176, Continents.AMERIQUE));
		listeVilles.add(new Ville("Paris", 2161000, Continents.EUROPE));
		listeVilles.add(new Ville("Pékin", 21054000, Continents.ASIE));
		listeVilles.add(new Ville("Moscou", 11098000, Continents.ASIE));
		listeVilles.add(new Ville("Berlin", 3645000, Continents.EUROPE));
		listeVilles.add(new Ville("Sydney", 5312000, Continents.OCEANIE));
		listeVilles.add(new Ville("Sao Paulo", 12033000, Continents.AMERIQUE));
		listeVilles.add(new Ville("Dakar", 1250000, Continents.AFRIQUE));
		
		for (Ville ville : listeVilles) {
			System.out.println(ville.getNomVille() + " " + ville.getContinent());
		}
	}

}
