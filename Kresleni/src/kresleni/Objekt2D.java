/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kresleni;

import java.awt.Color;
import java.awt.Graphics2D;

/**
 * Výchozí třída pro všechny objekty, které se mohou vykreslovat
 * @author jarda
 */
public class Objekt2D {
  protected int levyHRx; //levý horní roh - souřadnice x
  protected int levyHRy; //levý horní roh - souřadnice y
  protected Color color;

    /**
     * Konstruktor pro vytvoření nového objektu. Objekt se kreslí (vybarvuje) černou barvou
     * @param hrX x-ová souřadnice levého horního bodu objektu
     * @param hrY y-ová souřadnice levého horního bodu objektu
     */
    public Objekt2D(int hrX, int hrY)
    {
        this.levyHRx = hrX;
        this.levyHRy = hrY;
    }

  /**
   * Konstruktor pro vytvoření nového objektu. Objekt se kreslí (vybarvuje) černou barvou
   * @param hrX x-ová souřadnice levého horního bodu objektu
   * @param hrY y-ová souřadnice levého horního bodu objektu
   * @param color - color of the object
   */
  public Objekt2D(int hrX, int hrY, Color color )
  {
   this.levyHRx = hrX;
   this.levyHRy = hrY;
   this.color = color;
  }
 
   
  /**
   * Metoda na kreslení objektu - nastaví barvu kreslení
   * @param g grafický kontext, který umí kreslit objekty
   */
  public void kresli(Graphics2D g)
  {
   g.setColor(color);
   g.drawString("Nedefinovaný objekt", levyHRx, levyHRy+10);
  }
  
  
  
}
