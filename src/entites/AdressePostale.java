package entites;

public class AdressePostale {
	
	int numeroRue;
	String nomRue;
	int codePostal;
	String nomVille;
	
	AdressePostale(int num, String nom, int code, String ville) {
		numeroRue = num;
		nomRue = nom;
		codePostal = code;
		nomVille = ville;
	}

	@Override
	public String toString() {
		return "AdressePostale [numeroRue=" + numeroRue + ", nomRue=" + nomRue + ", codePostal=" + codePostal
				+ ", nomVille=" + nomVille + "]";
	}
	
}
