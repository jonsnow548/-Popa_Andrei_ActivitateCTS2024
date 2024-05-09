package Clase;

public class SpitalPublic extends Template{
    private String numeSpital;
    private int nrPaturiLibere;

    public SpitalPublic(String numeSpital, int nrPaturiLibere) {
        this.numeSpital = numeSpital;
        this.nrPaturiLibere = nrPaturiLibere;
    }


    @Override
    protected void analizaSanatate(Pacient pacient) {
        pacient.setStareSanate((pacient.getNume().length()%5)+1);
        System.out.println("Pacientul" + pacient.getNume()+ "are starea " + pacient.getStareSanate());
    }

    @Override
    protected int disponibilitate() {
        return nrPaturiLibere;
    }

    @Override
    protected void emiteFisa(Pacient pacient) {
        System.out.println("Pacientul" +pacient.getNume()+"este internat in spitalul" + numeSpital);
        nrPaturiLibere=nrPaturiLibere-1;
    }

    @Override
    protected void refuzare(Pacient pacient) {
        System.out.println("Pacientul" + pacient.getNume()+"este trimis catre un alt spital deoarece spitalul"+
                numeSpital +" nu are locuri libere" );
    }

}
