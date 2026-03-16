package bibliotheque;

public class Livre extends Ouvrage {
    private String auteur, titre, editeur;

    public Livre(String auteur, String titre, String editeur) {
        super(); // Appelle le constructeur d'Ouvrage pour la cote
        this.auteur = auteur;
        this.titre = titre;
        this.editeur = editeur;
    }

    @Override
    public String toString() {
        return super.toString() + " | [Livre] " + titre + " de " + auteur + " (Ed: " + editeur + ")";
    }
}