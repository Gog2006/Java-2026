package automates;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        try {
            
        	Automate a = new Automate(System.getProperty("user.home") + "./automate2.txt");
            System.out.println("Automate chargé");
            System.out.println(a);

     
            a.ecrit("automate3_sortie.txt");
            System.out.println("Fichier reécrit OK\n");

       
            System.out.println("Test reconnait()");
            tester(a, "ab",    true);
            tester(a, "abba",  true);
            tester(a, "aba",   true);
            tester(a, "b",     false);   
            tester(a, "a",     false);  
            tester(a, "",      false);   
            tester(a, "abc",   false);  
            tester(a, "aab",   false);  

        } catch (IOException e) {
            System.err.println("Erreur fichier : " + e.getMessage());
        }
    }

    static void tester(Automate a, String mot, boolean attendu) {
        boolean resultat = a.reconnait(mot);
        String status = (resultat == attendu) ? "passe" : "pas";
        System.out.printf("%s  reconnait(\"%s\") = %b  (attendu: %b)%n",
                          status, mot, resultat, attendu);
    }
}