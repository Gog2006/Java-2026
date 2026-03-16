package vehicules;

public class Vehicule {
	private String marque;
	private int dateAchat;
	private double prixAchat;
	private double prixCourant;

	public Vehicule(String marque, int dateAchat, double prixAchat) {
		this.marque = marque;
		this.dateAchat = dateAchat;
		this.prixAchat = prixAchat;
		this.prixCourant = prixAchat;
	}

	public String getMarque() {
		return marque;
	}

	public double getPrixAchat() {
		return prixAchat;
	}

	public double getPrixCourant() {
		return prixCourant;
	}

	public void setPrixCourant(double prix) {
		if (prix < 0)
			prix = 0;
		if (prix > prixAchat)
			prix = prixAchat;
		this.prixCourant = prix;
	}

	public void calculePrix(int anneeActuelle) {
		double decote = (anneeActuelle - dateAchat) * 0.01;
		setPrixCourant(prixAchat * (1 - decote));
	}

	public void affiche() {
		System.out.println(this.toString());
	}

	@Override
	public String toString() {
		return "Marque: " + marque + ", Achat: " + dateAchat + ", Prix d'achat: " + prixAchat + ", Prix actuel: "
				+ prixCourant;
	}

}