package com.JnBtk.TelefonniSeznam;

import java.util.Set;
import java.util.TreeSet;

public class Seznam {
    private String nazev;
    private Set<Kontakt> mojeKontakty;

    public Seznam(String nazev) {
        this.nazev = nazev;
        this.mojeKontakty = new TreeSet<Kontakt>();
    }
    public void pridejKontakt(Kontakt novy)
    {
        this.mojeKontakty.add(novy);
    }
    public void odeberKontakt(Kontakt jaky)
    {
        this.mojeKontakty.remove(jaky);
    }
    public String vratVsechnyKontakty()
    {
        String vysledek = "Moje Kontakty: \n";
        for(Kontakt k: this.mojeKontakty)
        {
            vysledek += k +"\n";
        }
        return vysledek;

    }

    public void vypisKontakty(){
        System.out.println(mojeKontakty);
    }

    public void vypisKontakty(String prvniPismeno)
    {
        for(Kontakt k: this.mojeKontakty)
        {
            if(k.getJmeno().startsWith(prvniPismeno))
            {
                System.out.println(k);
            }
        }
    }

}

