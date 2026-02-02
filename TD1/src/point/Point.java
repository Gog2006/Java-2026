package point;

import java.util.Scanner;

public class Point {

	public int x;
	public int y;
/**
 * Declaration de methodes basiques @Point, @Point
 */
	public Point() {
		this.x = 0;
		this.y = 0;
	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
/**
 *@getDistance 
 la function de la distance entre 2 points  
 * 
 * 
 */
	public double getDistance(Point p) {
		int dx = this.x - p.x;
		int dy = this.y - p.y;
		return Math.sqrt(dx * dx + dy * dy);
	}
/**
* @afficher la function de affichage 
 * 
 */
	public void afficher() {
		System.out.println("Point (" + x + ", " + y + ")");
	}
/**
 * 
 * @Demande une function de la demande de x et y entre par utilisateur  
 * 
 */
	public static Point demande() {
		try (Scanner point = new Scanner(System.in)) {
			System.out.print("Entrez x : ");
			int x = point.nextInt();

			System.out.print("Entrez y : ");
			int y = point.nextInt();

			return new Point(x, y);
		}
	}
/**
 * 
 * 
 * 
 * @getLocation function de copie d'une point 
 */
	public Point getLocation() {

		return new Point(this.x, this.y);

	}
/**
 * @setLocation Sets the location of the point to the specified location. This method is included for completeness, to parallel the setLocation method of Component.

 * 
 * @param p
 */
	public void setLocation​(Point p) {
	}

}
