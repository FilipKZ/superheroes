package pliki.read;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Odczyt {
    public static void main(String[] args) {
        // odczyt 1:
        // BufferedReader -- linia po linii
        // Scanner -- nextInt() nextDouble() hasNextInt()

//        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("plik2.txt"))) {
//            String linia = bufferedReader.readLine(); // brak linii zwróci null (nie exception)
//
//            System.out.println(linia);
//
//        } catch (IOException e) { // błędy IO - Input Output - file not found
//            e.printStackTrace();
//        }

        // poniższy blok kodu wypisze cały plik linia polinii
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("plik2.txt"))) {
            String linia;

            while ((linia = bufferedReader.readLine()) != null) {
                System.out.println(linia);
            }

        } catch (IOException e) { // błędy IO - Input Output - file not found
            e.printStackTrace();
        }

    }
}
