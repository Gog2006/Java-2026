package personnes;

/**
Exemple d'utilisation du polymorphisme
*/

/**
* Classe abstraite représentant une personne en général.
*/
public abstract class Personne implements Comparable<Personne> 
{
    public String nom;
    public int age;

    /**
	* Crée une personne
	*/
	public Personne(String nom,int age )
    {
		this.nom = nom;
		this.age=age;
    }
	public Personne(String nom) {
		this.nom=nom;
	}
	

	/**
	* Retourne le nom de la personne
	*/
    public String getNom()
    {
    	return nom ;
    }
    public int getAge() {
    	return age;
    }

	/**
	* Retourne une chaîne donnant des informations sur la personne
	*/
    abstract String getInfo();
    

	/**
	* Complare l'instance courante avec une autre instance de la classe
	* Personne. Compraison basée sur l'ordre lexicographique des noms.
	*/
    public int compareTo(Personne autre)
    {
    	return this.nom.compareTo(autre.nom);
    }
}

