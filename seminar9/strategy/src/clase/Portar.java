package clase;

public class Portar {
    private Verificator strategie;

    public Portar(Verificator strategie) {
        this.strategie = strategie;
    }

    public Portar() {
        this.strategie= new verificatorPeluza();
    }

    public void setStrategie(Verificator strategie) {
        this.strategie = strategie;
    }
    public void verificaSuporter(String numeSuporter)
    {
        strategie.verifica(numeSuporter);

    }

}
