package main;

import classes.*;

public class Main {
    public static void main(String[] args) {

        Vanzare vanzareBilete = new VanzareBilet("CFR-FCBS", 150);
        Persoana persoana1 = new Persoana("Andrei", "masculin", 18);
        Persoana persoana2 = new Persoana("Ionel", "masculin", 21);
        Persoana persoana3 = new Persoana("Maria", "feminin", 22);
        Persoana persoana4 = new Persoana("Ana", "feminin", 25);

        vanzareBilete.vanzare(persoana1);
        vanzareBilete.vanzare(persoana2);
        vanzareBilete.vanzare(persoana3);
        vanzareBilete.vanzare(persoana4);

        Vanzare vanzareBiletPrinProxy = new ProxyVarsta(vanzareBilete);

        Persoana persoana5 = new Persoana("Roxana", "feminin", 13);
        vanzareBiletPrinProxy.vanzare(persoana5);


        Vanzare vanzareBiletPrinProxyGen = new ProxyGen(vanzareBilete, "feminin");
        Persoana persoana6 = new Persoana("Laur", "masculin", 18);
        vanzareBiletPrinProxyGen.vanzare(persoana6);


        Vanzare proxyGen = new ProxyGen(vanzareBiletPrinProxy, "masculin");
        Persoana persoana7 = new Persoana("Laura", "feminin", 18);
        proxyGen.vanzare(persoana7);



    }
}