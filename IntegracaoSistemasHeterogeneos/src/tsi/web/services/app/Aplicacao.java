package tsi.web.services.app;

import static tsi.web.services.es.EntradaESaida.lerBolean;
import static tsi.web.services.es.EntradaESaida.lerInt;
import static tsi.web.services.es.EntradaESaida.lerString;

import java.io.IOException;
import java.net.UnknownHostException;

import com.google.gson.Gson;

import tsi.web.services.list.TurmasList;
import tsi.web.services.tipo.Aluno;
import tsi.web.services.tipo.Turma;

public class Aplicacao {
	private static TurmasList turmasList;
	public static void main(String[] args) {
		turmasList = new TurmasList();
		menu();
	}
	
	public static void menu() {
		int op;
		do {
			op = lerInt("1- Cadastrar Turma\n"
				      + "2- Cadastrar Aluno\n"
				      + "3- Enviar Dados\n"
				      + "4- Sair", "Menu");
			switch (op) {
			case 1:
				cadastrarTurma();
				break;
			case 2:
				cadastrarAluno();
				break;
			case 3:
				enviarDados();
				break;
			default:
				break;
			}
		}while(op != 4);
	}
	
	public static void cadastrarTurma() {
		Turma turma = new Turma();
		turma.setId(turmasList.getTurmas().size() + 1);
		turma.setCurso(lerString("Insira o nome do curso: ", "Cadastrar Turma"));
		turma.setAno(lerInt("Insira o ano: ", "Cadastrar Curso"));
		turmasList.inserirTurma(turma);
	}
	
	public static void cadastrarAluno() {
		int idTurma = lerInt("Insira o id da turma: ", "Cadastrar Aluno");
		if(turmasList.pesquisarTurma(idTurma) != -1) {
			Aluno aluno = new Aluno();
			aluno.setId(turmasList.gerarIdAluno());
			aluno.setNome(lerString("Insira o nome do aluno: ", "Cadastrar Aluno"));
			aluno.setMatriculado(lerBolean("1- Aluno Matriculado\n2- Aluno não Matriculado", "Cadastrar Aluno"));
			turmasList.adicionarAluno(idTurma, aluno);
		}
	}
	
	public static void enviarDados() {
		NodeJsEcho nodeJsEcho = new NodeJsEcho();
		try {
			for (int i = 0; i < turmasList.getTurmas().size(); i++) {
				Gson gson = new Gson();
				String json = gson.toJson(turmasList.getTurmas().get(i));
				nodeJsEcho.enviar(json);
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
