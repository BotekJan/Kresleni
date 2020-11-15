/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rozhrani;

/**
 * Rozhraní poskytující třídám pohyb
 * @author jarda
 */
public interface IPohybujici {
   
   /**
    * Funkce pro pohyb nahoru
    * @param kolik v px
    */
   public void krokNahoru(int kolik);
    /**
    * Funkce pro pohyb dolu
    * @param kolik v px
    */
   public void krokDolu(int kolik);
    /**
    * Funkce pro pohyb doleva
    * @param kolik v px
    */
   public void krokVlevo(int kolik);
    /**
    * Funkce pro pohyb doprava
    * @param kolik v px
    */
   public void krokVpravo(int kolik);
    
}
