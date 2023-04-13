package fr.diginamic.geometrie;
public class Rectangle implements ObjetGeometrique {

	double largeur;
	double longueur;

	public Rectangle(double largeur, double longueur) {
		this.largeur = largeur;
		this.longueur = longueur;
	}

	@Override
	public double perimetre() {
		return 2 * (largeur + longueur);
	}

	@Override
	public double surface() {
		return largeur * longueur;
	}
}
