package FactoryMethod.main;

import FactoryMethod.classes.Medic;
import FactoryMethod.classes.PersonalSpital;
import FactoryMethod.classes.factory.*;

public class Main {

    public static void prelucrarePersonal(FabricaPersonal fabricaPersonal, String nume,int salariu){
        FactoryMethod.classes.PersonalSpital personalSpital=  fabricaPersonal.createPersonal(nume,salariu);
        personalSpital.afisareDetalii();
    }
    public static void main(String[] args) {
        FabricaPersonal fabricaMedic=new FabricaMedic();
        FabricaPersonal fabricaAsistent=new FabricaAsistent();
        FabricaBrancardier fabricaBrancardier=new FabricaBrancardier();

        PersonalSpital medic= fabricaMedic.createPersonal("Andrei",10000);
        PersonalSpital asistent= fabricaAsistent.createPersonal("Carla",10000);
        PersonalSpital brancardier= fabricaBrancardier.createPersonal("Sabin",10000);


        prelucrarePersonal(new FabricaMedic(),"Ionut",7000);
        prelucrarePersonal(new FabricaInfirmier(),"Alex",7000);


    }
}