package bibliotheque;

public class Ouvrage {
    private static int compteurCote = 1;
    private int cote;
    private String dateEmprunt;

    public Ouvrage() {
        this.cote = compteurCote++;
        this.dateEmprunt = null; // Initialement non emprunté
    }

    public int getCote() { return cote; }

    @Override
    public String toString() {
        String etat = (dateEmprunt == null) ? "disponible" : "emprunté le " + dateEmprunt;
        return "Cote: " + cote + " | État: " + etat;
    }
}