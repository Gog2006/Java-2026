package parking;


import java.util.HashMap;

public class Parking {
    private int capacite;
    private HashMap<Integer, Voiture> places;

    public Parking(int capacite) {
        this.capacite = capacite;
        this.places = new HashMap<>();
    }

    private void verifierNumero(int numero) {
        if (numero < 1 || numero > capacite)
            throw new IndexOutOfBoundsException("Place " + numero + " inexistante (1-" + capacite + ")");
    }

    public void garer(Voiture voiture, int numero) {
        verifierNumero(numero);
        if (places.containsKey(numero))
            throw new IllegalStateException("La place " + numero + " est déjà occupée");
        places.put(numero, voiture);
    }

    public Voiture liberer(int numero) {
        verifierNumero(numero);
        if (!places.containsKey(numero))
            throw new IllegalStateException("La place " + numero + " est vide");
        return places.remove(numero);
    }

    public int chercher(Voiture voiture) {
        for (HashMap.Entry<Integer, Voiture> entry : places.entrySet()) {
            if (entry.getValue().equals(voiture))
                return entry.getKey();
        }
        throw new IllegalStateException("Cette voiture n'est pas dans le parking");
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Parking (" + capacite + " places)\n");
        for (int i = 1; i <= capacite; i++) {
            sb.append("Place ").append(i).append(": ");
            if (places.containsKey(i))
                sb.append(places.get(i).toString());
            else
                sb.append("[libre]");
            sb.append("\n");
        }
        return sb.toString();
    }
}
