package subject;

public class Sala extends Subject{

    @Override
    public void notificaMeciFotbal() {
        String mesaj="Va avea loc un meci de fotbal la ora 20";
        notificaAbonat(mesaj);
    }

    @Override
    public void notificaMeciHandbal() {
        String mesaj="Va avea loc un meci de handbal la ora 20";
        notificaAbonat(mesaj);
    }

    @Override
    public void notificaMeciVolei() {
        String mesaj="Va avea loc un meci de volei la ora 20";
        notificaAbonat(mesaj);
    }
}
