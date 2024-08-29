package pkg;


/*A partir dos códigos Java gerados na pasta __aulaPratica, com a classe Aluno, adaptar o código,
gerar 60 mil alunos (nomes aleatóreos e idades aleatóreas entre 18 e 70),
 aplicar os métodos sort, bolha, seleção e inserção nas listas geradas.
  Além disso, garantir que a ordenação seja por chave nome e pela segunda chave idade.
Desejável: código documentado oficialmente, uso de threads e trabalho apresentado em mais de uma linguagem.*/

/**
 * 
 * @author laboratorio
 *
 * classe para formar o aluno
 */
public class Aluno {
	protected String nome;
	protected int idade;

	/**
	 * Construtor da classe
	 * @param nome
	 * @param idade
	 */
	public Aluno(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}

	/**
	 * getters e setter
	 * @return
	 */
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", idade=" + idade + "]";
	}

}
