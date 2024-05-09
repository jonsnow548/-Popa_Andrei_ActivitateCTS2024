package Clase;

public class Externat implements Stare{
    protected Externat() {

    }
    @Override
    public void setStare(Pacient pacient) {
        pacient.setStare(this);
    }
}
