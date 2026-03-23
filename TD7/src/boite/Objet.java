package boite;
import java.awt.*;

public class Objet <T> {
	 Color couleur;
	
	public <T> Objet() {
		couleur = Color.white;
	}
	
	public <T> Objet(T c, T n) {
		couleur = (Color) c;
	}
	
	public <T> void changeCouleur(T c) {
		if (!couleur.equals(c))
			couleur = (Color) c;
		else
			System.out.println("objet a meme de couleur "+c);
	}
	
	public boolean  equals(Object o) {
		Objet currentO = (Objet) o;
		return (currentO.couleur.equals(couleur));
	}
	
	public String toString() {
		return "Objet "+couleur;
	}

}
