package FactoryMethod.classes.factory;

import FactoryMethod.classes.Asistent;
import FactoryMethod.classes.PersonalSpital;

public class FabricaAsistent implements FabricaPersonal{
    @Override
    public PersonalSpital createPersonal(String nume, int salariu) {
        return new Asistent(nume,salariu);
    }
}


