package main;

import classes.Reteta;
import classes.RetetaAbstracta;
import classes.RetetaCrema;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {


        Map<String,Double> solutii1=new HashMap<>();
        solutii1.put("solutie1", 21.03);
        solutii1.put("solutie2",34.04);
        Reteta prototip= new Reteta(solutii1,"Medicament1");
        RetetaAbstracta reteta2=prototip.clone();
        System.out.println(reteta2);

        RetetaCrema retetaCremaPrototip=new RetetaCrema(45,"Galbenele");
        RetetaAbstracta retetaCrema=retetaCremaPrototip.clone();
        System.out.println(retetaCrema);

    }
}