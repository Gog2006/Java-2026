package entreprise;

public class TechARisque extends Technicien implements ARisque {

    public TechARisque(String prenom, String nom, int age, String dateEntree, int unitesProduits) {
        super(prenom, nom, age, dateEntree, unitesProduits);
    }

    @Override
    public double calculerSalaire() {
        return super.calculerSalaire() + PRIME_RISQUE;
    }

    @Override
    public double getPrimeRisque() { return PRIME_RISQUE; }
}