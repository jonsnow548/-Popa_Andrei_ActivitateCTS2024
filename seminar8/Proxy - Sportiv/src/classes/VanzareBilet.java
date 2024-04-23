package classes;

public class VanzareBilet implements Vanzare{
    private String numeMeci;
    private int pretBilet;

    public VanzareBilet(String numeMeci, int pretBilet) {
        this.numeMeci = numeMeci;
        this.pretBilet = pretBilet;
    }

    @Override
    public void vanzare(Persoana persoana) {
        System.out.println("Persoana " + persoana.getNume() + " a cumparat bilet la meciul "
        + this.numeMeci + " la pretul de " + this.pretBilet + " lei.");
    }
}
