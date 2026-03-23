package boite;

public class Mail <T>
{
	private T de, a, corps;
	private static int n = 0;
	private int id;

	public Mail()
    {
    	this.de = (T) "INDETERMINE";
    	this.a = (T) "INDETERMINE";
    	this.corps = (T) "INDETERMINE";
    	this.id = n++;
	}

    public Mail(T de, T a, T corps)
    {
    	this.de = de;
    	this.a = a;
    	this.corps = corps;
    	this.id = n++;
    }

    public String toString()
    {
    	return getClass().getName() + id + " De : " + de + " A : " + a + " Corps : " + corps;
    }
}