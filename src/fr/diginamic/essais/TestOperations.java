package fr.diginamic.essais;
import fr.diginamic.operations.Operations;

public class TestOperations {

	public static void main(String[] args) {
		double addit = Operations.calcul(7, 2, '+');
		double soust = Operations.calcul(7, 2, '-');
		double multi = Operations.calcul(7, 2, '*');
		double divis = Operations.calcul(7, 2, '/');
		
		System.out.println(addit+" "+soust+" "+multi+" "+divis);
	}

}
