package vehicules;

public class Voiture extends Vehicule {

    private double cylindree;
    private int nbPortes;
    private double puissance;
    private double kilometrage;

    public Voiture(String m, int d, double p,
                   double c, int n, double pu, double k){

        super(m,d,p);
        cylindree = c;
        nbPortes = n;
        puissance = pu;
        kilometrage = k;
    }

    @Override
    public void calculePrix(int anneeActuelle){
        int age = anneeActuelle - dateAchat;
        prixCourant = prixAchat * (1 - 0.02 * age - 0.00001 * kilometrage);
    }

    @Override
    public String toString(){
        return "Voiture : " + marque +
               " | Prix courant = " + prixCourant;
    }
}