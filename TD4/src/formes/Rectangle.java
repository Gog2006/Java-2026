package formes;

class Rectangle {
    public int longueur;
    public int largeur;

    public Rectangle(int x, int y) {
        longueur = x;
        largeur = y;
    }

    public int getLongueur() { return longueur; }
    public int getLargeur()  { return largeur;  }

    public double surface() {
        return longueur * largeur;
    }

    public void afficheSurface() {
        System.out.println(toString() + " de surface " + surface());
    }

    @Override
    public String toString() {
        return "Rectangle " + longueur + "x" + largeur;
    }
}


