package com.JnBtk.Hlasovani;

public class HlasovaciListek {
    private int id;
    private int[] odpovedi = new int[8];

    public HlasovaciListek(int id) {
        this.id = id;
    }

    public void odpovez(int otazka, int odpoved){
        if(odpoved < 1 || odpoved > 5){
            System.out.println("Je pouze 5 možností odpovědí, zkuste odpovědět znovu.");
            return;
        }
        if(!validOtazka(otazka)){
            System.out.println("Je pouze " + odpovedi.length + " otázek, zkuste odpovědět znovu.");
            return;
        }

        odpovedi[otazka - 1] = odpoved;
    }


    public int getOdpoved(int cisloOtazky){
        if(!validOtazka(cisloOtazky)){
            System.out.println("Je pouze " + odpovedi.length + " otázek, zkuste to znovu.");
        }

        return odpovedi[cisloOtazky - 1];
    }

    private boolean validOtazka(int cisloOtazky){
        return cisloOtazky >= 1 && cisloOtazky <= odpovedi.length;
    }

    public int getId() {
        return id;
    }
}
