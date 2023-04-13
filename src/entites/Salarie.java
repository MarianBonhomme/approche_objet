package entites;

public class Salarie {
	String nom;
	String prenom;
	double salaire;
	
	public Salarie(String nom, String prenom, double salaire) {
		this.nom = nom;
		this.prenom = prenom;
		this.salaire = salaire;
	}

	@Override
	public String toString() {
		return nom + " " + prenom + " " + salaire + "€";
	}
}
