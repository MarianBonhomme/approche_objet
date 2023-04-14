package fr.diginamic.salaire;

public class Pigiste extends Intervenant {
	public int nbJours;
	public double montantJourn;

	public Pigiste(String nom, String prenom, int nbJours, double montantJourn) {
		super(nom, prenom);
		this.nbJours = nbJours;
		this.montantJourn = montantJourn;
	}

	@Override
	public double getSalaire() {
		return nbJours*montantJourn;
	}
	
	public String getStatut() {
		return "Pigiste";
	}

}
