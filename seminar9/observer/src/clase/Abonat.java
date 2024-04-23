package clase;

public class Abonat implements Obsever{
    private String nume;

    public Abonat(String nume) {
        this.nume = nume;
    }
    @Override
    public void primesteNotificare(String mesaj)
    {
        System.out.println(nume + " sala a trimis urmatorul mesaj " + mesaj);;

    }
}
