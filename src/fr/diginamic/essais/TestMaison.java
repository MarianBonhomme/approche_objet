package fr.diginamic.essais;

import fr.diginamic.maison.*;

public class TestMaison {

	public static void main(String[] args) {
		Maison maison1 = new Maison();

//		Ajout des pièces de la maison
		Maison.ajouterPiece(new Salon(0, 30));
		Maison.ajouterPiece(new Cuisine(0, 20));
		Maison.ajouterPiece(new SalleDeBain(0, 10));
		Maison.ajouterPiece(new WC(0, 5));
		Maison.ajouterPiece(new Chambre(1, 20));
		Maison.ajouterPiece(new Chambre(1, 25));
		Maison.ajouterPiece(new Chambre(1, 5));
		
//		Affichage de la liste
		for (Piece piece : Maison.liste) {
			System.out.println(piece.toString());
		}
		
		System.out.println("--------------------------------------");

//		Test méthodes de superficie
		System.out.println(maison1.getSuperficieTotale());
		System.out.println(maison1.getSuperficieEtage(0));
		System.out.println(maison1.getSuperficieEtage(1));
		System.out.println(maison1.getSuperficieEtage(2));

		System.out.println("--------------------------------------");

//		Test controle 
		Maison.ajouterPiece(null);
		Maison.ajouterPiece(new WC(-10, 10));
		
		System.out.println("--------------------------------------");
		
		System.out.println(maison1.getSuperficieType("Chambre"));
		System.out.println(maison1.getSuperficieType("Salon"));
		
		

	}

}
