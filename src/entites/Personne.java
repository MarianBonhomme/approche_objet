package entites;

public class Personne {
	public String nom;
	public String prenom;
	public AdressePostale adresse;
	
	public Personne (String nom, String prenom, AdressePostale adresse) {
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
	}

	@Override
	public String toString() {
		return "Personne [name=" + this.nom + ", prename=" + this.nom + ", adress=" + this.adresse + "]";
	}
	
	public void afficher() {
		System.out.println(this.nom.toUpperCase() + " " + this.prenom);
	}
	
	public void setNom(String nvnom) {
		nom = nvnom;
	}
	
	public void setPrenom(String nvprenom) {
		prenom = nvprenom;
	}
	
	public void setAdresse(AdressePostale nvadresse) {
		adresse = nvadresse;
	}
	
	public String getNom() {
		return nom;
	}
	
	public String getPrenom() {
		return prenom;
	}
	
	public AdressePostale getAdresse() {
		return adresse;
	}
	
}
