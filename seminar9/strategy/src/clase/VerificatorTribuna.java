package clase;

public class VerificatorTribuna implements Verificator{
    @Override
    public void verifica(String nume) {
        System.out.println("Ii sunt verificate bagajele lui " + nume);
    }
}
