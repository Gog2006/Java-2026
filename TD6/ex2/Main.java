package ex2;

public class Main {
	public static void main(String[] args) {
		Velo v1 = new Velo(17);
		Voiture v2 = new Voiture(40.5, 5);
		Camion v3 = new Camion(100.0, 100.0);
		v2.approvisionner(35.0);   
		v1.transporter("Dijon", "Valence"); 
		v3.enPanne();
		v3.toString();
	}
}
