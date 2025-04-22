package Questão_8;

public class amonia extends SubstanciaPura {
    @Override
    public void entrarPontoDeEbulicao(double temperatura) {
        if (temperatura >= -33.34) {
            System.out.println("A amonia esta em ebulição");
        } else {
            System.out.println("A amonia ainda não entrou em ebulição");
        }
    }

    @Override
    public void entrarPontoDeFusao(double temperatura) {
        if (temperatura <= -77.73) {
            System.out.println("A amonia esta em fusão");
        } else {
            System.out.println("A amonia ainda não entrou em fusão");
        }
    }
}
