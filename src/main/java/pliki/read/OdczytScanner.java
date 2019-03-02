package pliki.read;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class OdczytScanner {
    public static void main(String[] args) {
        // odczyt 1:
        // BufferedReader -- linia po linii
        // Scanner -- nextInt() nextDouble() hasNextInt()

        try (Scanner scanner = new Scanner(new FileReader("plik2.txt"))) {

            // dopóki jest jakaś linia w pliku
            while (scanner.hasNextLine()) {

                // wypisz ją
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
