package ensembleentierborne;

public class TestEnsemble {
    static public void main(String[] args){
       
       
        EnsembleEntierBorne nb = new EnsembleEntierBorne(10);
        nb.add(5);
        nb.add(8);
        nb.add(10);
        nb.add(3);
        System.out.println("Ensemble nb: " + nb); 
        
       
        
        nb.add(15);  
        nb.add(-2);  
        System.out.println("Ensemble nb après ajouts invalides: " + nb);  
       
      
        nb.remove(8);
        System.out.println("Ensemble nb après remove(8): " + nb);
        
        
        EnsembleEntierBorne nb2 = new EnsembleEntierBorne(15);
        nb2.add(3);
        nb2.add(5);
        nb2.add(7);
        nb2.add(8);
        nb2.add(12);
        System.out.println("Ensemble nb2: " + nb2);  
        
        EnsembleEntierBorne intersection = nb.intersect(nb2);
        System.out.println("Intersection de nb et nb2: " + intersection); 
       
        
    }
}