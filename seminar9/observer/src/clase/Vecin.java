package clase;

public class Vecin implements Obsever{
    private String nume;
    private float distanta;

    public Vecin(String nume, float distanta) {
        this.nume = nume;
        this.distanta = distanta;
    }

    @Override
    public void primesteNotificare(String mesaj) {
        System.out.println(nume + " sala aflata la distanta de " + distanta + " a trimis urmatorul mesaj " + mesaj);;
    }
}
