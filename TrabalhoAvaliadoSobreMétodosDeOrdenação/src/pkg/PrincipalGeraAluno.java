package pkg;

import java.util.ArrayList;
import java.util.Random;

/*A partir dos códigos Java gerados na pasta __aulaPratica, com a classe Aluno, adaptar o código,
gerar 60 mil alunos (nomes aleatóreos e idades aleatóreas entre 18 e 70),
 aplicar os métodos sort, bolha, seleção e inserção nas listas geradas.
  Além disso, garantir que a ordenação seja por chave nome e pela segunda chave idade.
Desejável: código documentado oficialmente, uso de threads e trabalho apresentado em mais de uma linguagem.*/

public class PrincipalGeraAluno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Aluno> lista = new ArrayList<>();
		ArrayList<Aluno> listaBolha = new ArrayList<>();
		ArrayList<Aluno> listaSelecao = new ArrayList<>();
		ArrayList<Aluno> listaInsercao = new ArrayList<>();
        Random gerador = new Random();
        for(int i=0; i<60;i++) {
        	Aluno a = new Aluno(Util.gerarPalavra(10), gerador.nextInt(18,70));
        	lista.add(a);
        }
        
        MetodosOrdenação.bolha(lista, listaBolha);
        MetodosOrdenação.selecao(lista, listaSelecao);
        MetodosOrdenação.insercao(lista, listaInsercao);
        

	}

}
