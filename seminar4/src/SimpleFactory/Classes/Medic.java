package SimpleFactory.Classes;

public class Medic extends PersonalSpital{

    public Medic(String nume, int salariu)
    {
        super(nume,salariu);
    }
    public void afisareDetalii()
    {
        System.out.println("Medicul" + getNume()+ " are salariul"+ getSalariu());
    }
}
