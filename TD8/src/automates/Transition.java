package automates;

public class Transition {
public int source;
public int cible;
public char etiquette;
/**
 * 
 * @param source
 * @param cible
 * @param etiquette
 */
//les costruct
public Transition(char etiquette,int source,int cible ){
	this.etiquette=etiquette;
	this.source = source;
	this.cible=cible;
	
	}

public Transition() {
    this.source = 0;
    this.etiquette = ' ';
    this.cible = 0;
    }

//getters
public int getSource(){
	return source;
	}
public char getEtiquette(){
	return etiquette; 
	}
public int getCible(){
	return cible;
	}
//to string 
@Override 
public String toString() {
    return source + " " + etiquette + " " + cible;
}

}