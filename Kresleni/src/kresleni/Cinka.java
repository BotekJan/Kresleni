package kresleni;

import java.awt.*;

public class Cinka extends Objekt2D{
    public Cinka(int hrX, int hrY) {
        super(hrX, hrY);
    }

    @Override
    public void kresli(Graphics2D g) {
        new Kruznice(levyHRx, levyHRy, 100, Color.BLACK, true).kresli(g);
        new Ctverec(levyHRx + 70, levyHRy + 30, Color.BLACK, 30).kresli(g);
        new Ctverec(levyHRx + 100, levyHRy + 30, Color.BLACK, 30).kresli(g);
        new Ctverec(levyHRx + 130, levyHRy + 30, Color.BLACK, 30).kresli(g);
        new Ctverec(levyHRx + 160, levyHRy + 30, Color.BLACK, 30).kresli(g);
        new Ctverec(levyHRx + 190, levyHRy + 30, Color.BLACK, 30).kresli(g);
        new Kruznice(levyHRx + 210, levyHRy, 100, Color.BLACK, true).kresli(g);
    }
}
