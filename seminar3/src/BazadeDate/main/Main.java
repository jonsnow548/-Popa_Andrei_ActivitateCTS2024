package BazadeDate.main;

import BazadeDate.classes.ConexiuneBazaDeDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ConexiuneBazaDeDate conexiune1=ConexiuneBazaDeDate.getInstance("Baza1",20,"link1");
        ConexiuneBazaDeDate conexiune2=ConexiuneBazaDeDate.getInstance("Baza2",50,"link2");
       conexiune1.setNumeBaza("NewName");

        System.out.println(conexiune1);
        System.out.println(conexiune2);
    }
}