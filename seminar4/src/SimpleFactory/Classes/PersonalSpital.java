package SimpleFactory.Classes;

public abstract class PersonalSpital {
    private String nume;
    private int salariu;

    public PersonalSpital(String nume, int salariu) {
        this.nume = nume;
        this.salariu = salariu;
    }

    @Override
    public String toString() {
        return "PersonalSpital{" +
                "nume='" + nume + '\'' +
                ", salariu=" + salariu +
                '}';
    }
    public abstract void  afisareDetalii();

    public String getNume() {
        return nume;
    }

    public int getSalariu() {
        return salariu;
    }
}
