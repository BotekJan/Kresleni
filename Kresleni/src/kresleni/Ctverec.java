package kresleni;

import java.awt.*;

public class Ctverec extends Objekt2D {
    int size;
    /**
     * Konstruktor pro vytvoření nového objektu. Objekt se kreslí (vybarvuje) černou barvou
     *
     * @param hrX   x-ová souřadnice levého horního bodu objektu
     * @param hrY   y-ová souřadnice levého horního bodu objektu
     * @param color
     */
    public Ctverec(int hrX, int hrY, Color color, int size) {
        super(hrX, hrY, color);
        this.size = size;
    }

    @Override
    public void kresli(Graphics2D g)
    {
        g.setColor(super.color);
        g.fill(new Rectangle(levyHRx, levyHRy, size, size));
    }
}
