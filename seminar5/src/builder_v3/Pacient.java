package builder_v3;

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


    public static class PacientBuilder implements Builder{
        private boolean patRabatabil;
        private boolean micdejunInclus;
        private boolean papuci;
        private boolean halat;

        public PacientBuilder() {
            this.patRabatabil = false;
            this.micdejunInclus = false;
            this.papuci = false;
            this.halat = false;
        }

        @Override
        public Pacient build() {
            return new Pacient(patRabatabil,micdejunInclus,papuci,halat);
        }
        public PacientBuilder setPatRabatabil(boolean patRabatabil){
            this.patRabatabil=patRabatabil;
            return this;
        }

        public PacientBuilder setMicdejunInclus(boolean micdejunInclus) {
            this.micdejunInclus = micdejunInclus;
            return this;
        }

        public PacientBuilder setPapuci(boolean papuci) {
            this.papuci = papuci;
            return this;
        }

        public PacientBuilder setHalat(boolean halat) {
            this.halat = halat;
            return this;
        }
    }
}
