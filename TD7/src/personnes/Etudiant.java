package personnes;

public class Etudiant extends Personne
{
    int numEtu;
    public Etudiant(String nom,int numEtu, int age)
    {
    super(nom,age);
    this.numEtu=numEtu;
    }
@Override
    String getInfo()
    {
        return "Nom: " +nom+ " Numero d'etudiant: "+numEtu+ "age "+age;
    }
}

