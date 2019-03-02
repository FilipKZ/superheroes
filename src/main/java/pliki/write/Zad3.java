package pliki.write;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Zad3 {
    public static void main(String[] args) {
        Scanner wejscie = new Scanner(System.in);
        File file = new File("output_3.txt");

        try {
            if (!file.exists()) {
                file.createNewFile();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        String text;

        try (PrintWriter printWriter = new PrintWriter(new FileWriter("output_3.txt", true))){
            do {
                text = wejscie.nextLine();
                printWriter.println(text);
            } while (!text.equals("quit"));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
