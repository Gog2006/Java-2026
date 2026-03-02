package vehicules;

public class Avion extends Vehicule {

    private String moteur;
    private int heuresVol;

    public Avion(String m, int d, double p,
                 String mo, int h){

        super(m,d,p);
        moteur = mo;
        heuresVol = h;
    }

    @Override
    public void calculePrix(int anneeActuelle){
        int age = anneeActuelle - dateAchat;
        prixCourant = prixAchat * (1 - 0.10 * age - 0.0001 * heuresVol);
    }

    @Override
    public String toString(){
        return "Avion : " + marque +
               " | Prix courant = " + prixCourant;
    }
}