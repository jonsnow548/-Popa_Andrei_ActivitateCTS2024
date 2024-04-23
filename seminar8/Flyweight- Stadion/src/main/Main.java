package main;

import classes.Caracteristici;
import classes.Fabrica;
import classes.Flyweight;

public class Main {
    public static void main(String[] args) {
        Fabrica fabrica = new Fabrica();
        Caracteristici caracteristici = new Caracteristici(10, 15, "rosu");
        Caracteristici caracteristici1 = new Caracteristici(12, 13, "verde");
        Caracteristici caracteristici2 = new Caracteristici(10, 16, "albastru");

        fabrica.getSpectator(10, 10).deseneaza(caracteristici);
        fabrica.getSpectator(20, 10).deseneaza(caracteristici1);
        fabrica.getSpectator(10, 10).deseneaza(caracteristici2);
    }
}