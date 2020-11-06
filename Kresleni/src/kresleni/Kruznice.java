package kresleni;

import java.awt.*;

public class Kruznice extends Objekt2D{
    private int polomer;
    private boolean filled;
    /**
     * Konstruktor pro vytvoření nového objektu. Objekt se kreslí (vybarvuje) černou barvou
     *
     * @param hrX x-ová souřadnice levého horního bodu objektu
     * @param hrY y-ová souřadnice levého horního bodu objektu
     * @param polomer poloměr kružnice
     * @param color barva kružnice
     * @param filled if the circle is to be filled or not
     */
    public Kruznice(int hrX, int hrY, int polomer, Color color, boolean filled) {
        super(hrX, hrY, color);
        this.polomer = polomer;
        this.filled = filled;
    }

    /**
     * Konstruktor pro vytvoření nového objektu.
     *
     * @param g grafický kontext, který umí kreslit objekty
     */
    @Override
    public void kresli(Graphics2D g) {
        g.setColor(color);
        if(filled)
            g.fillOval(levyHRx, levyHRy, polomer, polomer);
        else
        g.drawOval(levyHRx, levyHRy, polomer, polomer);
    }
}
