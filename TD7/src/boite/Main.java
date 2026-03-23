package boite;

import java.awt.Color;

public class Main {
    public static void main(String[] args) {

        
        System.out.println("Balle");
        Balle<?> b1 = new Balle<>();
        Balle<?> b2 = new Balle<>(Color.RED);
        Balle<?> b3 = new Balle<>(Color.BLUE);
        System.out.println(b1); 
        System.out.println(b2); 
        System.out.println(b3); 

   
        System.out.println("\nMail");
        Mail<String> m1 = new Mail<>();
        Mail<String> m2 = new Mail<>("alice@mail.com", "bob@mail.com", "Salut Bob !");
        Mail<Integer> m3 = new Mail<>(1, 2, 42);
        System.out.println(m1); 
        System.out.println(m2); 
        System.out.println(m3); 

     
        System.out.println("\nObjet");
        Objet<Color> o1 = new Objet<>();
        System.out.println(o1); 

        Objet<Color> o2 = new Objet<>(Color.GREEN, Color.GREEN);
        System.out.println(o2); 
        o2.changeCouleur(Color.YELLOW); 
        System.out.println(o2);

        o2.changeCouleur(Color.YELLOW); 


        System.out.println("\n egale ou pas Objet");
        Objet<Color> o3 = new Objet<>(Color.YELLOW, Color.YELLOW);
        System.out.println("o2==o3 : " + o2.equals(o3)); 
        System.out.println("o1==o2 : " + o1.equals(o2)); 
    }
}

