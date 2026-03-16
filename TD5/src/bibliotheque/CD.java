package bibliotheque;

public class CD extends Ouvrage {
    private String titre, auteur;

    public CD(String titre, String auteur) {
        super();
        this.titre = titre;
        this.auteur = auteur;
    }

    @Override
    public String toString() {
        return super.toString() + " | [CD] " + titre + " par " + auteur;
    }
}