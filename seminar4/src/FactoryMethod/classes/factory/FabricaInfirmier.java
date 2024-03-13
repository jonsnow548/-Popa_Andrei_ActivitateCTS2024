package FactoryMethod.classes.factory;

import FactoryMethod.classes.Infirmier;
import FactoryMethod.classes.Medic;
import FactoryMethod.classes.PersonalSpital;

public class FabricaInfirmier implements FabricaPersonal {
    @Override
    public PersonalSpital createPersonal(String nume, int salariu) {
        return new Infirmier(nume,salariu);
    }
}
