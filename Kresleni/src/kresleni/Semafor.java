package kresleni;

import java.awt.*;

public class Semafor extends Objekt2D {

    public Semafor(int hrX, int hrY) {
        super(hrX, hrY);
    }

    @Override
    public void kresli(Graphics2D g) {
        new Ctverec(super.levyHRx, super.levyHRy, Color.GRAY, 100).kresli(g);
        new Ctverec(super.levyHRx, super.levyHRy + 100, Color.GRAY, 100).kresli(g);
        new Kruznice(super.levyHRx + 25, super.levyHRy + 15, 50, Color.RED, true).kresli(g);
        new Kruznice(super.levyHRx + 25, super.levyHRy + 75, 50, Color.ORANGE, true).kresli(g);
        new Kruznice(super.levyHRx + 25, super.levyHRy + 130, 50, Color.GREEN, true).kresli(g);
    }
}
