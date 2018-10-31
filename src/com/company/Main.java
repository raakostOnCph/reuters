package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Rygtebørsen rygtebørsen = new Rygtebørsen();

        Kunde eb = new Avis(rygtebørsen, "Bornholms tidende");

        Kunde bt = new Avis(rygtebørsen, "Berlingske formiddag");

        Kunde kunde = new Avis(rygtebørsen, "lokalavisen");

        rygtebørsen.afmeld(bt);




        rygtebørsen.gåIBreaking("mand bider hund");
    }
}
