package pliki.write;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class Zad1 {
    public static void main(String[] args) {
        File plik = new File("output_1.txt");

        try {
            if(!plik.exists()) {
                plik.createNewFile();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            PrintWriter printWriter = new PrintWriter("output_1.txt");
            printWriter.println("Hello World!");
            printWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
