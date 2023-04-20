package fr.diginamic.listes;

public class TestEquals {

	public static void main(String[] args) {

		Ville ville1 = new Ville("Test", 10000);
		Ville ville2 = new Ville("Test", 10000);

		if (ville1.equals(ville2)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

		if (ville1 == ville2) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}

}
