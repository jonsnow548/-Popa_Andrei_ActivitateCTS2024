package classes;

public class Pacient {
    private boolean patRabatabil;
    private boolean micdejunInclus;
    private boolean papuci;
    private boolean halat;

    public Pacient(boolean patRabatabil, boolean micdejunInclus, boolean papuci, boolean halat) {
        this.patRabatabil = patRabatabil;
        this.micdejunInclus = micdejunInclus;
        this.papuci = papuci;
        this.halat = halat;
    }

    public void setPatRabatabil(boolean patRabatabil) {
        this.patRabatabil = patRabatabil;
    }

    public void setMicdejunInclus(boolean micdejunInclus) {
        this.micdejunInclus = micdejunInclus;
    }

    public void setPapuci(boolean papuci) {
        this.papuci = papuci;
    }

    public void setHalat(boolean halat) {
        this.halat = halat;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Pacient{");
        sb.append("patRabatabil=").append(patRabatabil);
        sb.append(", micdejunInclus=").append(micdejunInclus);
        sb.append(", papuci=").append(papuci);
        sb.append(", halat=").append(halat);
        sb.append('}');
        return sb.toString();
    }
}
