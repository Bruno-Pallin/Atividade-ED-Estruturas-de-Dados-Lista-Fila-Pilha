package exercicio01;

public class PessoaArray {
    public PessoaList[] vetorListasDuplas = new PessoaList[25];

    PessoaArray() {
    }

    public void adicionarPessoa(Pessoa pessoa) {
        int indice = indice(pessoa.nome);

        if (this.vetorListasDuplas[indice] == null) {
            PessoaList pessoaList = new PessoaList();
            pessoaList.adicionaInicio(pessoa);
            this.vetorListasDuplas[indice] = pessoaList;
        } else {
            PessoaList auxiliar = this.vetorListasDuplas[indice];
            while (auxiliar.fim != null) {
                if (auxiliar.inicio == null) {

                    int x = auxiliar.inicio.nome.compareTo(pessoa.nome);
                    if (x >= 0) {
                        auxiliar.adicionaInicio(pessoa);
                    }

                    auxiliar.inicio = auxiliar.fim;
                }
            }

        }
    }

    public static int indice(String nome) {
        char[] vetorIndice = new char[]{'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N',
                'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

        char inicial = nome.charAt(0);

        for (int i = 0; i < vetorIndice.length; i++) {
            if (inicial == vetorIndice[i]) {
                return i;
            }
        }
        return 404;
    }
}
