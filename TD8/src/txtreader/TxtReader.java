package txtreader;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class TxtReader {

    public static void main(String[] args) {

        Set<String> communesSet = new HashSet<>();
        Set<String> codesSet = new HashSet<>();

        try {
            BufferedReader reader = new BufferedReader(
                new FileReader("/home/do501389/Desktop/R201/TD8/src/txtreader/France_Codepostal_2009.txt"));

            BufferedWriter communesWriter = new BufferedWriter(
                new FileWriter("communes.txt"));

            BufferedWriter codesWriter = new BufferedWriter(
                new FileWriter("codes_postaux.txt"));

            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("\\t");
                if (parts.length >= 2) {
                    String commune = parts[0].trim();
                    String codePostal = parts[1].trim();

                    
                    if (communesSet.add(commune)) {
                        communesWriter.write(commune);
                        communesWriter.newLine();
                    }
                    if (codesSet.add(codePostal)) {
                        codesWriter.write(codePostal);
                        codesWriter.newLine();
                    }
                }
            }

            
            reader.close();
            communesWriter.close();
            codesWriter.close();

            System.out.println("Fichiers générés !");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}