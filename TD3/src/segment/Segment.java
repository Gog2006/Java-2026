package segment;

import point.Point;

public class Segment {
    
    // Attributs : deux points distincts
    private Point origine;
    private Point extremite;
    
    // Constructeur principal avec deux objets Point
    public Segment(Point origine, Point extremite) {
        // Vérification que les points sont distincts
        if (origine.x == extremite.x && origine.y == extremite.y) {
            System.out.println("2 points identiques ");
        }
        // On copie les points pour éviter les modifications externes
        this.origine = origine.getLocation();
        this.extremite = extremite.getLocation();
    }
    
    // Constructeur avec coordonnées directes
    public Segment(int x1, int y1, int x2, int y2) {
        this.origine = new Point(x1, y1);
        this.extremite = new Point(x2, y2);
    }
    
    // Constructeur par copie
    public Segment(Segment autre) {
        this.origine = autre.origine.getLocation();
        this.extremite = autre.extremite.getLocation();
    }
    
    // Accesseurs en lecture (getters)
    public Point getOrigine() {
        return origine.getLocation(); // Retourne une copie
    }
    
    public Point getExtremite() {
        return extremite.getLocation(); // Retourne une copie
    }
    
    // Méthode pour afficher le segment
    public void afficher() {
        System.out.print("Segment [");
        System.out.print("(" + origine.x + ", " + origine.y + ")");
        System.out.print(" -> ");
        System.out.print("(" + extremite.x + ", " + extremite.y + ")");
        System.out.println("]");
    }
    
    // Méthode pour calculer la longueur du segment
    public double longueur() {
        return origine.getDistance(extremite);
    }
 /** Projection du segment sur l'axe X (longueur horizontale)
  * Projection du segment sur l'axe Y (longueur verticale)
  */
    public Point project() {
        int dx = (int) Math.abs(extremite.x - origine.x);
        int dy = (int) Math.abs(extremite.y - origine.y);
        return new Point(dx, dy);
    }
    
    
    
/* @toString 
 * 
 * Méthode toString pour affichage alternatif
 */
    public String toString() {
        return "Segment[(" + origine.x + ", " + origine.y + 
               ") -> (" + extremite.x + ", " + extremite.y + ")]";
    }
    
}