package com.JnBtk;

import com.JnBtk.Hlasovani.Anketa;
import com.JnBtk.LinearniPiskvorky.LinearniPiskvorky;
import com.JnBtk.TelefonniSeznam.Kontakt;
import com.JnBtk.TelefonniSeznam.Seznam;

public class Main {

    public static void main(String[] args) {
		Seznam seznam = new Seznam("seznam");
		seznam.pridejKontakt(new Kontakt("DEF", 456));
		seznam.pridejKontakt(new Kontakt("ABC", 123));
		seznam.vypisKontakty();
    }
}
