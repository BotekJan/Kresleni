/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kresleni;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

/**
 * Třída, která v sobě uchovává všechny objekty, které budeme vykreslovat
 * @author JH
 */
public class MojeUtvary {
  private List<Objekt2D> utvary;  //seznam vykreslovaných útvarů
  
  /**
   * Konstruktor pro třídu MojeUtvary. Inicializuje seznam vykreslovaných objektů
   * Seznam obsahuje na začátku dva nedefinované 2D Objekty
   */
  public MojeUtvary()
  {
   utvary = new ArrayList<Objekt2D>();
   utvary.add(new Robot(300, 100, Color.BLACK, Color.BLUE, Color.PINK));
   utvary.add(new Robot(500, 230, Color.GREEN, Color.RED, Color.GRAY));

  }  
  
/**
 * Metoda na vrácení seznamu všech vykreslovaných útvarů
 * @return seznam vykreslených útvarů
 */  
  public List<Objekt2D> vratUtvary()
  {
   return utvary;
  }  
  
  /**
   * Metoda na přidání nového objektu na kreslení. Objekt musí být instancí třídy Objekt2D nebo jeho potomkem
   * @param novy nový přidaný objekt, který se bude vykreslovat
   */
  public void pridejUtvar(Objekt2D novy)
  {
    utvary.add(novy);
  }        
  
  /**
   * Metoda na smazání seznamu všech vykreslovaných útvarů
   */
  public void smazSeznam()
  {
   this.utvary.clear();
  }       
 
}
