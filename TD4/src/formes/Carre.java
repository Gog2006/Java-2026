package formes;

class Carre extends Rectangle {

    public Carre(int cote) {
        super(cote, cote);
    }

    
    public int getCote() {
        return getLongueur();
    }

    @Override
    public String toString() {
        return "Carre " + getLongueur() + "x" + getLongueur();
    }
}
