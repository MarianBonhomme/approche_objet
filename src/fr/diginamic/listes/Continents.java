package fr.diginamic.listes;

public enum Continents {
	AFRIQUE("afrique"),
	AMERIQUE("amerique"),
	ASIE("asie"),
	EUROPE("europe"),
	OCEANIE("oceanie");
	
	private String continent;

	Continents(String continent) {
		this.continent = continent;
	}

	public String getContinent() {
		return continent;
	}

	public void setContinent(String continent) {
		this.continent = continent;
	}
	
	
	
}
