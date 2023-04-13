package fr.diginamic.essais;

import entites.Theatre;

public class TestTheatre {

	public static void main(String[] args) {
		Theatre th1 = new Theatre("Moulin", 30000, 10000, 300000);
		
		th1.inscrire(6000, 30);
		th1.inscrire(10000, 20);
		th1.inscrire(3000, 25);
		th1.inscrire(1001, 50);
		
		System.out.println(th1.toString());	

	}

}
