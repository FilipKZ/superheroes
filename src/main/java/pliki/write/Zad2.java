package pliki.write;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Zad2 {
    public static void main(String[] args) {
        File plik = new File("output_2.txt");
        Scanner wejscie = new Scanner(System.in);

        try {
            if(!plik.exists()) {
                plik.createNewFile();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            PrintWriter printWriter = new PrintWriter("output_2.txt");
            printWriter.println(wejscie.nextLine());
            printWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
