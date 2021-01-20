package com.JnBtk.GenerovaniRuznychCisel;

import java.util.HashSet;
import java.util.Set;

public class LosovaciGenerator {
    private Set<Integer> cisla = new HashSet<>();

    public Set<Integer> generujCisla() {

        for (int i = 0; i < 8; i++) {
            int cislo = 0;
            while (cislo == 0 || cisla.contains(cislo))
                cislo = vygenerujCislo();

            cisla.add(cislo);
        }

        return cisla;
    }

    public void vypisCisla() {
        System.out.println(cisla);
    }

    private int vygenerujCislo() {
        return (int) Math.round(Math.random() * 10);
    }
}
