package mapa.university;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Map<Long, Student> mapa = new HashMap<>();
        if (mapa.containsKey(100400L)) {
            System.out.println("Znaleziono");
        } else {
            System.out.println("Nie ma");
        }
        mapa.put(100400L, new Student(100400, "Jan", "Kowalski"));
        mapa.put(148642L, new Student(100200, "Adam", "Nowak"));
        mapa.put(874164L, new Student(100200, "Adam", "Nowak"));
        mapa.put(2487L, new Student(100200, "Adam", "Nowak"));
        System.out.println("Liczba studentow:" + mapa.size());

        System.out.println("Studenci:");
        for (Student student : mapa.values()) {
            System.out.println(student);
        }

        TreeMap<Long, Student> treeMap = new TreeMap<>();
        treeMap.putAll(mapa);

        System.out.println(mapa);
        System.out.println(treeMap);

    }
}
