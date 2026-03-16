package formes;

public class Carre extends Rectangle {

	public Carre(int x) {
		super(x, x);
	}

	public double getCote() {
		return getLongueur();
	}

	@Override
	public String toString() {
		return "carre de cote : " + getLongueur();
	}

	public static void main(String[] args) {
		Carre carre1 = new Carre(5);
		Rectangle rectangle1 = new Rectangle(5, 3);

		System.out.println(carre1);
		System.out.println(rectangle1);
	}
}
