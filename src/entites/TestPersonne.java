package entites;

import entites2.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		AdressePostale ville1 = new AdressePostale(10, "rue", 34000, "mtp");
		
		Personne personne1 = new Personne("test", "testtest", ville1);
		System.out.println(personne1);
		
		Personne personne2 = new Personne("bnhm", "mar", ville1);
		System.out.println(personne2);
	}
}
