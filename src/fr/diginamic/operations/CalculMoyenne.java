package fr.diginamic.operations;

import java.util.Arrays;

public class CalculMoyenne {

	public static double[] ajout(double[] tableau, double a) {
		int n = tableau.length;
		tableau = Arrays.copyOf(tableau, n + 1);
		tableau[n] = a;
		return tableau;
	}

	public static double calcul(double[] tableau) {
		double moy = 0;
		for (double i : tableau) {
			moy = moy + i;
		}
		moy = moy / tableau.length;
		return moy;
	}
}
