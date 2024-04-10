package clase;

public class Sectie extends StructuraAbstracta{
    private int nrAngajati;
    private String sefSectie;

    public Sectie(String nume,int nrAngajati,String sefSectie) {
        super(nume);
        this.sefSectie=sefSectie;
        this.nrAngajati=nrAngajati;
    }

    @Override
    public void adaugaStructura(StructuraAbstracta sa) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void stergeStructura(StructuraAbstracta sa) {
        throw new UnsupportedOperationException();
    }

    @Override
    public StructuraAbstracta getStructura(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void afiseazaDescriere(String identare) {
        System.out.println(identare+"Sectia "+super.getNume()+" este codusa de "+this.sefSectie+ " si are "+this.nrAngajati+" angajati");
    }
}
