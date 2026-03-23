package personnes;
import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
    	List<Personne> w = new ArrayList<>(); 
     
       w.add(new Etudiant("Max", 43,15));
       w.add(new Enseignant("Tom", "Maths",45));
       w.add(new Etudiant("Bart", 17,13));
       w.add(new Etudiant("Lolo",18,12));
       w.add(new Etudiant ("Roro",16,14));

       
	System.out.println("Avant trie");
        for(int i=0; i<w.size(); i++)
        {
            System.out.println(w.get(i).getInfo());
        }

	
        Collections.sort(w);
        System.out.println("Apres trie");
        for(int i=0; i<w.size(); i++)
        {
            System.out.println(w.get(i).getInfo());
        }
        
        Collections.sort(w, new CompAge());
System.out.println("age");
for(int i=0; i<w.size(); i++) {
	System.out.println(w.get(i).getInfo());
}
    }
}


