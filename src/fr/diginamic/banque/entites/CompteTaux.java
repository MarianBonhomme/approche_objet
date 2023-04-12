package fr.diginamic.banque.entites;

//import fr.diginamic.banque.entites.Compte;

public class CompteTaux extends Compte {

	private float taux;

	public CompteTaux(int numero, double solde, float taux) {
		super(numero, solde);
		this.taux = taux;
	}
	
	public String toString() {
		String chaineCompte = super.toString();
		return chaineCompte + " taux: " + taux+"%";
	}
}
