package exercicio01;

public class PessoaList {
    public Pessoa inicio, fim;

    public PessoaList(){
        inicio = null;
        fim = null;
    }

    public void adicionaInicio (Pessoa pessoa){
        if (inicio == null){
            inicio = pessoa;
        } else {
            Pessoa novo = pessoa;
            inicio.anterior = novo;
            novo.proximo = inicio;
            inicio = novo;
        }
    }

    public void adicionaFinal (String nome){
        if (inicio == null){
            inicio = new Pessoa(nome);
            fim = inicio;
        } else {
            Pessoa novo = new Pessoa(nome);
            novo.anterior = fim;
            fim.proximo = novo;
            fim = novo;
        }
    }

    public String removeInicio (){
        String r = "";
        if (inicio == null){
            System.out.println("ERRO! Lista Vazia");
        } else {
            if (inicio == fim){
                r = inicio.nome;
                inicio = null;
                fim = null;
            } else {
                r = inicio.nome;
                inicio = inicio.proximo;
                inicio.anterior = null;
            }

        }
        return r;
    }
}
