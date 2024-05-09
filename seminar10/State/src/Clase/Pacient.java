package Clase;

public class Pacient {
    private String nume;
    private Stare stare;

    public Pacient(String nume) {
        this.nume = nume;
        this.stare = new Internat();
    }

    protected void setStare(Stare stare) {
        this.stare = stare;
    }

    public void seAgraveazaStarea() {
        if (this.stare instanceof Internat) {
            Stare subObservatie = new SubObservatie();
            subObservatie.setStare(this);
            System.out.println("starea pacientului " +  nume + " s-a agravat");
        } else {
            System.out.println("pacientul " + nume + " nu este internat");
        }
    }

    public void vindecare() {
        if (this.stare instanceof Internat) {
            Stare externat = new Externat();
            externat.setStare(this);
            System.out.println("Pacientul " + nume + " a fost externat");
        } else {
            System.out.println("pacientul " + nume + " nu poate fi externat");
        }
    }

    public void seImbunatatesteStarea() {
        if (this.stare instanceof SubObservatie) {
            Stare internare = new Internat();
            internare.setStare(this);
            System.out.println("starea pacientului " +  nume + " s-a imbunatatit");
        } else {
            System.out.println("pacientul " + nume + " nu era in stare grava");
        }
    }
}
