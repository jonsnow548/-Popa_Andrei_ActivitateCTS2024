package classes;

public class Persoana {
    private String nume;
    private String gen;
    private int varsta;

    public Persoana(String nume, String gen, int varsta) {
        this.nume = nume;
        this.gen = gen;
        this.varsta = varsta;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getGen() {
        return gen;
    }

    public void setGen(String gen) {
        this.gen = gen;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    @Override
    public String toString() {
        return "Persoana{" +
                "nume='" + nume + '\'' +
                ", gen='" + gen + '\'' +
                ", varsta=" + varsta +
                '}';
    }
}
