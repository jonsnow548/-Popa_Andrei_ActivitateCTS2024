package SimpleFactory.Classes;

public class Brancardier extends PersonalSpital{
    public Brancardier(String nume, int salariu)
    {
        super(nume,salariu);
    }
    public void afisareDetalii()
    {
        System.out.println("Brancadierul" + getNume()+ " are salariul"+ getSalariu());
    }
}
