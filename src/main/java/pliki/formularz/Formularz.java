package pliki.formularz;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Formularz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Wiek");
        String wiek = input.nextLine();
        System.out.println("Plec");
        String plec = input.nextLine();
        System.out.println("zarobki");
        String zarobki = input.nextLine();
        System.out.println("Wzrost");
        String wzrost = input.nextLine();

        File formularz = new File ("formularz.txt");
        try {
            if (!formularz.exists()) {
                formularz.createNewFile();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            PrintWriter printWriter = new PrintWriter(formularz);
            printWriter.println(wiek);
            printWriter.println(plec);
            printWriter.println(zarobki);
            printWriter.println(wzrost);
            printWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
