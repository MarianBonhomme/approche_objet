package fr.diginamic.banque.entites;

public class Credit extends Operation {
	public Credit(String date, double montant) {
		super(date, montant);
	}
	
	public String getType() {
		return "CREDIT | ";
	}

}
