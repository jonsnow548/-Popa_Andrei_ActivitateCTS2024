package main;

import clase.Departament;
import clase.Sectie;
import clase.StructuraAbstracta;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        StructuraAbstracta cardiologie=new Departament("Cardiologie","Ion");
        StructuraAbstracta oftalmologie=new Departament("Oftalmologie","Pop");
        StructuraAbstracta terapieIntensiva=new Sectie("ATI",10,"Ionescu");
        StructuraAbstracta donare=new Sectie("Donare", 8,"Popescu");
        StructuraAbstracta optometrie=new Sectie("Optometrie", 4, "Barbu");

        oftalmologie.adaugaStructura(optometrie);
        cardiologie.adaugaStructura(terapieIntensiva);
        cardiologie.adaugaStructura(donare);

        StructuraAbstracta spital=new Departament("Spital","Popa");
        spital.adaugaStructura(oftalmologie);
        spital.adaugaStructura(cardiologie);

        spital.afiseazaDescriere(" ");
    }
}