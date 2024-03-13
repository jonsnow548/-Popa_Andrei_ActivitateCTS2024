package FactoryMethod.classes.factory;

import FactoryMethod.classes.Brancardier;
import FactoryMethod.classes.PersonalSpital;

public class FabricaBrancardier implements FabricaPersonal{
    @Override
    public PersonalSpital createPersonal(String nume, int salariu) {
        return new Brancardier(nume,salariu);
    }
}
