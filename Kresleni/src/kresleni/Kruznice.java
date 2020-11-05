package kresleni;

import java.awt.*;

public class Kruznice extends Objekt2D{
    private int polomer;
    /**
     * Konstruktor pro vytvoření nového objektu. Objekt se kreslí (vybarvuje) černou barvou
     *
     * @param hrX x-ová souřadnice levého horního bodu objektu
     * @param hrY y-ová souřadnice levého horního bodu objektu
     * @param polomer poloměr kružnice
     * @param color barva kružnice
     */
    public Kruznice(int hrX, int hrY, int polomer, Color color) {
        super(hrX, hrY, color);
        this.polomer = polomer;
    }

    /**
     * Konstruktor pro vytvoření nového objektu. Objekt se kreslí (vybarvuje) černou barvou
     *
     * @param g grafický kontext, který umí kreslit objekty
     */
    @Override
    public void kresli(Graphics2D g) {
        g.setColor(super.barva);
        g.drawOval(super.levyHRx, super.levyHRy, polomer, polomer);
    }
}
