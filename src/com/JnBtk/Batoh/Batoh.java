package com.JnBtk.Batoh;

public class Batoh {
    private int nosnost;
    private int pocetVeciVBatohu;
    private Item[] itemy;

    public Batoh(int nosnost, int pocetPozic) {
        this.nosnost = nosnost;
        this.itemy = new Item[pocetPozic];
    }

    public boolean vlozItem(Item item){
        if(urciVolnouHmotnost() >= item.getVaha() && pocetVeciVBatohu < itemy.length){
            itemy[pocetVeciVBatohu] = item;
            pocetVeciVBatohu++;
            return true;
        }

        return false;
    }

    public boolean odeberItem(Item item){
        int index = 0;
        for(var vec : itemy){
            if(vec.equals(item)){
                itemy[index] = null;
                return true;
            }
            index++;
        }

        return false;
    }

    public boolean odeberItem(int pozice){
        if(pozice > itemy.length - 1 || pozice < 0)
            return false;

        itemy[pozice] = null;

        return true;
    }

    public int urciVolnouHmotnost(){
        int hmotnostItemu = 0;
        for(var vec : itemy){
            if(vec != null)
            hmotnostItemu += vec.getVaha();
        }

        return nosnost - hmotnostItemu;
    }
}
