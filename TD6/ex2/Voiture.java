package ex2;

public  class Voiture extends Amoteur {
    private int nbPlaces;

    public Voiture(double capaciteReservoir, int nbPlaces) {
        super(capaciteReservoir);
        this.nbPlaces = nbPlaces;
    }

    public void transporter(int n, int km) {
        if (enPanne()) {
            System.out.println("Plus d'essence");
        } else {
            rouler(km);
            System.out.println("La voiture n°" + getId() + " a transporté "
                + n + " personnes sur " + km + " km");
        }
    }

    @Override
    public String toString() {
        return "Voiture [" + super.toString() + ", places: " + nbPlaces + "]";
    }
}