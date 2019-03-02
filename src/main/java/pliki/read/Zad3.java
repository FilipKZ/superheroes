package pliki.read;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Zad3 {
    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("output_2.txt"))) {
            String text;

            while ((text = bufferedReader.readLine()) != null) {
                System.out.println(text);
                bufferedReader.close();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }



    }
}
