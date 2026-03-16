package entreprise;

public class Vendeur extends Commercial {

    public Vendeur(String prenom, String nom, int age, String dateEntree, double chiffreAffaires) {
        super(prenom, nom, age, dateEntree, chiffreAffaires);
    }

    @Override
    public double calculerSalaire() {
        return getChiffreAffaires() * 0.20 + 400;
    }

    @Override
    public String getNom() {
        return "Le vendeur " + getPrenom() + " " + getNomFamille();
    }
}