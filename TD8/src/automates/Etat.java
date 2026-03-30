package automates;
import java.util.*;

public class Etat {
public int numero;
public boolean initial;
public boolean terminal;
private ArrayList<Transition> transitions;
/**
 * @param numero 
 * @param initial
 * @param terminal
 * @param transitions
 */



// Constr
public Etat() {
    this.numero = 0;
    this.initial = false;
    this.terminal = false;
    this.transitions = new ArrayList<>();
}

public Etat(int numero, boolean initial, boolean terminal) {
    this.numero = numero;
    this.initial = initial;
    this.terminal = terminal;
    this.transitions = new ArrayList<>();
}
//methodes
public void setInitial(boolean initial){
	this.initial = initial; 
	}
public void setTerminal(boolean terminal) 
{
	this.terminal = terminal; 
	}
// Getters
public int getNumero(){
	return numero;
	}
public boolean isInitial()
{ 
	return initial; 
	}
public boolean isTerminal(){
	return terminal;
	}
public ArrayList<Transition> getTransitions(){
	return transitions; 
	}

// addtrans
public void addTransition(char etiquette, int source, int cible) {
    if (source == this.numero) {
        transitions.add(new Transition(etiquette,source, cible));
    }
}

// extrans
public boolean existeTrans(char c) {
    for (Transition t : transitions) {
        if (t.getEtiquette() == c) return true;
    }
    return false;
}

// num de cible act
public int cible(char c) {
    for (Transition t : transitions) {
        if (t.getEtiquette() == c) return t.getCible();
    }
    return -1; 
}

@Override
public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("Etat ").append(numero);
    if (initial)  sb.append(" [initial]");
    if (terminal) sb.append(" [terminal]");
    sb.append("\n  Transitions: ").append(transitions);
    return sb.toString();
}


}
