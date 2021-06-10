package exercicio02;

public class Main {

	public static void main(String[] args) {
		Fila fila = new Fila();
		fila.adiciona("Fernando");
		fila.adiciona("Mauricio");

		System.out.println("Segue a lista \n"+fila);
		
		//System.out.println("A lista está vazia?\n"+fila.filaVazia());
		
		//System.out.println("O item que procuro está na lista?\n"+fila.pesquida(1));
		
		//System.out.println("Qual o tamanho da fila?\n"+fila.tamanho());
		
		//System.out.println("Quem é o primeiro a sair da fila?\n"+fila.removerCabeca());
		
		//System.out.println("Qual é o ultimo elemento da fila que foi removido\n"+fila.removerCauda(fila.tamanho()-1));
		
		//System.out.println(fila.pegaPrimeiro());
		
		//System.out.println(fila.pegaUltimo(fila.tamanho()-1));
	}

}
