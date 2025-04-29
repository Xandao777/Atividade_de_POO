package Questão_7;

public class cachorro extends Animal {
    public cachorro(String nome, String especie, int idade) {
        super(nome, especie, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("O cachorro está latindo");
    }
    
}
