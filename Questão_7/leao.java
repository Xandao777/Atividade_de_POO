package Questão_7;

public class leao extends Animal {
    public leao(String nome, String especie, int idade) {
        super(nome, especie, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("O leão está rugindo.");
    }
    
}
