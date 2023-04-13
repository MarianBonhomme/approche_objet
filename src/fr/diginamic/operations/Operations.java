package fr.diginamic.operations;

public class Operations {

	public double a;
	public double b;
	public char operateur;

	public Operations(double a, double b, char operateur) {
		this.a = a;
		this.b = b;
		this.operateur = operateur;
	}

	public static double calcul(double a, double b, char operateur) {
		Operations operation = new Operations(a, b, operateur);
		if (operateur == '+') {
			return a + b;
		}
		if (operateur == '-') {
			return a - b;
		}
		if (operateur == '*') {
			return a * b;
		}
		if (operateur == '/') {
			return a / b;
		}
		return operateur;
	}
}
