package entites;

public class TestPersonne {

	public static void main(String[] args) {
		AdressePostale ville1 = new AdressePostale(10, "rue", 34000, "mtp");
		
		Personne personne1 = new Personne("test", "testtest", ville1);		
		Personne personne2 = new Personne("bnhm", "mar", ville1);		
		
		personne1.afficher();
		personne2.afficher();
		
		personne1.setNom("nouveau");
		personne1.setPrenom("nom");
		personne1.setAdresse(ville1);
		
		System.out.println(personne1.getNom());
		AdressePostale adr = personne1.getAdresse();
		System.out.println(adr);
	}
}
