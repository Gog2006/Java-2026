package bibliotheque;

public class Periodique extends Ouvrage {
    private String nom;
    private int numero, periodicite;

    public Periodique(String nom, int numero, int periodicite) {
        super();
        this.nom = nom;
        this.numero = numero;
        this.periodicite = periodicite;
    }

    @Override
    public String toString() {
        return super.toString() + " | [Périodique] " + nom + " n°" + numero + " (tous les " + periodicite + " jours)";
    }
}