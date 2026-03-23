package parking;

public class Voiture extends Vehicule {
	private double cylindree;
	private int nbPortes;
	private double puissance;
	private double kilometrage;

	public double getCylindree() {
		return cylindree;
	}

	public void setCylindree(double cylindree) {
		this.cylindree = cylindree;
	}

	public int getNbPortes() {
		return nbPortes;
	}

	public void setNbPortes(int nbPortes) {
		this.nbPortes = nbPortes;
	}

	public double getPuissance() {
		return puissance;
	}

	public void setPuissance(double puissance) {
		this.puissance = puissance;
	}

	public double getKilometrage() {
		return kilometrage;
	}

	public void setKilometrage(double kilometrage) {
		this.kilometrage = kilometrage;
	}


	public Voiture(String marque, int dateAchat, double prixAchat, double cylindree, int nbPortes, double puissance,
			double kilometrage) {
		super(marque, dateAchat, prixAchat);
		this.cylindree = cylindree;
		this.nbPortes = nbPortes;
		this.puissance = puissance;
		this.kilometrage = kilometrage;
	}

	@Override
	public void calculePrix(int anneeActuelle) {
		double decote = (anneeActuelle - 2024) * 0.02; // 2% par an
		decote += Math.round(this.kilometrage / 10000.0) * 0.05; // 5% par 10k km

		if (getMarque().equals("Renault") || getMarque().equals("Fiat"))
			decote += 0.10;
		if (getMarque().equals("Ferrari") || getMarque().equals("Porsche"))
			decote -= 0.20;

		setPrixCourant(getPrixAchat() * (1 - decote));
	}

	@Override
	public String toString() {
		return super.toString() + ", Kilométrage: " + kilometrage + " km";
	}

}
