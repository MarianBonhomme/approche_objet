package fr.diginamic.maison;

public abstract class Piece {
	public int etage;
	public double superficie;
	
	public Piece(int etage, double superficie) {
		this.etage = etage;
		this.superficie = superficie;
	}

	@Override
	public String toString() {
		return "Piece [etage=" + etage + ", superficie=" + superficie + "]";
	}

	public int getEtage() {
		return etage;
	}

	public void setEtage(int etage) {
		this.etage = etage;
	}

	public double getSuperficie() {
		return superficie;
	}

	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}
}
