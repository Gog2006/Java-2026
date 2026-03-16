package entreprise;

public abstract class Commercial extends Employe {
    private double chiffreAffaires;

    public Commercial(String prenom, String nom, int age, String dateEntree, double chiffreAffaires) {
        super(prenom, nom, age, dateEntree);
        this.chiffreAffaires = chiffreAffaires;
    }

    public double getChiffreAffaires() { return chiffreAffaires; }
}