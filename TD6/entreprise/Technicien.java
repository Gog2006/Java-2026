package entreprise;

public class Technicien extends Employe {
    private int unitesProduits;

    public Technicien(String prenom, String nom, int age, String dateEntree, int unitesProduits) {
        super(prenom, nom, age, dateEntree);
        this.unitesProduits = unitesProduits;
    }

    public int getUnitesProduits() { return unitesProduits; }

    @Override
    public double calculerSalaire() {
        return unitesProduits * 5;
    }

    @Override
    public String getNom() {
        return "Le technicien " + getPrenom() + " " + getNomFamille();
    }
}