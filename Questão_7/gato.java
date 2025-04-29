package Questão_7;

public class gato extends Animal {
    public gato(String nome, String especie, int idade) {
        super(nome, especie, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("O gato está miando");
    }
} 
    

