package ex2;

public  class Camion extends Amoteur {
    private double volume;

    public Camion(double capaciteReservoir, double volume) {
        super(capaciteReservoir);
        this.volume = volume;
    }

    public void transporter(String materiau, int km) {
        if (enPanne()) {
            System.out.println("Plus d'essence");
        } else {
            rouler(km);
            System.out.println("Le camion n°" + getId() + " a transporté "
                + materiau + " sur " + km + " km");
        }
    }

    @Override
    public String toString() {
        return "Camion [" + super.toString() + ", volume: " + volume + "m³]";
    }
}
