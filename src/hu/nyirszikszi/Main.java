package hu.nyirszikszi;

import hu.nyirszikszi.szamjegyekosszege.SzamjegyekOsszege;

public class Main {
    public static void main(String[] args) {
        SzamjegyekOsszege o = new SzamjegyekOsszege(123456789);
        System.out.println(o.getOsszeg());
    }
}