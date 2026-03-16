package entreprise;

public class ManutARisque extends Manutentionnaire implements ARisque {

    public ManutARisque(String prenom, String nom, int age, String dateEntree, int heuresTravail) {
        super(prenom, nom, age, dateEntree, heuresTravail);
    }

    @Override
    public double calculerSalaire() {
        return super.calculerSalaire() + PRIME_RISQUE;
    }

    @Override
    public double getPrimeRisque() { return PRIME_RISQUE; }
}