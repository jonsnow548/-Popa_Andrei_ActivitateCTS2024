package classes;

public class ProxyVarsta implements Vanzare {
    private Vanzare vanzareBilet;
    private static int varstaMinima = 14;

    public static void setVarstaMinima(int varstaMinima) {
        ProxyVarsta.varstaMinima = varstaMinima;
    }

    public static int getVarstaMinima() {
        return varstaMinima;
    }

    public ProxyVarsta(Vanzare vanzareBilet) {
        this.vanzareBilet = vanzareBilet;
    }

    @Override
    public void vanzare(Persoana persoana) {
        if (persoana.getVarsta() >= getVarstaMinima()) {
            vanzareBilet.vanzare(persoana);
        } else {
            System.out.println("Ne cerem scuze, insa varsta minima este de 14 ani pentru " +
                    "participarea la acest meci sportiv.");
        }
    }
}
