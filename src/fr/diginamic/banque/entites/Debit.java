package fr.diginamic.banque.entites;

public class Debit extends Operation {
	public Debit(String date, double montant) {
		super(date, montant);
	}
	
	public String getType() {
		return "DEBIT | ";
	}

}
