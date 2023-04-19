package fichier;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class CreerFichier {

	public static void main(String[] args) throws IOException {

		Path path = Paths.get(
				"C:\\Users\\maria\\dev\\java\\workspace_spring\\approche_objet\\fichiers\\recensement.csv");
		ArrayList<String> lines = (ArrayList<String>) Files.readAllLines(path, StandardCharsets.UTF_8);
		List<String> lines2 = new ArrayList<>();

		for (int i = 0; i < 100; i++) {
			lines2.add(lines.get(i));
		}

		Path pathCible = Paths.get(
				"C:\\Users\\maria\\dev\\java\\workspace_spring\\approche_objet\\fichiers\\monFichier.txt");
		Files.write(pathCible, lines2);
	}

}
