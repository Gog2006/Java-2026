package ex2;

public  class Velo extends SansMoteur {
    private int nbVitesses;

    public Velo(int nbVitesses) {
        super();
        this.nbVitesses = nbVitesses;
    }

    public void transporter(String depart, String arrivee) {
        System.out.println("Le vélo n°" + getId() + " a roulé de " + depart + " à " + arrivee);
    }

    @Override
    public String toString() {
        return "Vélo [" + super.toString() + ", vitesses: " + nbVitesses + "]";
    }
}