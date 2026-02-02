package ensembleentierborne;

public class EnsembleEntierBorne {
    private final int MAXIMUM;
    private boolean[] Tentier;
/*
 * 
 * 
 * @EnsembleEntierBorne Constructeur 
 * 
 */
    
    public EnsembleEntierBorne(int max) {
        this.MAXIMUM = max;
        this.Tentier = new boolean[max + 1];
    }
/*
 * 
 * @ add Ajoute un entier à l'ensemble si nb est un int
 */
    
    public void add(int nb) {
        if (nb <= this.MAXIMUM && nb >= 0) {
            this.Tentier[nb] = true;
        }
    }
/*
 * @remove Enlève un entier de l'ensemble si nb est  déjà dans l’ensemble ou ne peut être contenu dans l’ensemble
 * 
 */
    
    public void remove(int nb) {
        if (nb <= this.MAXIMUM && nb >= 0) {
            this.Tentier[nb] = false;
        }
    }
/*
 * 
 * 
 */
    // Vérifie si l'ensemble contient un entier
    public boolean doesContain(int nb) {
        if (nb <= this.MAXIMUM && nb >= 0) {
            return this.Tentier[nb];
        }
        return false;
    }

    // Retourne une représentation en chaîne de caractères
    public String toString() {
        String resultat = "{";
        for (int i = 0; i <= this.MAXIMUM; i++) {
            if (this.Tentier[i]) {
                resultat += i + ",";
            }
        }
        // Supprimer la dernière virgule si l'ensemble n'est pas vide
        if (resultat.length() > 1) {
            resultat = resultat.substring(0, resultat.length() - 1);
        }
        resultat += "}";
        return resultat;
    }

    // Retourne l'intersection avec un autre ensemble
    public EnsembleEntierBorne intersect(EnsembleEntierBorne autre) {
        int maxCommun = Math.min(this.MAXIMUM, autre.MAXIMUM);
        EnsembleEntierBorne intersection = new EnsembleEntierBorne(maxCommun);
        
        for (int i = 0; i <= maxCommun; i++) {
            if (this.Tentier[i] && autre.Tentier[i]) {
                intersection.add(i);
            }
        }
        return intersection;
    }
}