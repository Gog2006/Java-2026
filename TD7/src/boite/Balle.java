package boite;

import java.awt.Color;

public class Balle <T>
{
	private Color couleur;
	private static int n = 0;
	private int id;

    public Balle()
    {
		this.couleur = Color.BLACK;
    	this.id = n++;
    }

    public Balle(Color c)
    {
    	this.couleur = c;
    	this.id = n++;
    }

    public String toString()
    {
    	return getClass().getName() + id +  " " + couleur;
    }
}