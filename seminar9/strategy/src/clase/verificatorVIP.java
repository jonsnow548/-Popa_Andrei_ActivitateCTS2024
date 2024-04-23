package clase;

public class verificatorVIP implements Verificator{

    @Override
    public void verifica(String nume) {
        System.out.printf("Este verificat biletul lui " + nume );
    }
}
