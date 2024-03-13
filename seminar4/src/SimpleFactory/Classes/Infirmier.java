package SimpleFactory.Classes;

public class Infirmier extends PersonalSpital {
    public Infirmier(String nume, int salariu)
    {
        super(nume,salariu);
    }
    public void afisareDetalii()
    {
        System.out.println("Infirmierul" + getNume()+ " are salariul"+ getSalariu());
    }
}
