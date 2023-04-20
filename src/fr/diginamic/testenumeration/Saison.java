package fr.diginamic.testenumeration;

public enum Saison {
	PRINTEMPS("Printemps", 1),
	ETE("Ete", 2),
	AUTOMNE("Automne", 3),
	HIVER("Hiver", 4);
	
	private String saison;
	private int ordre;

	private Saison(String saison, int ordre) {
		this.saison = saison;
		this.ordre = ordre;		
	}
	
	public static Saison returnInstance(String libelle) {
		Saison[] saisons = Saison.values();
		for (Saison saison : saisons) {
			if (libelle == saison.getSaison()) {
				return saison;
			}
		}
		return null;
	}

	public String getSaison() {
		return saison;
	}

	public void setSaison(String saison) {
		this.saison = saison;
	}

	public int getOrdre() {
		return ordre;
	}

	public void setOrdre(int ordre) {
		this.ordre = ordre;
	}
}
