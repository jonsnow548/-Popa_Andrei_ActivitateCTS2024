package clase.spital;

public class Diagnostic implements DiagnosticAbstract {
    private String nume;
    private String descriereSimptome;
    private boolean necesitaSpitalizare;

    public Diagnostic(String nume, String descriereSimptome, boolean necesitaSpitalizare) {
        this.nume = nume;
        this.descriereSimptome = descriereSimptome;
        this.necesitaSpitalizare = necesitaSpitalizare;
    }

    public String getNume() {
        return nume;
    }

    public String getDescriereSimptome() {
        return descriereSimptome;
    }

    public boolean isNecesitaSpitalizare() {
        return necesitaSpitalizare;
    }

    @Override
    public void printeazaDiagnostic() {
        System.out.println(this.nume+" "+this.descriereSimptome+" "+((necesitaSpitalizare)? " ":"nu")+" necesita spitalizare");
    }
}
