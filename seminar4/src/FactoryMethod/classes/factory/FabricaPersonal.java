package FactoryMethod.classes.factory;

import FactoryMethod.classes.Asistent;
import FactoryMethod.classes.PersonalSpital;

public interface FabricaPersonal {
    public PersonalSpital createPersonal(String nume, int salariu);


}
