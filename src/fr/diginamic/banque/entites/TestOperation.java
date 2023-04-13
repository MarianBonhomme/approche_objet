package fr.diginamic.banque.entites;

public class TestOperation {

	public static void main(String[] args) {
		Operation op1 = new Credit("18/03 ", 130.0);
		Operation op2 = new Debit("09/04 ", 10.3);
		Operation op3 = new Debit("13/08 ", 1450.0);
		Operation op4 = new Credit("05/02 ", 26.5);
		
		Operation[] operations = {op1, op2, op3, op4};
		
		for (Operation i : operations) {
			System.out.println(i.getType()+i.toString());
		}
		
		double total = 0;
		
		for (Operation i : operations) {
			if(i.getType() == "CREDIT | ") {
				
				total = total + i.getMontant();
			} else {
				total = total - i.getMontant();
			}
		}
		
		System.out.println(total);
	}
}
