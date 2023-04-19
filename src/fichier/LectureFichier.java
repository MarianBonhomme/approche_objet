package fichier;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class LectureFichier {

	public static void main(String[] args) throws IOException {

		Path path = Paths
				.get("C:\\Users\\maria\\dev\\java\\workspace_spring\\approche_objet\\fichiers\\recensement.csv");
		List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);

		System.out.println(lines);
		System.out.println("------------------------------------------");

		List<Ville> array = new ArrayList<Ville>();

		for (String i : lines) {
			String[] tokens = i.split(";");
			array.add(new Ville(tokens[6], tokens[0], tokens[1], tokens[9]));
		}

		for (Ville i : array) {
			System.out.println(i.toString());
		}

		System.out.println("------------------------------------------------");

		List<String> villes = new ArrayList<String>();

		for (int i = 0; i < array.size(); i++) {
			if (i == 0) {
				villes.add(array.get(i).toString());
			} else {
				if (Integer.parseInt(array.get(i).getPopulation().replaceAll("\\s", "")) >= 25000) {
					villes.add(array.get(i).toString());
				}
			}
		}
		
		Path pathCible = Paths
				.get("C:\\Users\\maria\\dev\\java\\workspace_spring\\approche_objet\\fichiers\\villes25000.txt");
		Files.write(pathCible, villes, StandardCharsets.UTF_8);
	}
}
