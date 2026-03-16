package bibliotheque;

public class Main {
	public static void main(String[] args) {
		Bibliotheque maBiblio = new Bibliotheque(10);

		// Ajout de différents types d'ouvrages
		maBiblio.ajout(new Livre("Zola", "Germinal", "GF"));
		maBiblio.ajout(new CD("Discovery", "Daft Punk"));
		maBiblio.ajout(new Periodique("Sciences et Avenir", 912, 30));

		// Affichage
		System.out.println(maBiblio);

		// Test de suppression
		maBiblio.suppression(2); // Supprime le CD (cote 2)

		// Affichage final
		System.out.println(maBiblio);
	}
}