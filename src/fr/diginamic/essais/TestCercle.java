package fr.diginamic.essais;

import entites.*;
import utils.CercleFactory;

public class TestCercle {

	public static void main(String[] args) {

		Cercle c1 = new Cercle(9);
		Cercle c2 = new Cercle(15);
		
		System.out.println(c1.perimetre() + " " + c1.surface());
		System.out.println(c2.perimetre() + " " + c2.surface());
		
		System.out.println("-----------------------");
		
		Cercle c3 = CercleFactory.creer(18);		
		System.out.println(c3.perimetre() + " " + c3.surface());
	}

}
