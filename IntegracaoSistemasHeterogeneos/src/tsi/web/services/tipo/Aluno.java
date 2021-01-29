package tsi.web.services.tipo;

public class Aluno {
	private int id;
	private String nome;
	private boolean matriculado;
	
	/**
	 * Construtor default da classe.
	 */
	public Aluno() {
	}

	/**
	 * Construtor sobrecarregado da classe.
	 * @param id � o numero identificador do aluno,
	 * @param nome � o nome do aluno.
	 * @param matriculado true se o aluno estiver 
	 * matriculado e false se n�o estiver.
	 */
	public Aluno(int id, String nome, boolean matriculado) {
		this.id = id;
		this.nome = nome;
		this.matriculado = matriculado;
	}

	/**
	 * Obt�m o id do aluno.
	 * @return int contendo o valor do id do aluno.
	 */
	public int getId() {
		return id;
	}

	/**
	 * Altera o valor do id do aluno.
	 * @param id contendo o valor do id do aluno.
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Obt�m o nome do aluno.
	 * @return o nome do aluno.
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * Altera o nome do aluno.
	 * @param nome contendo o novo nome do aluno.
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	/**
	 * Obt�m um valor boolean para verificar se o aluno est� matriculado ou n�o,
	 * caso esteja matatriculado retorna true, caso contrario rertorna false.
	 * @return o valor boolean contendo a situa��o da matricula do aluno.
	 */
	public boolean getMatriculado() {
		return matriculado;
	}

	/**
	 * Altera o valor da situa��o do aluno.
	 * @param matriculado � um boolean contendo a nova situa��o do aluno, podendo ser 
	 * true ou false.
	 */
	public void setMatriculado(boolean matriculado) {
		this.matriculado = matriculado;
	}

	/**
	 * Obt�m os dados dos atributos do objeto Aluno.
	 */
	@Override
	public String toString() {
		return "Id: " + id + "Nome: " + nome + "Matriculado: " + matriculado;
	}
}
