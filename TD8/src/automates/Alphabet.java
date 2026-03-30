package automates;

import java.util.TreeSet;

public class Alphabet extends TreeSet<Character> 
{
    public Alphabet(Character[] tabCar)
    {
        super();
        for (Character c : tabCar) this.add(c);
    }
    
    public Alphabet()
    {
        super();
    }
    
    public void add (char c) { super.add(c);}

}
