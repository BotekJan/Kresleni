package com.JnBtk.Batoh;

public class Item {
    private String nazev;
    private int vaha;
    private int cena;

    public Item(String nazev, int vaha, int cena){
        this.nazev = nazev;
        this.vaha = vaha;
        this.cena = cena;
    }

    public String getNazev() {
        return nazev;
    }

    public void setNazev(String nazev) {
        this.nazev = nazev;
    }

    public int getVaha() {
        return vaha;
    }

    public void setVaha(int vaha) {
        this.vaha = vaha;
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }
}
