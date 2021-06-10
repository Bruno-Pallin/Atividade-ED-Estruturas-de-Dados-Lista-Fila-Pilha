/*
    Na estrutura de dados que você implementou, é possível que uma pilha esteja cheia e a outra não?
    Não é possivel, pois como usam o mesmo vetor, sempre que houver posições disponiveis, o sistema irá preencher com essas posições, seja pra cima ou pra baixo
 */
package PilhaPkg;

public class Pilha {

    private int dados[];
    private int tamanho;
    private int tamanhoA;
    private int tamanhoB;

    public Pilha(int capacidade) {
        dados = new int[capacidade];
        tamanho = 0;
        tamanhoA = 0;
        tamanhoB = capacidade - 1;

    }

    public boolean vaziaA() {
        return tamanhoA == 0;

    }

    public boolean vaziaB() {
        return tamanhoB == dados.length;
    }

    public boolean cheiaA() {
        return tamanho == dados.length;
    }

    public boolean cheiaB() {
        return tamanhoB == -1 || tamanho == dados.length;
    }

    public void empilhaA(int e) {
        //verifica se a lista está cheia
        if (cheiaA()) {
            //mostra erro
            System.out.println("Empilha A - Lista Cheia!");
        } else {
            //guarda no próximo índice disponível
            dados[tamanhoA] = e;
            System.out.println("Empilhando A - Item: " + e + " Posição: " + tamanhoA);
            //incrementa o tamanho
            tamanhoA++;
            tamanho++;
        }
    }

    public void empilhaB(int e) {
        //verifica se a lista está cheia
        if (cheiaB()) {
            //mostra erro
            System.out.println("Empilha B - Lista Cheia!");
        } else {
            //guarda no próximo índice disponível
            dados[tamanhoB] = e;
            System.out.println("Empilhando B - Item: " + e + " Posição: " + tamanhoB);
            //incrementa o tamanho
            tamanhoB--;
            tamanho++;
        }
    }

    public int desempilhaA() {
        int resp = -1;
        if (vaziaA()) {
            System.out.println("Pilha A - Vazia!");
        } else {
            resp = dados[tamanhoA - 1];
            System.out.println("Desempilhando item: " + resp + " Posição: " + (tamanhoA - 1));
            tamanhoA--;
            tamanho--;
        }

        return resp;
    }

    public int desempilhaB() {
        int resp = -1;
        if (vaziaB()) {
            System.out.println("Pilha A - Vazia!");
            return -1;
        } else {
            resp = dados[tamanhoB+1];
            System.out.println("Desempilhando item: " + resp + " Posição: " + (tamanhoB));
            tamanhoB++;
            tamanho--;
        }

        return resp;
    }

    public String mostrarPilhaA() {
        String resp = "Elementos:\n";
        for (int i = 0; i <= tamanhoA - 1; i++) {
            resp = resp + "  " + dados[i];
        }
        return resp;
    }

    public String mostrarPilhaB() {
        String resp = "Elementos:\n";
        for (int i = dados.length - 1; i > tamanhoB; i--) {
            resp = resp + "  " + dados[i];
        }
        return resp;
    }

    public int topoA() {
        if (vaziaA()) {
            System.out.println("ERRO!");
            return 0;
        }
        return dados[tamanhoA - 1];
    }

    public int topoB() {
        if (vaziaB()) {
            System.out.println("ERRO!");
            return 0;
        }
        return dados[tamanhoB];
    }

    public int tamanhoA() {
        if (vaziaB()) {
            System.out.println("Pilha A - Vazia!");
            return 0;
        }
        return tamanhoA;
    }

    public int tamanhoB() {
        if (vaziaB()) {
            System.out.println("Pilha B - Vazia!");
            return 0;
        }
        return dados.length-tamanhoB-1;
    }

}
