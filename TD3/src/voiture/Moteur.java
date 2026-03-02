package voiture;

public class Moteur {
private static int nbMoteurs =0;
private int num;
private int puissance;
private float prix;


public Moteur(int puissance, float prixM) {
	
	this.num=nbMoteurs++;
	this.puissance=puissance;
	this.prix=prixM;
}
public int getPuissance() {
	return puissance;
}

public float getPrix() {
	return this.prix;
}



public String toString() {
	   return "numero " + this.num +
		  " puissance  " + this.puissance +
		  ", prix " + this.prix;
	}


public static void main(String[] args) {
	
	
	Moteur m1= new Moteur((int)15,500);
	Moteur m2= new Moteur((int)16,550);
	Moteur m3= new Moteur((int)17,600);
	System.out.println( m1.toString());
	System.out.println( m2.toString());
	System.out.println( m3.toString());
	
	
	
}

}
