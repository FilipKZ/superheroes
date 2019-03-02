package pliki.write;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Zapis {
    public static void main(String[] args) {
        // File nie służy do zapisu/odczytu z pliku
        File plik = new File("/tmp/plik1.txt"); // File reprezentuje deskryptor pliku (zbiór informacji o pliku)

        try {
            if (!plik.exists()) {
                plik.createNewFile();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // zapis
        try (PrintWriter printWriter = new PrintWriter(new FileWriter("plik2.txt", true))){
            printWriter.println("def");
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
