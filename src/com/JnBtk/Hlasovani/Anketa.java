package com.JnBtk.Hlasovani;

import java.util.Locale;

public class Anketa {
    private HlasovaciListek[] listky;

    public Anketa(int velikost) {
        listky = new HlasovaciListek[velikost];
    }

    public void zobrazListek(int ID){
        for (var listek : listky) {
            if(listek != null && listek.getId() == ID){
                for (int i = 1; i < 9; i++) {
                    StringBuilder builder = new StringBuilder();
                    for(int j = 1; j < 6; j++){
                        if(j == listek.getOdpoved(i)){
                            builder.append("X ");
                        }
                        else {
                            builder.append(j);
                            builder.append(" ");
                        }

                    }
                    System.out.println(builder.toString());
                }
                return;
            }
        }

    }

    public void vypisPrumer(){
        for(int i = 1; i < 9; i++){
            int avg = 0;
            for(var listek : listky){
                if(listek != null)
                 avg += listek.getOdpoved(i);
            }
            System.out.println(avg / listky.length);
        }
    }

}
