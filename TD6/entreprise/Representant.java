package entreprise;

public class Representant extends Commercial {

    public Representant(String prenom, String nom, int age, String dateEntree, double chiffreAffaires) {
        super(prenom, nom, age, dateEntree, chiffreAffaires);
    }

    @Override
    public double calculerSalaire() {
        return getChiffreAffaires() * 0.20 + 800;
    }

    @Override
    public String getNom() {
        return "Le représentant " + getPrenom() + " " + getNomFamille();
    }
}