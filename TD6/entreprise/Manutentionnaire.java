package entreprise;

public class Manutentionnaire extends Employe {
    private int heuresTravail;

    public Manutentionnaire(String prenom, String nom, int age, String dateEntree, int heuresTravail) {
        super(prenom, nom, age, dateEntree);
        this.heuresTravail = heuresTravail;
    }

    public int getHeuresTravail() { return heuresTravail; }

    @Override
    public double calculerSalaire() {
        return heuresTravail * 65;
    }

    @Override
    public String getNom() {
        return "Le manut. " + getPrenom() + " " + getNomFamille();
    }
}