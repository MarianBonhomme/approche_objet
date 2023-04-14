package fr.diginamic.maison;

import java.util.*;

public class Maison {
	public static ArrayList<Piece> liste = new ArrayList<Piece>();

	public static void ajouterPiece(Piece piece) {
		if (piece != null && piece.getEtage() >= 0 && piece.getSuperficie() >= 0) {
			liste.add(piece);
		} else {
			System.out.println("Erreur dans le renseignement des paramètres");
		}
	}

//	Retourne superficie totale
	public String getSuperficieTotale() {
		double total = 0;
		for (Piece piece : liste) {
			total = total + piece.getSuperficie();
		}
		return "Superficie totale : " + total;
	}

//	Retourne superficie par étage
	public String getSuperficieEtage(int etage) {
		double totalEtage = 0;
		for (Piece piece : liste) {
			if (piece.getEtage() == etage) {
				totalEtage = totalEtage + piece.getSuperficie();
			}
		}
		return "Superficie etage " + etage + " : " + totalEtage;
	}

//	Retourne superficie par type
	public String getSuperficieType(String type) {
		double totalType = 0;
		int nb = 0;
		for (Piece piece : liste) {
			Class a = piece.getClass();
			if (a.getName().substring(20).equals(type)) {
				totalType = totalType + piece.getSuperficie();
				nb++;
			}
		}
		return "Il y a " + nb + " " + type + " | Superficie totale : " + totalType;
	}
}
