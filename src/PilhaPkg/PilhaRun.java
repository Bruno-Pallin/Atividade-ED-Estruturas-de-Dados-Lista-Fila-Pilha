/*
Respondendo a pergunta:
Não é possivel, pois como usam o mesmo vetor, sempre que houver posições disponiveis, o sistema irá preencher com essas posições, seja pra cima ou pra veixo
 */

package PilhaPkg;

public class PilhaRun {
    
    public static void main(String[]args){
        
        System.out.println("Teste 2");
        Pilha pilha = new Pilha(10);
        pilha.empilhaA(10);
        pilha.empilhaA(20);
        pilha.empilhaA(30);
        pilha.empilhaB(40);
        pilha.empilhaB(50);
        pilha.empilhaB(60);
        pilha.empilhaB(70);
        pilha.empilhaB(80);
        pilha.empilhaB(90);
        pilha.empilhaB(100);
        System.out.println("Topo A: "+pilha.topoA());
        System.out.println("Topo B: "+pilha.topoB());
        System.out.println("Tamanho A: "+pilha.tamanhoA());
        System.out.println("Tamanho B: "+pilha.tamanhoB());
        
        System.out.println("Pilha A: "+pilha.mostrarPilhaA());
        System.out.println("Pilha B: "+pilha.mostrarPilhaB());
        

    }
    
}
