package subject;

import clase.Obsever;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
    List<Obsever>obsevers;

    public Subject() {
        obsevers=new ArrayList<>();
    }

    public void adaugaAbonat(Obsever obsever)
    {

        obsevers.add(obsever);
    }
    public void stergeAbonat(Obsever obsever)
    {
        obsevers.remove(obsever);
    }
    public void notificaAbonat(String mesaj)
    {
        for (Obsever obsever : obsevers)
        {
            obsever.primesteNotificare(mesaj);
        }

    }
    public abstract void notificaMeciFotbal();
    public abstract void notificaMeciVolei();

    public abstract void notificaMeciHandbal();

}
