package classes;

public class ProxyGen implements Vanzare {
    Vanzare vanzareBilet;
    private String gen;

    public void setGen(String gen) {
        this.gen = gen;
    }

    public String getGen() {
        return gen;
    }

    public ProxyGen(Vanzare vanzareBilet, String gen) {
        this.vanzareBilet = vanzareBilet;
        this.gen = gen;
    }

    public ProxyGen(Vanzare vanzareBilet) {
        this.vanzareBilet = vanzareBilet;
    }

    @Override
    public void vanzare(Persoana persoana) {
        if (persoana.getGen().equals(getGen())) {
            vanzareBilet.vanzare(persoana);
        } else {
            System.out.println("Ne cerem scuze, acest eveniment este destinat doar persoanelor de gen " +
                    getGen());
        }
    }
}
