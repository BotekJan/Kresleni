package com.JnBtk.Hlasovani;

import java.util.Locale;

public class Anketa {
    private HlasovaciListek[] listky;

    public Anketa() {
        listky = new HlasovaciListek[2];
        HlasovaciListek listek1 = new HlasovaciListek(12);
        listek1.odpovez(1, 1);
        listek1.odpovez(2, 2);
        listek1.odpovez(3, 3);
        listek1.odpovez(4, 4);
        listek1.odpovez(5, 5);
        listek1.odpovez(6, 1);
        listek1.odpovez(7, 2);
        listek1.odpovez(8, 3);
        listky[0] = listek1;

        HlasovaciListek listek2 = new HlasovaciListek(13);
        listek2.odpovez(1, 3);
        listek2.odpovez(2, 4);
        listek2.odpovez(3, 5);
        listek2.odpovez(4, 2);
        listek2.odpovez(5, 1);
        listek2.odpovez(6, 3);
        listek2.odpovez(7, 4);
        listek2.odpovez(8, 5);
        listky[1] = listek2;

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
