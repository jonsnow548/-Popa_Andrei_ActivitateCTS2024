package classes;

public class Caracteristici {
    private int pozitieX;
    private int pozitieY;
    private String culoareTrciou;

    public Caracteristici(int pozitieX, int pozitieY, String culoareTrciou) {
        this.pozitieX = pozitieX;
        this.pozitieY = pozitieY;
        this.culoareTrciou = culoareTrciou;
    }

    @Override
    public String toString() {
        return "Caracteristici{" +
                "pozitieX=" + pozitieX +
                ", pozitieY=" + pozitieY +
                ", culoareTrciou='" + culoareTrciou + '\'' +
                '}';
    }
}
