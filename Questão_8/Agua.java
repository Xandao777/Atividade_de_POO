package Questão_8;

public class Agua extends SubstanciaPura {
    @Override
    public void entrarPontoDeEbulicao(double temperatura) {
        if (temperatura >= 100) {
            System.out.println("A agua esta em ebulição");
        } else {
            System.out.println("A agua ainda não entrou em ebulição");
        }
    }

    @Override
    public void entrarPontoDeFusao(double temperatura) {
        if (temperatura <= 0) {
            System.out.println("A agua esta em fusão");
        } else {
            System.out.println("A agua ainda não entrou em fusão");
        }
    }
}
