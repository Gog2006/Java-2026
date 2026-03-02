package formes;


public class Main {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(5, 6);
        r.afficheSurface();

        Carre c = new Carre(4);
        c.afficheSurface();
        System.out.println("Côté : " + c.getCote());
    
    
        System.out.println(c instanceof Carre);
        System.out.println(c.getClass().getSimpleName());
    }
}