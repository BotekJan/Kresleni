package kresleni;

import rozhrani.IPohybujici;

import java.awt.*;

public class Cinka extends Objekt2D implements IPohybujici {
    Kruznice kruznice;
    Ctverec ctverec;
    Ctverec ctverec1;
    Ctverec ctverec2;
    Ctverec ctverec3;
    Ctverec ctverec4;
    Kruznice kruznice2;

    public Cinka(int hrX, int hrY) {
        super(hrX, hrY);
        this.kruznice = new Kruznice(levyHRx, levyHRy, 100, Color.BLACK, true);
        this.kruznice2 = new Kruznice(levyHRx + 210, levyHRy, 100, Color.BLACK, true);
        this.ctverec = new Ctverec(levyHRx + 70, levyHRy + 30, Color.BLACK, 30);
        this.ctverec1 = new Ctverec(levyHRx + 100, levyHRy + 30, Color.BLACK, 30);
        this.ctverec2 = new Ctverec(levyHRx + 130, levyHRy + 30, Color.BLACK, 30);
        this.ctverec3 = new Ctverec(levyHRx + 160, levyHRy + 30, Color.BLACK, 30);
        this.ctverec4 = new Ctverec(levyHRx + 190, levyHRy + 30, Color.BLACK, 30);
    }

    @Override
    public void kresli(Graphics2D g) {
        kruznice.kresli(g);
        ctverec.kresli(g);
        ctverec1.kresli(g);
        ctverec2.kresli(g);
        ctverec3.kresli(g);
        ctverec4.kresli(g);
        kruznice2.kresli(g);
    }

    @Override
    public void krokNahoru(int kolik) {
        kruznice.levyHRy = kruznice.levyHRy - kolik;
        kruznice2.levyHRy = kruznice2.levyHRy - kolik;
        ctverec.levyHRy = ctverec.levyHRy - kolik;
        ctverec1.levyHRy = ctverec1.levyHRy - kolik;
        ctverec2.levyHRy = ctverec2.levyHRy - kolik;
        ctverec3.levyHRy = ctverec3.levyHRy - kolik;
        ctverec4.levyHRy = ctverec4.levyHRy - kolik;
    }

    @Override
    public void krokDolu(int kolik) {
        kruznice.levyHRy = kruznice.levyHRy + kolik;
        kruznice2.levyHRy = kruznice2.levyHRy + kolik;
        ctverec.levyHRy = ctverec.levyHRy + kolik;
        ctverec1.levyHRy = ctverec1.levyHRy + kolik;
        ctverec2.levyHRy = ctverec2.levyHRy + kolik;
        ctverec3.levyHRy = ctverec3.levyHRy + kolik;
        ctverec4.levyHRy = ctverec4.levyHRy + kolik;
    }

    @Override
    public void krokVlevo(int kolik) {
        kruznice.levyHRx = kruznice.levyHRx - kolik;
        kruznice2.levyHRx = kruznice2.levyHRx - kolik;
        ctverec.levyHRx = ctverec.levyHRx - kolik;
        ctverec1.levyHRx = ctverec1.levyHRx - kolik;
        ctverec2.levyHRx = ctverec2.levyHRx - kolik;
        ctverec3.levyHRx = ctverec3.levyHRx - kolik;
        ctverec4.levyHRx = ctverec4.levyHRx - kolik;
    }

    @Override
    public void krokVpravo(int kolik) {
        kruznice.levyHRx = kruznice.levyHRx + kolik;
        kruznice2.levyHRx = kruznice2.levyHRx + kolik;
        ctverec.levyHRx = ctverec.levyHRx + kolik;
        ctverec1.levyHRx = ctverec1.levyHRx + kolik;
        ctverec2.levyHRx = ctverec2.levyHRx + kolik;
        ctverec3.levyHRx = ctverec3.levyHRx + kolik;
        ctverec4.levyHRx = ctverec4.levyHRx + kolik;
    }
}
