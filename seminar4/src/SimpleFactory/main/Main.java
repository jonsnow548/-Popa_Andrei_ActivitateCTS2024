package SimpleFactory.main;

import SimpleFactory.Classes.PersonalSpital;
import SimpleFactory.Classes.fabrica.Fabrica;
import SimpleFactory.Classes.fabrica.TipPersonal;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Fabrica fabrica =new Fabrica();
        try {
            PersonalSpital medic= fabrica.createPersonal(TipPersonal.MEDIC,"Andrei",5000);
            PersonalSpital asistent= fabrica.createPersonal(TipPersonal.ASISTENT,"Rares",5000);
            PersonalSpital brancardier= fabrica.createPersonal(TipPersonal.BRANCARDIER,"Ionut",5000);
            asistent.afisareDetalii();
            medic.afisareDetalii();
            brancardier.afisareDetalii();

        }
        catch (Exception e)
        {
            throw new RuntimeException(e);
        }
    }}