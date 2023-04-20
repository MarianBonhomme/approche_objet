package maps;

import java.util.HashMap;

public class CréationMap {

	public static void main(String[] args) {
//		Exercice 1
		HashMap<String, Integer> mapSalaires = new HashMap<>();
		mapSalaires.put("Paul", 1750);
		mapSalaires.put("Hicham", 1825);
		mapSalaires.put("Yu", 2250);
		mapSalaires.put("Ingrid", 2015);
		mapSalaires.put("Chantal", 2418);
		System.out.println(mapSalaires.size());
		System.out.println("------------------------------------------------");

//		Exercice 2
		HashMap<Integer, String> mapVilles = new HashMap<>();
		mapVilles.put(13, "Marseille");
		mapVilles.put(34, "Montpellier");
		mapVilles.put(44, "Nantes");
		mapVilles.put(75, "Paris");
		mapVilles.put(31, "Toulouse");

		mapVilles.put(59, "Lilles");
		mapVilles.put(69, "Lyon");
		mapVilles.put(33, "Bordeaux");

		for (int i : mapVilles.keySet()) {
			System.out.println(i);
		}
		for (String s : mapVilles.values()) {
			System.out.println(s);
		}
		System.out.println("------------------------------------------------");

//		Exercice 3
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(1, "Rouge");
		map1.put(2, "Vert");
		map1.put(3, "Orange");

		HashMap<Integer, String> map2 = new HashMap<Integer, String>();
		map2.put(4, "Blanc");
		map2.put(5, "Bleu");
		map2.put(6, "Orange");

		HashMap<Integer, String> map3 = new HashMap<Integer, String>();
		for (int i = 1; i < map1.size() + map2.size(); i++) {
			if (i < 3) {
				map3.put(Integer.parseInt(map1.keySet().toString()), map1.values().toString());
			} else {
				map3.put(Integer.parseInt(map2.keySet().toString()), map2.values().toString());
			}
		}
		for (int i : mapVilles.keySet()) {
			System.out.println(i);
		}
		for (String s : mapVilles.values()) {
			System.out.println(s);
		}
	}
}
