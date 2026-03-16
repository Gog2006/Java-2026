package bibliotheque;

public class Bibliotheque {
    private Ouvrage[] fonds;
    private int nbOuvrages;

    public Bibliotheque(int capaciteMax) {
        this.fonds = new Ouvrage[capaciteMax];
        this.nbOuvrages = 0;
    }

    public void ajout(Ouvrage o) {
        if (nbOuvrages < fonds.length) {
            fonds[nbOuvrages] = o;
            nbOuvrages++;
        } else {
            System.out.println("⚠️ Impossible d'ajouter : la bibliothèque est pleine !");
        }
    }

    public void suppression(int coteASupprimer) {
        int indexTrouve = -1;

        // 1. Chercher l'ouvrage
        for (int i = 0; i < nbOuvrages; i++) {
            if (fonds[i].getCote() == coteASupprimer) {
                indexTrouve = i;
                break;
            }
        }

        // 2. Si trouvé, on décale tout pour boucher le trou
        if (indexTrouve != -1) {
            for (int i = indexTrouve; i < nbOuvrages - 1; i++) {
                fonds[i] = fonds[i + 1];
            }
            fonds[nbOuvrages - 1] = null; // Nettoyage
            nbOuvrages--;
            System.out.println("✅ Ouvrage n°" + coteASupprimer + " supprimé.");
        } else {
            System.out.println("❌ Aucun ouvrage trouvé avec la cote " + coteASupprimer);
        }
    }

    @Override
    public String toString() {
        String resultat = "--- BIBLIOTHÈQUE (" + nbOuvrages + " ouvrages) ---\n";
        for (int i = 0; i < nbOuvrages; i++) {
            resultat += fonds[i].toString() + "\n";
        }
        return resultat;
    }
}