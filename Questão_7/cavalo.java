package Questão_7;

public class cavalo extends Animal {
    public cavalo(String nome, String especie, int idade) {
        super(nome, especie, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("O cavalo está relinchando.");
    }
    
}
