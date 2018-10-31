package com.company;

public class Avis implements Kunde {

    String nyhed= "";

    String navn;

    ISubjekt subjekt;

    public Avis(ISubjekt subjekt, String navn) {
        this.subjekt = subjekt;
        subjekt.tilmeld(this);
        this.navn = navn;
    }


    @Override
    public void hentNyhed() {

        nyhed = subjekt.sendnyhed();

        udskriv();

    }

    @Override
    public void udskriv() {

        System.out.println( navn.toUpperCase() + " siger " + nyhed);

    }
}
