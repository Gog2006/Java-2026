package vehicules;

public class Avion extends Vehicule {
	private String Moteur;
	private int heuresVol;

	public Avion(String marque, int dateAchat, double prixAchat, String Moteur, int heuresVol) {
		super(marque, dateAchat, prixAchat);
		this.Moteur = Moteur;
		this.heuresVol = heuresVol;
	}

	@Override
	public void calculePrix(int anneeActuelle) {
		double decote;
		if (Moteur.equals("hélice")) {
			decote = (heuresVol / 100) * 0.10;
		} else {
			decote = (heuresVol / 1000) * 0.10;
		}
		setPrixCourant(getPrixAchat() * (1 - decote));
	}

	public String getMoteur() {
		return Moteur;
	}

	public void setMoteur(String moteur) {
		Moteur = moteur;
	}

	public int getHeuresVol() {
		return heuresVol;
	}

	public void setHeuresVol(int heuresVol) {
		this.heuresVol = heuresVol;
	}

	@Override
	public String toString() {
		return super.toString() + ", Moteur: " + Moteur + ", Heures de vol: " + heuresVol + "h";
	}
}