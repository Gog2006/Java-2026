package voiture;

public class Voiture {
	
    // Compteur statique pour générer les identifiants
    private static int compteur = 0;
    
    // Attributs d'instance
    private String numId;
    private Moteur moteur;
    private Roue[] rouesNormales;
    private Roue roueDeSecours;
    
    // Constructeur avec 8 paramètres
    public Voiture(int puissance, float prixM, 
                   float diamN, float largN, float prixN,
                   float diamS, float largS, float prixS) {
        // Génération automatique de l'identifiant
        compteur++;
        this.numId = "V" + compteur;
        
        // Instanciation du moteur
        this.moteur = new Moteur(puissance, prixM);
        
        // Instanciation des 4 roues normales
        this.rouesNormales = new Roue[4];
        for (int i = 0; i < 4; i++) {
            this.rouesNormales[i] = new Roue(diamN, largN, prixN);
        }
        
        // Instanciation de la roue de secours
        this.roueDeSecours = new Roue(diamS, largS, prixS);
    }
    
    // Méthode pour calculer le prix total
    public float prix() {
        float prixTotal = 0;
        
        // Prix des 4 roues normales
        for (int i = 0; i < 4; i++) {
            prixTotal += rouesNormales[i].getPrix();
        }
        
        // Prix de la roue de secours
        prixTotal += roueDeSecours.getPrix();
        
        // Prix du moteur
        prixTotal += moteur.getPrix();
        
        return prixTotal;
    }
    
    public boolean estPlusPuissante(Voiture v) {
        if (this.moteur.getPuissance() > v.moteur.getPuissance()) {
            System.out.println("Ce moteur est plus puissant");
            return true;
        } else {
            System.out.println("Ce moteur n'est pas plus puissant");
            return false;
        }
    }
    // Méthode toString
    public String toString() {
        return "Voiture " + numId + " Prix : " + prix() + "€\n" +
               "Moteur de puissance " + moteur.getPuissance() + " cv\n" +
               "Roues normales : " + rouesNormales[0].getDiametre() + " x " + 
                                      rouesNormales[0].getLargeur() + "\n" +
               "Roue de secours : " + roueDeSecours.getDiametre() + " x " + 
                                       roueDeSecours.getLargeur();
    }
    
    // Getters si nécessaires
    public String getNumId() {
        return numId;
    }
    
    public Moteur getMoteur() {
        return moteur;
    }
    
    
}