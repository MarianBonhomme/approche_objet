package fr.diginamic.geometrie;
public class TestObjetGeometrique {

	public static void main(String[] args) {
		ObjetGeometrique forme1 = new Cercle(10);
		ObjetGeometrique forme2 = new Rectangle(20,30);
		
		ObjetGeometrique[] formes = {forme1, forme2};
		
		for (ObjetGeometrique forme : formes ) {
			System.out.println(forme.perimetre() + " " + forme.surface());
		}

	}

}
