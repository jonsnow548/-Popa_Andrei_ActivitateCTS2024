package FactoryMethod.classes.factory;

import FactoryMethod.classes.Asistent;
import FactoryMethod.classes.Medic;
import FactoryMethod.classes.PersonalSpital;

public class FabricaMedic implements FabricaPersonal {

    @Override
    public PersonalSpital createPersonal(String nume, int salariu) {
        return new Medic(nume,salariu);
    }
}
