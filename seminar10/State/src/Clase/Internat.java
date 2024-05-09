package Clase;

public class Internat implements Stare{
    protected Internat() {
    }

    @Override
    public void setStare(Pacient pacient) {
        pacient.setStare(this);
    }
}
