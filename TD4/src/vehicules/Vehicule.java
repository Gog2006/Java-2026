package vehicules;

public class Vehicule {

    protected String marque;
    protected int dateAchat;
    protected double prixAchat;
    protected double prixCourant;

    public Vehicule(String m, int d, double p){
        marque = m;
        dateAchat = d;
        prixAchat = p;
        prixCourant = p;
    }

    public void calculePrix(int anneeActuelle){
    }

    public void affiche(){
        System.out.println(this.toString());
    }
}