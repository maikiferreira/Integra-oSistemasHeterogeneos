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
	 * @param id é um número identificador da turma.
	 * @param ano é o ano da turma.
	 * @param curso é o nome do curso.
	 * @param alunos é um ArrayList contendo os alunos da turma.
	 */
	public Turma(int id, int ano, String curso, List<Aluno> alunos) {
		this.id = id;
		this.ano = ano;
		this.curso = curso;
		this.alunos = alunos;
	}

	/**
	 * Obtém o valor do id da turma.
	 * @return um int contendo o id da turma.
	 */
	public int getId() {
		return id;
	}

	/**
	 * Altera o valor do id da turma.
	 * @param id é o novo id da turma;
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Obtém o ano da turma.
	 * @return um int contendo o ano da turma.
	 */
	public int getAno() {
		return ano;
	}

	/**
	 * Altera o valor do ano da turma.
	 * @param ano é o novo ano da turma.
	 */
	public void setAno(int ano) {
		this.ano = ano;
	}

	/**
	 * Obtém o nome do curso da turma.
	 * @return uma String contendo o nome do curso da turma.
	 */
	public String getCurso() {
		return curso;
	}

	/**
	 * Altera o nome do curso da turma.
	 * @param curso é o novo nome do curso da turma.
	 */
	public void setCurso(String curso) {
		this.curso = curso;
	}

	/**
	 * Obtém um List<Aluno> contendo todos os alunos da turma.
	 * @return um List<Aluno> contendo todos os alunos da turma.
	 */
	public List<Aluno> getAlunos() {
		return alunos;
	}

	/**
	 * Altera os alunos da turma.
	 * @param alunos é um List<Aluno> contendo os novos alunos da turma.
	 */
	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}

	/**
	 * Obtém uma String contendo os dados da turma e os dados dos alunos presentes na turma.
	 */
	@Override
	public String toString() {
		return "Id: " + id + "Ano: " + ano + "Curso: " + curso + "Alunos: " + alunos.toString();
	}
	
	/**
	 * Adiciona um aluno no List<Aluno> que contém os alunos da turma.
	 * @param aluno é o objeto que contém os dados do aluno que será cadastrado.
	 */
	public void adicionarAluno(Aluno aluno) {
		alunos.add(aluno);
	}
}
