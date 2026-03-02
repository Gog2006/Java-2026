package voiture;

public class Roue {
private float diametre ;
private float largeur ;
private float prix ;


public Roue(){
	this.diametre=0;
	this.largeur=0;
	this.prix=0;
}
public Roue(float diametre,float largeur, float prix  ) {
	this.diametre= diametre;
	this.largeur=largeur;
	this.prix=prix;
}

public float getPrix(){
	return this.prix;
	
}
public float getDiametre(){
	return this.diametre;
}
public float getLargeur() {
	return this.largeur;
}




/**
* @toString la function de affichage 
 * 
 */
	
	public String toString() {
		   return "Diametre " + this.diametre +
			  " largeur  " + this.largeur +
			  ", prix " + this.prix;
		}

public static void main(String[] args) {
	
	
	Roue r1= new Roue((float)15,15,500);
	System.out.println( r1.toString());

	
	
	
}

}
