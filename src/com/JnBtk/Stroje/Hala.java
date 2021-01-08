package com.JnBtk.Stroje;

public class Hala {
    private String nazev;
    private Stroj[] stroje;

    public Hala(String nazev) {
        this.nazev = nazev;
    }

    public void vypisNazvyStroju(){
        for (var stroj : stroje){
            if(stroj != null)
            System.out.println(stroj.getNazev());
        }
    }

    public void vypisNazvyNefunkcnichStroju(){
        for (var stroj : stroje){
            if(stroj != null && !(stroj.getFunguje()))
                System.out.println(stroj.getNazev());
        }
    }

    public void vypisKolikStrojeVyrobi(){
        int pocet = 0;

        for (var stroj : stroje) {
            if(stroj != null)
            pocet += stroj.getPocetVyrobku();
        }

        System.out.println(pocet);
    }
}
