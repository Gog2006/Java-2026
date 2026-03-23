
package point;


public class Main {
	public static void main(String[] args) {

		Point p1 = new Point(3, 4);
		Point p2 = new Point(0, 13);
		Point p3 = new Point(15, 3);

		p2.afficher();

		Point p4 = Point.demande();
		Point p5 = p2.getLocation();
		Point p6 = p5.getLocation();

		p1.afficher();
		p2.afficher();
		p3.afficher();
		p4.afficher();
		p5.afficher();
		p6.afficher();

		System.out.println("Distance entre p1 et p2: " + p1.getDistance(p2));
	}

}
