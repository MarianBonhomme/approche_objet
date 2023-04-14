package fr.diginamic.salaire;

public abstract class Intervenant {
	public String nom;
	public String prenom;
	
	public Intervenant(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}	
	
	public abstract double getSalaire();
	public abstract String getStatut();
	
	public String afficherDonnees() {
		return nom + " " + prenom + " " + getSalaire() + "€ " + getStatut();
	}
}
