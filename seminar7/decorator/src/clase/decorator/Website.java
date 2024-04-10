package clase.decorator;

import clase.spital.DiagnosticAbstract;

public class Website extends Decorator{
    public Website(DiagnosticAbstract diagnostic) {
        super(diagnostic);
    }

    @Override
    public void afisareOnline() {
        System.out.println("In cadrul site-ului nostru ati primit urmatorul diagnostic: "+"\n"+super.getNume()+" "+super.getDescriereSimptome()+" "+((super.isNecesitaSpitalizare())? " ":" nu")+" are nev de spitalizare");
    }
}
