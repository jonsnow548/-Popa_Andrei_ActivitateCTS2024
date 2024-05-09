package Clase;

public class Pacient {
    private String nume;
    private int stareSanate;

    public Pacient(String nume, int stareSanate) {
        this.nume = nume;
        this.stareSanate = stareSanate;
    }

    public String getNume() {
        return nume;
    }

    public int getStareSanate() {
        return stareSanate;
    }

    public void setStareSanate(int stareSanate) {
        this.stareSanate = stareSanate;
    }

    @Override
    public String toString() {
        return "Pacient{" +
                "nume='" + nume + '\'' +
                ", stareSanate=" + stareSanate +
                '}';
    }
}
