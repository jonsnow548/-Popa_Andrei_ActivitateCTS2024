package main;
import classes.Pacient;
import classes.PacientBuilder;


import classes.PacientBuilder;

public class Main {
    public static void main(String[] args) {
        Pacient pacient1=new PacientBuilder().setPatRabatabil(true).setMicdejunInclus(true).setPapuci(true).setHalat(true).build();
        System.out.println(pacient1.toString());
        Pacient pacient2=new PacientBuilder().setPatRabatabil(true).build();
        System.out.println(pacient2.toString());

    }
}