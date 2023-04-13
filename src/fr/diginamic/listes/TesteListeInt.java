package fr.diginamic.listes;

import java.util.*;

public class TesteListeInt {

	public static void main(String[] args) {
		ArrayList<Integer> liste = new ArrayList<Integer>();
		liste.add(-1);
		liste.add(5);
		liste.add(7);
		liste.add(3);
		liste.add(-2);
		liste.add(4);
		liste.add(8);
		liste.add(5);

//		Afficher le plus grand élément
		System.out.println(liste + " | taille : " + liste.size());

		int max = 0;
		for (int i : liste) {
			if (i > max) {
				max = i;
			}
		}

		System.out.println("le plus grand élément est " + max);

//		Supprimer le plus petit élément
		Integer min = Integer.MAX_VALUE;
		for (int i : liste) {
			if (i < min) {
				min = i;
			}
		}

		liste.remove(Integer.valueOf(min));
		System.out.println(liste);
		
//		Remplacer les nombres néégatifs par des nombres positifs
		for (int i : liste) {
			if (i < 0) {
				liste.set(liste.indexOf(i), i*i);
			}
		}
		System.out.println(liste);

	}

}
