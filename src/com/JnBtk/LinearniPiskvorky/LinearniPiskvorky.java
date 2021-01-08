package com.JnBtk.LinearniPiskvorky;

public class LinearniPiskvorky {
    private char[] pole = new char[100];
    private boolean naTahuX = true;

    public LinearniPiskvorky(){
        System.out.println("X je na tahu");
    }

    public void turn(int index){
        if(index < 0 || index > 99){
            System.out.println("špatný index, zkus to znova");
            return;
        }

        if(naTahuX == true){
            pole[index] = 'X';
            if (checkIfWon('X'))
                System.out.println("X vyhrálo");
        }
        else {
            pole[index] = 'O';
            if(checkIfWon('O'))
                System.out.println("O vyhrálo");
        }

        naTahuX = !naTahuX;
    }

    private boolean checkIfWon(char player){
        int count = 0;
        for(var ch : pole){
            if(ch == 'X')
                count++;
            if(ch == 'O')
                count--;

            if(player == 'X' && count == 3)
                return true;

            if (player == 'O' && count == -3)
                return true;
        }

        return false;
    }

}
