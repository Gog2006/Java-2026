package entreprise;

public abstract class Employe {
    private String prenom;
    private String nom;
    private int age;
    private String dateEntree;

    public Employe(String prenom, String nom, int age, String dateEntree) {
        this.prenom = prenom;
        this.nom = nom;
        this.age = age;
        this.dateEntree = dateEntree;
    }

    public abstract double calculerSalaire();

    public String getNom() {
        return "L'employé " + prenom + " " + nom;
    }

    public String getPrenom() { return prenom; }
    public String getNomFamille() { return nom; }
    public int getAge() { return age; }
    public String getDateEntree() { return dateEntree; }
}