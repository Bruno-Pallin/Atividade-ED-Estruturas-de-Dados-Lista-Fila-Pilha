package exercicio01;

import javax.swing.*;
import java.sql.PseudoColumnUsage;

public class Main {
    public static void main(String[] args) {
        String[] listaNomes = new String[]{"Luan","Pedro","Caio", "Mariana", "Lígia", "Rafaela", "Andrei", "Zurelia", "Ana", "Adriana", "Bruno", "Breno"};

        PessoaArray pessoaArray = new PessoaArray();

        Pessoa pessoa = new Pessoa("Bruno");
        Pessoa pessoa1 = new Pessoa("Breno");
        Pessoa pessoa2 = new Pessoa("Brano");

        pessoaArray.adicionarPessoa(pessoa);
        pessoaArray.adicionarPessoa(pessoa1);
        pessoaArray.adicionarPessoa(pessoa2);

        System.out.println("asd");
    }
}
