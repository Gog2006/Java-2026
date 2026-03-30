package automates;
import java.util.HashMap;
import java.util.Collection;
import java.io.*;

public class Automate {
    private int nbEtats;
    private HashMap<Integer, Etat> etats;
    private Alphabet alphabet;

    public Automate() {
        this.nbEtats = 0;
        this.etats = new HashMap<>();
        this.alphabet = new Alphabet();
    }

    public Automate(String nomFichier) throws IOException {
        this.etats = new HashMap<>();
        this.alphabet = new Alphabet();

        try (BufferedReader br = new BufferedReader(new FileReader(nomFichier))) {

            String ligne = br.readLine();
            if (ligne == null) throw new IOException("Fichier vide : " + nomFichier);

            this.nbEtats = Integer.parseInt(ligne.trim());

            for (int i = 0; i < nbEtats; i++) {
                etats.put(i, new Etat(i, false, false));
            }

            while ((ligne = br.readLine()) != null) {
                ligne = ligne.trim();
                if (ligne.isEmpty()) continue;

                String[] tokens = ligne.split("\\s+");

                if (tokens[0].equals("initial")) {
                    int num = Integer.parseInt(tokens[1]);
                    getEtatOrThrow(num).setInitial(true);

                } else if (tokens[0].equals("terminal")) {
                    int num = Integer.parseInt(tokens[1]);
                    getEtatOrThrow(num).setTerminal(true);

                } else {
                    int source     = Integer.parseInt(tokens[0]);
                    char etiquette = tokens[1].charAt(0);
                    int cible      = Integer.parseInt(tokens[2]);

                    getEtatOrThrow(source).addTransition(etiquette, source, cible);
                    alphabet.add(etiquette);
                }
            }

        } catch (NumberFormatException e) {
            throw new IOException("Format numérique incorrect dans le fichier : " + e.getMessage());
        }
    }

    private Etat getEtatOrThrow(int num) throws IOException {
        Etat e = etats.get(num);
        if (e == null)
            throw new IOException("Numéro d'état inexistant : " + num);
        return e;
    }

    public void ecrit(String fichier) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fichier))) {

            bw.write(String.valueOf(nbEtats));
            bw.newLine();

            for (Etat e : etats.values()) {
                if (e.isInitial()) {
                    bw.write("initial " + e.getNumero());
                    bw.newLine();
                }
            }

            for (Etat e : etats.values()) {
                if (e.isTerminal()) {
                    bw.write("terminal " + e.getNumero());
                    bw.newLine();
                }
            }

            for (Etat e : etats.values()) {
                for (Transition t : e.getTransitions()) {
                    bw.write(t.getSource() + " " + t.getEtiquette() + " " + t.getCible());
                    bw.newLine();
                }
            }
        }
    }

    public boolean reconnait(String mot) {
        Etat courant = null;
        for (Etat e : etats.values()) {
            if (e.isInitial()) { courant = e; break; }
        }
        if (courant == null) return false;

        for (char c : mot.toCharArray()) {
            if (!alphabet.contains(c)) return false;
            if (!courant.existeTrans(c)) return false;
            courant = etats.get(courant.cible(c));
        }

        return courant.isTerminal();
    }

    public int getNbEtats() {
        return nbEtats;
    }

    public Collection<Etat> getEtats() {
        return etats.values();
    }

    public Etat getEtat(int numero) {
        return etats.get(numero);
    }

    public void addEtat(Etat e) {
        etats.put(e.getNumero(), e);
        nbEtats = etats.size();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Automate (").append(nbEtats).append(" états):\n");
        for (Etat e : etats.values()) sb.append(e).append("\n");
        return sb.toString();
    }
}