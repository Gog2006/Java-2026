package segment;
import point.Point; 
public class TestSegment {
	// Méthode main pour tester la classe
    public static void main(String[] args) {
        
        // Création de points
        Point p1 = new Point(3, 4);
        Point p2 = new Point(0, 13);
        Point p3 = new Point(15, 3);
        
        System.out.println("Points créés :");
        p1.afficher();
        p2.afficher();
        p3.afficher();
        
        System.out.println("\n Création de segments");
        
        // Création de segments avec des objets Point
        Segment s1 = new Segment(p1, p2);
        Segment s2 = new Segment(p2, p3);
        
        // Création d'un segment avec coordonnées directes
        Segment s3 = new Segment(0, 0, 5, 5);
        
        // Affichage des segments
        System.out.println("\nAffichage avec la méthode afficher() :");
        s1.afficher();
        s2.afficher();
        s3.afficher();
        
        // Affichage avec toString()
        System.out.println("\nAffichage avec toString() :");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        
        // Calcul des longueurs
        System.out.println("\nLongueurs des segments");
        System.out.println("Longueur de s1 : " + s1.longueur());
        System.out.println("Longueur de s2 : " + s2.longueur());
        System.out.println("Longueur de s3 : " + s3.longueur());
        
        
        //test du projete 
        System.out.println("\n Projete du point");
        Point m = s1.project();
        m.afficher();
        
    }
}
