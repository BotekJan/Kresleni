package kresleni;

import rozhrani.IPohybujici;

import java.awt.*;

public class Robot extends Objekt2D implements IPohybujici {
    Color headColor;
    Color bodyColor;
    Color wheelColor;
    Kruznice head;
    Ctverec body;
    Kruznice wheel;
    /**
     * Konstruktor pro vytvoření nového objektu. Objekt se kreslí (vybarvuje) černou barvou
     *
     * @param hrX   x-ová souřadnice levého horního bodu objektu
     * @param hrY   y-ová souřadnice levého horního bodu objektu
     * @param headColor - color of the robots head
     * @param bodyColor - color of the robots body
     * @param wheelColor - color of the robots wheel
     *
     */
    public Robot(int hrX, int hrY, Color headColor, Color bodyColor, Color wheelColor) {
        super(hrX, hrY);
        this.headColor = headColor;
        this.bodyColor = bodyColor;
        this.wheelColor = wheelColor;
        this.head = new Kruznice(levyHRx, levyHRy,50, headColor, false);
        this.body = new Ctverec(levyHRx - 25, levyHRy + 50, bodyColor, 100);
        this.wheel =  new Kruznice(levyHRx + 12, levyHRy + 150, 25, wheelColor, true);
    }

    @Override
    public void kresli(Graphics2D g) {
        head.kresli(g);
        body.kresli(g);
        wheel.kresli(g);
    }

    @Override
    public void krokNahoru(int kolik) {
        head.levyHRy = head.levyHRy - kolik;
        body.levyHRy = body.levyHRy - kolik;
        wheel.levyHRy = wheel.levyHRy - kolik;
    }

    @Override
    public void krokDolu(int kolik) {
        head.levyHRy = head.levyHRy + kolik;
        body.levyHRy = body.levyHRy + kolik;
        wheel.levyHRy = wheel.levyHRy + kolik;
    }

    @Override
    public void krokVlevo(int kolik) {
        head.levyHRx = head.levyHRx - kolik;
        body.levyHRx = body.levyHRx - kolik;
        wheel.levyHRx = wheel.levyHRx - kolik;
    }

    @Override
    public void krokVpravo(int kolik) {
        head.levyHRx = head.levyHRx + kolik;
        body.levyHRx = body.levyHRx + kolik;
        wheel.levyHRx = wheel.levyHRx + kolik;
    }
}
