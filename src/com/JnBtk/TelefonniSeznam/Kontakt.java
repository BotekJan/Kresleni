package com.JnBtk.TelefonniSeznam;

public class Kontakt implements Comparable{
    private String jmeno;
    private int cislo;

    public Kontakt(String jmeno, int cislo) {
        this.jmeno = jmeno;
        this.cislo = cislo;
    }

    public String getJmeno() {
        return jmeno;
    }

    public int getCislo() {
        return cislo;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public void setCislo(int cislo) {
        this.cislo = cislo;
    }

    @Override
    public int compareTo(Object o) {
        Kontakt druhy = (Kontakt)o;
        return this.jmeno.compareTo(druhy.getJmeno());
    }

    @Override
    public String toString() {
        return  jmeno +";" + cislo;
    }



}
