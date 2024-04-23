package main;

import clase.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Portar portar=new Portar();
        String suporter1,suporter2,suporter3;
        suporter1="GigelVIP";
        suporter2="GigelTribuna";
        suporter3="GigelPeluza";
        portar.setStrategie(new verificatorVIP());
        portar.verificaSuporter(suporter1);

        portar.setStrategie(new verificatorPeluza());
        portar.verificaSuporter(suporter3);

        portar.setStrategie(new VerificatorTribuna());
        portar.verificaSuporter(suporter2);
    }
}