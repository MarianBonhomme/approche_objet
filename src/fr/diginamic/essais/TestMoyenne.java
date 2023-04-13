package fr.diginamic.essais;

import java.util.Arrays;

import fr.diginamic.operations.CalculMoyenne;

public class TestMoyenne {

	public static void main(String[] args) {
		
		double[] tab1 = { 1, 2, 3 };
		System.out.println(Arrays.toString(tab1));
		
		tab1 = CalculMoyenne.ajout(tab1, 4);	
		
		System.out.println(Arrays.toString(tab1));
		System.out.println("La moyenne est : " + CalculMoyenne.calcul(tab1));
		
		
		System.out.println("--------------------------------");
			
		
		double[] tab2 = {57, 2, 9, 463, 6, 1, 83, 23};
		System.out.println(Arrays.toString(tab2));
		
		tab2 = CalculMoyenne.ajout(tab2, 1);
		tab2 = CalculMoyenne.ajout(tab2, 2);
		tab2 = CalculMoyenne.ajout(tab2, 3);
		
		System.out.println(Arrays.toString(tab2));
		System.out.println("La moyenne est : " + CalculMoyenne.calcul(tab2));
		
	}

}
