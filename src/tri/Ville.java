package tri;

import java.util.*;
import java.util.Comparator;

public class Ville implements Comparable<Ville> {

	public static void main(String[] args) {

		ArrayList<Ville> liste = new ArrayList<Ville>();

		liste.add(new Ville("Nice", 343000));
		liste.add(new Ville("Carcasonne", 47800));
		liste.add(new Ville("Narbonne", 53400));
		liste.add(new Ville("Lyon", 484000));
		liste.add(new Ville("Foix", 9700));
		liste.add(new Ville("Pau", 77200));
		liste.add(new Ville("Marseille", 850700));
		liste.add(new Ville("Tarbes", 40600));

		System.out.println("-------------------------------------------- TP liste -------------------------------------------------------");
		System.out.println(liste);

//		Afficher ville la plus peuplée
		int max = 0;
		int index = 0;
		for (Ville i : liste) {
			if (i.getNbHabitant() > max) {
				max = i.getNbHabitant();
				index = liste.indexOf(i);
			}
		}
		System.out.println(liste.get(index));

//		Supprimer ville la moins peuplée
		Integer min = Integer.MAX_VALUE;
		index = 0;
		for (Ville i : liste) {
			if (i.getNbHabitant() < min) {
				min = i.getNbHabitant();
				index = liste.indexOf(i);
			}
		}

		liste.remove(index);
		System.out.println(liste);

//		Mettre en majuscule les villes de plus de 100 000 habitants
		index = 0;
		for (Ville i : liste) {
			if (i.getNbHabitant() > 100000) {
				index = liste.indexOf(i);
				i.setNomVille(i.getNomVille().toUpperCase());
				liste.set(index, i);
			}
		}
		System.out.println(liste);
		
		System.out.println("");
		System.out.println("-------------------------------------------- TP tri -------------------------------------------------------");
		
		ArrayList<Ville> liste2 = new ArrayList<Ville>();
		
		for (Ville i : liste) {
			liste2.add(i);
		}
		
		Collections.sort(liste2);
		System.out.println(liste2);		

		
		ArrayList<Ville> liste3 = liste;
		System.out.println(liste3);
		
		ComparatorHabitant ComparatorHabitant = new ComparatorHabitant();
		liste3.sort(ComparatorHabitant);
		System.out.println(liste3);
		
		ComparatorNom ComparatorNom = new ComparatorNom();
		liste3.sort(ComparatorNom);
		System.out.println(liste3);		
	}

	private String nomVille;
	private int nbHabitant;

	public Ville(String nomVille, int nbHabitant) {
		this.nomVille = nomVille;
		this.nbHabitant = nbHabitant;
	}

	public String toString() {
		return nomVille + " " + nbHabitant + " hab |";
	}

	public String getNomVille() {
		return nomVille;
	}

	public void setNomVille(String nomVille) {
		this.nomVille = nomVille;
	}

	public int getNbHabitant() {
		return nbHabitant;
	}

	public void setNbHabitant(int nbHabitant) {
		this.nbHabitant = nbHabitant;
	}

	public int compareTo(Ville o) {
//		return this.getNomVille().compareTo(o.getNomVille());
		return (this.nbHabitant - o.nbHabitant);
	}
}
