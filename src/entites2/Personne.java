package entites2;

import entites.AdressePostale;

public class Personne {
	public String name;
	public String prename;
	public AdressePostale adress;
	
	public Personne (String nom, String prenom, AdressePostale adresse) {
		name = nom;
		prename = prenom;
		adress = adresse;
	}

	@Override
	public String toString() {
		return "Personne [name=" + name + ", prename=" + prename + ", adress=" + adress + "]";
	}
	
	
}
