package clase.decorator;

import clase.spital.DiagnosticAbstract;

public abstract class Decorator implements DiagnosticAbstract {
    private DiagnosticAbstract diagnostic;
    public abstract void afisareOnline();

    public Decorator(DiagnosticAbstract diagnostic) {
        this.diagnostic = diagnostic;
    }

    @Override
    public String getNume() {
        return diagnostic.getNume();
    }

    @Override
    public String getDescriereSimptome() {
        return diagnostic.getDescriereSimptome();
    }

    @Override
    public boolean isNecesitaSpitalizare() {
        return diagnostic.isNecesitaSpitalizare();
    }

    public DiagnosticAbstract getDiagnostic() {
        return diagnostic;
    }

    @Override
    public void printeazaDiagnostic() {
        diagnostic.printeazaDiagnostic();
        System.out.println("Rezultaul este disponibil si pe platforma");
    }
}
