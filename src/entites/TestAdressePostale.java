package entites;

public class TestAdressePostale {

	public static void main(String[] args) {
		AdressePostale ville1 = new AdressePostale (10, "Rue Random", 34000, "Montpellier");
		System.out.println(ville1);
		
		AdressePostale ville2 = new AdressePostale (67, "Avenue de l'Europe", 54000, "Nancy");
		System.out.println(ville2);
	}

}
