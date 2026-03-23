package personnes;/**
* Classe décrivant un enseignant qui est un autre cas particulier de personne
* enseignant une matière.
*/
public class Enseignant extends Personne
{
    String matiere;
    public Enseignant(String nom, String mat,int age)
    {
        super(nom,age);
        this.matiere=mat;
    }
    @Override
    String getInfo()
    {
    	return "NomENS:  "+nom+" matiere ensegne "+matiere+ "age "+age;
    }
}

