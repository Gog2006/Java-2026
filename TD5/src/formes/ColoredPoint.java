package formes;

import java.awt.Color;

import point.Point;

public class ColoredPoint extends Point {
	Color couleur;

	public ColoredPoint() {
		super();
	}

	public ColoredPoint(double x, double y) {
		super(x, y);
	}

	public ColoredPoint(Color c) {
		this();
		couleur = c;
	}

	public ColoredPoint(double x, double y, Color c) {
		this(x, y);
		couleur = c;
	}

	public boolean memeCouleur(ColoredPoint p) {
		return p.couleur == this.couleur;

	}

	public ColoredPoint projX() {
		return new ColoredPoint(this.getX(), 0, couleur);
	}

	public ColoredPoint projY() {
		return new ColoredPoint(0, this.getY(), couleur);
	}

	public ColoredPoint projX(Color c) {
		return new ColoredPoint(this.getX(), 0, c);
	}

	public ColoredPoint projY(Color c) {
		return new ColoredPoint(0, this.getY(), c);
	}

	@Override
	public boolean equals(Object pp) {
		if (pp == null || !(pp instanceof Point))
			return false;
		ColoredPoint p = (ColoredPoint) pp;

		return this.equals(p) && this.memeCouleur(p);

	}

	@Override
	public String toString() {
		return super.toString() + " : " + couleur;
	}

	public static void main(String[] args) {
		Point[] points = new Point[10];

		for (int i = 0; i < 5; i++) {
			points[i] = new Point(i, 5 - i);
		}

		Color[] couleurs = { Color.RED, Color.BLUE, Color.GREEN, Color.BLACK, Color.WHITE };
		for (int i = 0; i < 5; i++) {
			points[i + 5] = new ColoredPoint(i + 1, i + 1, couleurs[i]);
		}

		for (Point p : points) {
			System.out.println("--- Objet : " + p.toString() + " ---");
			System.out.println("Classe réelle (getName) : " + p.getClass().getName());
			System.out.println("Est un ColoredPoint ? " + (p instanceof ColoredPoint));

			System.out.println("Distance à l'origine : " + p.getDistance(new Point(0, 0)));

			System.out.println("Projection X colorée : " + p.projX());

			System.out.println();
		}

		ColoredPoint pointBleuTrouve = null;

		for (Point p : points) {

			if (p instanceof ColoredPoint) {

				ColoredPoint cp = (ColoredPoint) p;

				if (cp.couleur.equals(Color.BLUE)) {

					pointBleuTrouve = cp;

					break;
				}
			}
		}

		System.out.println("Résultat de la recherche : " + pointBleuTrouve);
	}

}