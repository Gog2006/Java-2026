package voiture;

public class TestVoiture {
    
    public static void main(String[] args) {
        
        
        // Création d'une première voiture
        Voiture v1 = new Voiture(
            150, 5000,        
            17, 205, 150,     
            16, 195, 100      
        );
        System.out.println("\n"+v1);
        
        //  Création d'une deuxième voiture
        Voiture v2 = new Voiture(
            200, 8000,        
            18, 225, 200,     
            17, 215, 150      
        );
        System.out.println("\n"+v2);
        //  Création d'une troisième voiture moins puissante
        Voiture v3 = new Voiture(
            100, 3500,        
            15, 185, 120,     
            15, 185, 90       
        );
        System.out.println("\n"+v3);
        
        // Vérification des numéros d'identification
        System.out.println("\nNuméros d'identification");
        System.out.println("ID de v1 : " + v1.getNumId());
        System.out.println("ID de v2 : " + v2.getNumId());
        System.out.println("ID de v3 : " + v3.getNumId());
        
        // Calcul du prix
        System.out.println("\nPrix des voitures");
        System.out.println("Prix de v1 : " + v1.prix() + " €");
        System.out.println("Prix de v2 : " + v2.prix() + " €");
        System.out.println("Prix de v3 : " + v3.prix() + " €");
        
        //  Comparaison de puissance
        System.out.println("\nComparaison de puissance");
        System.out.println("v1 est plus puissante que v2 ? " + v1.estPlusPuissante(v2));
        System.out.println("v2 est plus puissante que v1 ? " + v2.estPlusPuissante(v1));
        System.out.println("v1 est plus puissante que v3 ? " + v1.estPlusPuissante(v3));
        System.out.println("v3 est plus puissante que v1 ? " + v3.estPlusPuissante(v1));
        
        //Test avec des valeurs identiques
        System.out.println("\n Voitures de même puissance");
        Voiture v4 = new Voiture(
            150, 5000,
            17, 205, 150,
            16, 195, 100
        );
        System.out.println("v1 est plus puissante que v4 (même puissance) ? " + v1.estPlusPuissante(v4));
        
     
        System.out.println("\nAffichage toString complet");
        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);
        System.out.println(v4);
    }
}


