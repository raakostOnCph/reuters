package com.company;

import java.util.ArrayList;

public class Rygtebørsen implements ISubjekt {

    String nyheden = "";

    ArrayList <Kunde> kundeliste = new ArrayList<>();

    @Override
    public void tilmeld(Kunde k) {


        System.out.println("vi har noget i listen");
        kundeliste.add(k);

    }

    @Override
    public void afmeld(Kunde k) {

        int index = kundeliste.indexOf(k);

        if(index > -1 ) {

            kundeliste.remove(index);

        }


    }

    @Override
    public void advis() {

        for (Kunde k: kundeliste
             ) {
            k.hentNyhed();
        }



    }

    @Override
    public String sendnyhed() {
        return nyheden;
    }

    @Override
    public void gåIBreaking(String s) {

        nyheden = s;
        advis();

    }
}
