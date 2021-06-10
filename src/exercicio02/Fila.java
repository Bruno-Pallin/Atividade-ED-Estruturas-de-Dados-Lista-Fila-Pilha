package exercicio02;

import java.util.LinkedList;
import java.util.List;

public class Fila {
	
	private List<String> alunos = new LinkedList<String>();
	//Adicionando elementos a fila
	public void adiciona(String aluno) {
		alunos.add(aluno);		
	}
	//Metodo para imprimir a fila
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return alunos.toString();
	}
	//Metodo para remover o primeiro da fila
	public String removerCabeca() {
		return alunos.remove(0);
	}
	//Metodo Remover o ultimo da fila
	public String removerCauda(int i) {
		return alunos.remove(i);
	}
	//Metodo para ver o tamanho da fila
	public int tamanho() {
		return alunos.size();
	}
	//Metodo para verificar se a fila está vazia ou contem itens
	public boolean filaVazia() {
		if(alunos.size() == 0) {
			return true;
		}else {
			return false;
		}
	}
	//Metodo para ver se a posição existe na fila.
	public boolean pesquida(int num) {
		if(num > alunos.size()) {
			return false;
		}
		for (int i = 0; i< alunos.size();i++) {
			if(i == num) {
				return true;
			}
		}
		return false;
	}
	//Pegar o primeiro elemento da fila
	public String pegaPrimeiro() {
		return alunos.get(0);
	}
	
	//Pegar o ultimo elemento da fila
	public String pegaUltimo(int i) {
		return alunos.get(i);
	}
	
}
