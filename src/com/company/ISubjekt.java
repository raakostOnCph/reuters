package com.company;

public interface ISubjekt {

    public void tilmeld(Kunde k);
    public void afmeld(Kunde k);
    public void advis();

    public String sendnyhed();

    public void gåIBreaking(String s);

}
