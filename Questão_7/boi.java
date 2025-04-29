package Questão_7;

public class boi extends Animal {
    public boi(String nome, String especie, int idade) {
        super(nome, especie, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("O boi está mugindo");
    }
    
}
