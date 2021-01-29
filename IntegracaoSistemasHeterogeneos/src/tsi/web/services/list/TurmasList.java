package tsi.web.services.list;

import java.util.ArrayList;
import java.util.List;

import tsi.web.services.tipo.Aluno;
import tsi.web.services.tipo.Turma;

public class TurmasList {
	private List<Turma> turmas;

	/**
	 * Construtor default da classe.
	 */
	public TurmasList() {
		turmas = new ArrayList<Turma>();
	}

	/**
	 * Construtor sobrecarregado da classe.
	 * @param turmas é um List<Turma> que contém os objetos 
	 * Turma com que o array sera inicializado.
	 */
	public TurmasList(List<Turma> turmas) {
		this.turmas = turmas;
	}

	/**
	 * Obtém um List<Turma> contém todas as turmas.
	 * @return um List<Turma> contendo as turmas.
	 */
	public List<Turma> getTurmas() {
		return turmas;
	}

	/**
	 * Altera os objetos Turma presente no ArrayList.
	 * @param turmas é um List<Turma> contendo as novas
	 * turmas que serao adicionadas ao List.
	 */
	public void setTurmas(List<Turma> turmas) {
		this.turmas = turmas;
	}

	/**
	 * Obtém uma String contendo os dados dos objetos Turma presentes no List<Turma>.
	 */
	@Override
	public String toString() {
		return "Turmas: " + turmas;
	}
	
	public void inserirTurma(Turma turma) {
		turmas.add(turma);
	}
	
	public int pesquisarTurma(int id) {
		for (int i = 0; i < turmas.size(); i++) 
			if(id == turmas.get(i).getId())
				return turmas.get(i).getId();
		return -1;
	}
	
	public void adicionarAluno(int id, Aluno aluno) {
		for (int i = 0; i < turmas.size(); i++) 
			if(id == turmas.get(i).getId())
				turmas.get(i).adicionarAluno(aluno);
	}
	
	public int gerarIdAluno() {
		int qtd = 0;
		for (int i = 0; i < turmas.size(); i++) 
			qtd += turmas.get(i).getAlunos().size();
		
		return qtd + 1;
	}
}
