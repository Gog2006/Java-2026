package entreprise;

public class Personnel {
    private Employe[] employes;
    private int count;

    public Personnel() {
        this.employes = new Employe[100];
        this.count = 0;
    }

    public void ajouterEmploye(Employe e) {
        employes[count++] = e;
    }

    public void afficherSalaires() {
        for (int i = 0; i < count; i++) {
            System.out.println(employes[i].getNom() + " gagne "
                + employes[i].calculerSalaire() + " euros.");
        }
    }

    public double salaireMoyen() {
        double total = 0;
        for (int i = 0; i < count; i++) {
            total += employes[i].calculerSalaire();
        }
        return total / count;
    }
}