package com.JnBtk.Stroje;

public class Stroj {
    private String nazev;
    private int pocetVyrobku;
    private boolean funguje;

    public Stroj(String nazev, int pocetVyrobku, boolean funguje) {
        this.nazev = nazev;
        this.pocetVyrobku = pocetVyrobku;
        this.funguje = funguje;
    }

    public String getNazev() {
        return nazev;
    }

    public void setNazev(String nazev) {
        this.nazev = nazev;
    }

    public int getPocetVyrobku() {
        return pocetVyrobku;
    }

    public void setPocetVyrobku(int pocetVyrobku) {
        this.pocetVyrobku = pocetVyrobku;
    }

    public boolean getFunguje() {
        return funguje;
    }

    public void setFunguje(boolean funguje) {
        this.funguje = funguje;
    }
}
