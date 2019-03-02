package mapa.university;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class University {

    private Map<Long, Student> map = new HashMap<>();

    public void addStudent(long indeks,String imie, String nazwisko)  {
        map.put(indeks, new Student(indeks, imie, nazwisko));
    }
    public void addStudent(String imie, String nazwisko){
        List<Long> longList = new ArrayList<>(map.keySet());

    }

}

