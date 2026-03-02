package voiture;

public class TestGarage {

    public static void main(String[] args) {
        
 
        
  
        Voiture voit1 = new Voiture(
            15, 10000,
            17, 165, 100,
            15, 165, 110
        );
      
        Voiture voit2 = new Voiture(
            9, 5000,
            17, 155, 200,
            15, 155, 220
        );
        
        // Affichage des caractéristiques de voit1 et voit2
        System.out.println("Caractéristiques de voit1:");
        System.out.println(voit1);
        System.out.println();
        
        System.out.println("Caractéristiques de voit2 :");
        System.out.println(voit2);
        System.out.println();
        
        // Affichage du prix de voit1
        System.out.println("Prix de voit1 : " + voit1.prix() + "€");
        System.out.println();
        
        // Affichage de la voiture la plus puissante
        System.out.println("Comparaison de puissance :");
        if (voit1.getMoteur().getPuissance() > voit2.getMoteur().getPuissance()) {
            System.out.println("La voiture la plus puissante est voit1 (" + voit1.getNumId() + ") avec " + 
                             voit1.getMoteur().getPuissance() + " chevaux");
        } else {
            System.out.println("La voiture la plus puissante est voit2 (" + voit2.getNumId() + ") avec " + 
                             voit2.getMoteur().getPuissance() + " chevaux");
        }
        
        
        
        // Création d'un garage 
        Garage paradiso = new Garage("PARADISO", "Nice", 0);
        
        // Placement des voitures voit1 et voit2 dans le garage Paradiso
        
        paradiso.ajouterVoiture(voit1);
        paradiso.ajouterVoiture(voit2);
        System.out.println();
        
       
        System.out.println(paradiso);
    }
}