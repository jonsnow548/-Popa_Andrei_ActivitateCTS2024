package subject;

public class Stadion extends Subject{
    @Override
    public void notificaMeciFotbal() {
        super.notificaAbonat("Azi e un meci de fotbal");

    }

    @Override
    public void notificaMeciVolei() {
        super.notificaAbonat("Meci de volei are loc");
    }

    @Override
    public void notificaMeciHandbal() {
        super.notificaAbonat("Are loc meci de handbal");


    }
    public void notificaConcert()
    {
        super.notificaAbonat("Are loc un concert");
    }
}
