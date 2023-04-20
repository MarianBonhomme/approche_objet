package fr.diginamic.chaines;

public class TestStringBuilder {

	public static void main(String[] args) {

//		Avec StringBuilder
		long debut = System.currentTimeMillis();

		StringBuilder test = new StringBuilder();

		for (int i = 0; i < 100000; i++) {
			test.append(i);
		}

		long fin = System.currentTimeMillis();
		System.out.println("Avec StringBuilder : " + (fin - debut) + "ms");

//		Sans StringBuilder
		long debut2 = System.currentTimeMillis();

		String chaine2 = "";

		for (int i = 0; i < 100000; i++) {
			chaine2 = chaine2 + i;
		}

		long fin2 = System.currentTimeMillis();
		System.out.println("Sans StringBuilder : " + (fin2 - debut2) + "ms");
	}
}
