/*
    Na estrutura de dados que você implementou, é possível que uma pilha esteja cheia e a outra não?
    Não é possivel, pois como usam o mesmo vetor, sempre que houver posições disponiveis, o sistema irá preencher com essas posições, seja pra cima ou pra baixo
 */
package exercicio03;

public class Pilha {


    private int dados[];
    private int tamanho;
    private int tamanhoA;
    private int tamanhoB;


    public Pilha(int capacidade) {
        dados = new int[capacidade];
        tamanho = 0;
        tamanhoA = capacidade - 1;
        tamanhoB = 0;
    }


    public boolean vaziaA() {
        return tamanhoA == 0;
    }


    public boolean vaziaB() {
        return tamanhoB == dados.length;
    }


    public boolean cheiaB() {
        return tamanho == dados.length;
    }


    public boolean cheiaA() {
        return tamanhoA == -1 || tamanho == dados.length;
    }


    public void empilhaB(int e) {
        //verifica se a lista está cheia
        if (cheiaA()) {
        //mostra erro
            System.out.println("Empilha B - Lista Cheia!");
        } else {
            //guarda no próximo índice disponível
            dados[tamanhoB] = e;
            System.out.println("Empilhando B - Item: " + e + " Posição: " + tamanhoB);
            //incrementa o tamanho
            tamanhoB++;
            tamanho++;
        }
    }


    public void empilhaA(int e) {
        //verifica se a lista está cheia
        if (cheiaB()) {
            //mostra erro
            System.out.println("Empilha A - Lista Cheia!");
        } else {
            //guarda no próximo índice disponível
            dados[tamanhoA] = e;
            System.out.println("Empilhando A - Item: " + e + " Posição: " + tamanhoA);
            //incrementa o tamanho
            tamanhoA--;
            tamanho++;
        }
    }


    public int desempilhaB() {
        int resp = -1;
        if (vaziaB()) {
            System.out.println("Pilha B - Vazia!");
        } else {
            resp = dados[tamanhoB - 1];
            System.out.println("Desempilhando item: " + resp + " Posição: " + (tamanhoB - 1));
            tamanhoB--;
            tamanho--;
        }


        return resp;
    }


    public int desempilhaA() {
        int resp = -1;
        if (vaziaA()) {
            System.out.println("Pilha A - Vazia!");
            return -1;
        } else {
            resp = dados[tamanhoA + 1];
            System.out.println("Desempilhando item: " + resp + " Posição: " + (tamanhoA));
            tamanhoA++;
            tamanho--;
        }


        return resp;
    }


    public String mostrarPilhaB() {
        String resp = "Elementos:\n";
        for (int i = 0; i <= tamanhoB - 1; i++) {
            resp = resp + " " + dados[i];
        }
        return resp;
    }


    public String mostrarPilhaA() {
        String resp = "Elementos:\n";
        for (int i = dados.length - 1; i > tamanhoA; i--) {
            resp = resp + " " + dados[i];
        }
        return resp;
    }


    public int topoB() {
        if (vaziaB()) {
            return 0;
        }
        return dados[tamanhoA - 1];
    }


    public int topoA() {
        if (vaziaA()) {
            return 0;
        }
        return dados[tamanhoA];
    }


    public int tamanhoB() {
        if (vaziaB()) {
            System.out.println("Pilha A - Vazia!");
            return 0;
        }
        return tamanhoB;
    }


    public int tamanhoA() {
        if (vaziaA()) {
            return 0;
        }
        return dados.length - tamanhoA - 1;
    }
}