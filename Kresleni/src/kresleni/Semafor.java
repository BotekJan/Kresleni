package kresleni;

import rozhrani.IPohybujici;

import java.awt.*;

public class Semafor extends Objekt2D implements IPohybujici {
    private Ctverec ctverec1;
    private Ctverec ctverec2;
    private Kruznice kruznice1;
    private Kruznice kruznice2;
    private Kruznice kruznice3;


    public Semafor(int hrX, int hrY) {
        super(hrX, hrY);
        this.ctverec1 = new Ctverec(super.levyHRx, super.levyHRy, Color.GRAY, 100);
        this.ctverec2 = new Ctverec(super.levyHRx, super.levyHRy + 100, Color.GRAY, 100);
        this.kruznice1 = new Kruznice(super.levyHRx + 25, super.levyHRy + 15, 50, Color.RED, true);
        this.kruznice2 = new Kruznice(super.levyHRx + 25, super.levyHRy + 75, 50, Color.ORANGE, true);
        this.kruznice3 = new Kruznice(super.levyHRx + 25, super.levyHRy + 130, 50, Color.GREEN, true);
    }

    @Override
    public void kresli(Graphics2D g) {
        ctverec1.kresli(g);
        ctverec2.kresli(g);
        kruznice1.kresli(g);
        kruznice2.kresli(g);
        kruznice3.kresli(g);
    }

    @Override
    public void krokNahoru(int kolik) {
        ctverec1.levyHRy = ctverec1.levyHRy - kolik;
        ctverec2.levyHRy = ctverec2.levyHRy - kolik;
        kruznice1.levyHRy = kruznice1.levyHRy - kolik;
        kruznice2.levyHRy = kruznice2.levyHRy - kolik;
        kruznice3.levyHRy = kruznice3.levyHRy - kolik;
    }

    @Override
    public void krokDolu(int kolik) {
        ctverec1.levyHRy = ctverec1.levyHRy + kolik;
        ctverec2.levyHRy = ctverec2.levyHRy + kolik;
        kruznice1.levyHRy = kruznice1.levyHRy + kolik;
        kruznice2.levyHRy = kruznice2.levyHRy + kolik;
        kruznice3.levyHRy = kruznice3.levyHRy + kolik;
    }

    @Override
    public void krokVlevo(int kolik) {
        ctverec1.levyHRx = ctverec1.levyHRx - kolik;
        ctverec2.levyHRx = ctverec2.levyHRx - kolik;
        kruznice1.levyHRx = kruznice1.levyHRx - kolik;
        kruznice2.levyHRx = kruznice2.levyHRx - kolik;
        kruznice3.levyHRx = kruznice3.levyHRx - kolik;
    }

    @Override
    public void krokVpravo(int kolik) {
        ctverec1.levyHRx = ctverec1.levyHRx + kolik;
        ctverec2.levyHRx = ctverec2.levyHRx + kolik;
        kruznice1.levyHRx = kruznice1.levyHRx + kolik;
        kruznice2.levyHRx = kruznice2.levyHRx + kolik;
        kruznice3.levyHRx = kruznice3.levyHRx + kolik;
    }
}
