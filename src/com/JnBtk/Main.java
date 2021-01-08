package com.JnBtk;

import com.JnBtk.Hlasovani.Anketa;
import com.JnBtk.LinearniPiskvorky.LinearniPiskvorky;

public class Main {

    public static void main(String[] args) {
		LinearniPiskvorky piskvorky = new LinearniPiskvorky();
		piskvorky.turn(0);
		piskvorky.turn(99);
		piskvorky.turn(1);
		piskvorky.turn(98);
		piskvorky.turn(2);
	}
}
