package FactoryMethod.classes;

public class Brancardier extends PersonalSpital{
    public Brancardier(String nume, int salariu)
    {
        super(nume,salariu);
    }
    public void afisareDetalii()
    {
        System.out.println("Brancardierul" + getNume()+ " are salariul"+ getSalariu());
    }
}
