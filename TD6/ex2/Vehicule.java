package ex2;

public  class Vehicule {
    private static int compteur = 0;
    private int id;
    private double distanceParcourue;

    public Vehicule() {
        this.id = ++compteur;
        this.distanceParcourue = 0;
    }

    public int getId() { return id; }
    
    public double getDistanceParcourue() { return distanceParcourue; }

    public void rouler(double distance) {
        this.distanceParcourue += distance;
    }

    public void calculePrix(int anneeActuelle) {
	}

    @Override
    public String toString() {
        return "Véhicule n°" + id + ", distance: " + distanceParcourue + " km";
    }
}