package fichier;

public class Ville {
	String nom;
	String code;
	String region;
	String population;
	
	public Ville (String nom, String code, String region, String population){
		this.nom = nom;
		this.code = code;
		this.region = region;
		this.population = population;		
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getPopulation() {
		return population;
	}

	public void setPopulation(String population) {
		this.population = population;
	}

	@Override
	public String toString() {
		return "Ville: " + nom + ", Code:" + code + ", Region:" + region + ", Population:" + population;
	}
}
