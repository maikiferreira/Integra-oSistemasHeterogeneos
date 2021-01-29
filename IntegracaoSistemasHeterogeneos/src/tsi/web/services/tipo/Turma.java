package tsi.web.services.tipo;

import java.util.ArrayList;
import java.util.List;


public class Turma {
	private int id;
	private int ano;
	private String curso;
	private List<Aluno> alunos;
	
	/**
	 * Construtor default da classe.
	 */
	public Turma() {
		alunos = new ArrayList<Aluno>();
	}

	/**
	 * Construtor sobrecarregado da classe.
	 * @param id � um n�mero identificador da turma.
	 * @param ano � o ano da turma.
	 * @param curso � o nome do curso.
	 * @param alunos � um ArrayList contendo os alunos da turma.
	 */
	public Turma(int id, int ano, String curso, List<Aluno> alunos) {
		this.id = id;
		this.ano = ano;
		this.curso = curso;
		this.alunos = alunos;
	}

	/**
	 * Obt�m o valor do id da turma.
	 * @return um int contendo o id da turma.
	 */
	public int getId() {
		return id;
	}

	/**
	 * Altera o valor do id da turma.
	 * @param id � o novo id da turma;
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Obt�m o ano da turma.
	 * @return um int contendo o ano da turma.
	 */
	public int getAno() {
		return ano;
	}

	/**
	 * Altera o valor do ano da turma.
	 * @param ano � o novo ano da turma.
	 */
	public void setAno(int ano) {
		this.ano = ano;
	}

	/**
	 * Obt�m o nome do curso da turma.
	 * @return uma String contendo o nome do curso da turma.
	 */
	public String getCurso() {
		return curso;
	}

	/**
	 * Altera o nome do curso da turma.
	 * @param curso � o novo nome do curso da turma.
	 */
	public void setCurso(String curso) {
		this.curso = curso;
	}

	/**
	 * Obt�m um List<Aluno> contendo todos os alunos da turma.
	 * @return um List<Aluno> contendo todos os alunos da turma.
	 */
	public List<Aluno> getAlunos() {
		return alunos;
	}

	/**
	 * Altera os alunos da turma.
	 * @param alunos � um List<Aluno> contendo os novos alunos da turma.
	 */
	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}

	/**
	 * Obt�m uma String contendo os dados da turma e os dados dos alunos presentes na turma.
	 */
	@Override
	public String toString() {
		return "Id: " + id + "Ano: " + ano + "Curso: " + curso + "Alunos: " + alunos.toString();
	}
	
	/**
	 * Adiciona um aluno no List<Aluno> que cont�m os alunos da turma.
	 * @param aluno � o objeto que cont�m os dados do aluno que ser� cadastrado.
	 */
	public void adicionarAluno(Aluno aluno) {
		alunos.add(aluno);
	}
}
