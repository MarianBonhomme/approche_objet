package fr.diginamic.salaire;

public class Salarie extends Intervenant{
	public double salaire;
	
	public Salarie (String nom, String prenom, double salaire) {
		super(nom, prenom);
		this.salaire = salaire;
	}

	@Override
	public double getSalaire() {
		return this.salaire;
	}
	
	public String getStatut() {
		return "Salarie";
	}
}
