package ex2;


public abstract class Amoteur extends Vehicule {
    private double capaciteReservoir;
    private double niveauEssence;

    public Amoteur(double capaciteReservoir) {
        super();
        this.capaciteReservoir = capaciteReservoir;
        this.niveauEssence = 0;
    }

    public void approvisionner(double nbLitres) {
        niveauEssence = Math.min(niveauEssence + nbLitres, capaciteReservoir);
    }

    public boolean enPanne() {
        return niveauEssence <= 0;
    }

    @Override
    public String toString() {
        return super.toString() + ", réservoir: " + niveauEssence + "/" + capaciteReservoir + "L";
    }
}
