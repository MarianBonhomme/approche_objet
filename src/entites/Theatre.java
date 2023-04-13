package entites;

public class Theatre {
	
	public String nom;
	public int nbMax;
	public int total;
	public int recette;
	
	public Theatre(String nom, int nbMax, int total, int recette) {
		this.nom = nom;
		this.nbMax = nbMax;
		this.total = total;
		this.recette = recette;
	}
	
	public void inscrire(int nbClient, int prix) {
		total = total + nbClient;
		if (total < nbMax) {
			recette = recette + (prix * nbClient);
		} else {
			total = 30000;
			System.out.println("La capacité max est atteinte");
		}
	}

	@Override
	public String toString() {
		return nom + " | Capacité: " + nbMax + " | total inscrits: " + total + " | recette: " + recette;
	}
}
