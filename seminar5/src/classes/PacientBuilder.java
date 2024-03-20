package classes;

public class PacientBuilder implements Builder{

    Pacient pacient;

    public PacientBuilder() {
        pacient=new Pacient(false,false,false,false);

    }

    public PacientBuilder setPatRabatabil(boolean patRabatabil) {
        this.pacient.setPatRabatabil(patRabatabil);
        return this;
    }

    public PacientBuilder setMicdejunInclus(boolean micdejunInclus) {
        this.pacient.setMicdejunInclus(micdejunInclus);
        return this;
    }

    public PacientBuilder setPapuci(boolean papuci) {
        this.pacient.setPapuci(papuci);
        return this;
    }

    public PacientBuilder setHalat(boolean halat) {
        this.pacient.setHalat(halat);
        return this;
    }
    @Override
    public Pacient build() {
        return pacient;
    }

}
