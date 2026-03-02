package voiture;

import java.util.ArrayList;

public class Garage {
    private String nom;
    private String adresse;
    private int nbMaxVoitures;
    private ArrayList<Voiture> voitures;

    public Garage(String nom, String adresse, int nbMaxVoitures) {
        this.nom = nom;
        this.adresse = adresse;
        this.nbMaxVoitures = nbMaxVoitures;
        this.voitures = new ArrayList<>();
    }

    /**
     * Ajoute une voiture au garage si la capacité le permet
     * Si le garage est plein, affiche un message d'erreur
     */
    public void ajouterVoiture(Voiture v) {
        if (voitures.size() >= nbMaxVoitures) {
            System.out.println("ERREUR : Le garage est plein. Impossible d'ajouter la voiture.");
        } else {
            voitures.add(v);
        }
    }

    /**
     * Retourne la somme des prix des voitures garées dans le garage
     */
    public float valeurStock() {
        float total = 0;
        for (Voiture v : voitures) {
            total += v.prix();
        }
        return total;
    }

    /**
     * Retourne la voiture ayant le moteur le plus puissant
     */
    public Voiture laPlusPuissanteVoiture() {
        if (voitures.isEmpty()) {
            return null;
        }
        
        Voiture plusPuissante = voitures.get(0);
        for (Voiture v : voitures) {
            if (v.getMoteur().getPuissance() > plusPuissante.getMoteur().getPuissance()) {
                plusPuissante = v;
            }
        }
        return plusPuissante;
    }

    /**
     * Retourne une chaîne de caractères contenant les caractéristiques du garage
     * Format selon l'exemple fourni
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Garage").append(nom).append("(").append(adresse).append(") Capacité : ").append(nbMaxVoitures).append("\n");
    
        for (int i = 0; i < voitures.size(); i++) {
            Voiture v = voitures.get(i);
            sb.append("\n").append(v.toString()).append("\n");
        }
        
        Voiture plusPuissante = laPlusPuissanteVoiture();
        if (plusPuissante != null) {
            sb.append("\nLa voiture la plus puissante est la voiture ").append(plusPuissante.getNumId()).append("\n");
        }
        
        sb.append("La valeur totale du stock de voitures est de ").append(String.format("%.1f", valeurStock())).append("€");
        
        return sb.toString();
    }
}