package kresleni;

import java.awt.*;

public class Robot extends Objekt2D{
    Color headColor;
    Color bodyColor;
    Color wheelColor;
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
    }

    @Override
    public void kresli(Graphics2D g) {
        new Kruznice(levyHRx, levyHRy,50, headColor, false).kresli(g); //head
        new Ctverec(levyHRx - 25, levyHRy + 50, bodyColor, 100).kresli(g); // body
        new Kruznice(levyHRx + 12, levyHRy + 150, 25, wheelColor, true).kresli(g); // wheel
    }
}
