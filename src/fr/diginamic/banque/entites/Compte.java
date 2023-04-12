package fr.diginamic.banque.entites;

public class Compte {

	private int numero;
	private double solde;

	public Compte(int numero, double solde) {
		super();
		this.numero = numero;
		this.solde = solde;
	}
	
	public String toString() {
		return "n°: " + numero + " solde: " + solde+"€";
	}

	public double getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(int solde) {
		this.solde = solde;
	}
}