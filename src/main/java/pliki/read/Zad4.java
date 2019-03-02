package pliki.read;

import java.io.File;
import java.util.Scanner;

public class Zad4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj adres pliku: ");
        String adres = input.nextLine();

        File plik = new File(adres);
        if (plik.exists()) {
            System.out.println(plik.length());
            System.out.println(plik.lastModified());
            System.out.println(plik.canRead());
            System.out.println(plik.canWrite());
        } else {
            System.out.println("Plik nie istnieje");
        }
    }
}