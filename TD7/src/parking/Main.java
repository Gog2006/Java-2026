package parking;

public class Main {
    public static void main(String[] args) {
        Voiture v1 = new Voiture("Peugeot", 2005, 13400.00, 1.4, 5, 4.0, 12000);
        Voiture v2 = new Voiture("Porsche", 2010, 160000.00, 3.6, 2, 25.0, 8320);
        Voiture v3 = new Voiture("Fiat", 1999, 8400.00, 1.2, 3, 5.0, 125000);

        Parking p = new Parking(5);

        p.garer(v1, 1);
        p.garer(v2, 3);
        p.garer(v3, 5);

        System.out.println(p);

        System.out.println("Lib place 3");
        p.liberer(3);

        System.out.println(p);

        System.out.println("Fiat est à la place : " + p.chercher(v3)); // IllegalStateException car libérée
    }
}
