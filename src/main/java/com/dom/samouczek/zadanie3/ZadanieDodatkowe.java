package com.dom.samouczek.zadanie3;

public class ZadanieDodatkowe {
    public static void main(String[] args) {
        String pogoda1 = "Jest pochmurno!";
        String pogoda2 = "Słońce próbuje się przebić.";
        String pogoda3 = "Jest chłodno";
        System.out.println(pogoda1 + " " + pogoda2 + " " + pogoda3);
        int liczbaZnakow = pogoda1.length() + pogoda2.length() + pogoda3.length();
        System.out.println("Liczba znaków: " + liczbaZnakow);
        
    }
}
