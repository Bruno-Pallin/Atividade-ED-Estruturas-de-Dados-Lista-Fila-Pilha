package exercicio01;

public class Pessoa {
    public String nome;
    public Pessoa proximo;
    public Pessoa anterior;

    Pessoa(String nome) {
        this.nome = nome;
        this.anterior = null;
        this.proximo = null;
    }
}
