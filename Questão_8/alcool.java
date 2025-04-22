package Questão_8;

public class alcool extends SubstanciaPura {
    @Override
    public void entrarPontoDeEbulicao(double temperatura) {
        if (temperatura >= 78.4) {
            System.out.println("O alcool esta em ebulição");
        } else {
            System.out.println("O alcool ainda não entrou em ebulição");
        }
    }

    @Override
    public void entrarPontoDeFusao(double temperatura) {
        if (temperatura <= 0) {
            System.out.println("O alcool esta em fusão");
        } else {
            System.out.println("O alcool ainda não entrou em fusão");
        }
    }
}

