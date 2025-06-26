package dobackaofront.model;

import java.util.ArrayList;


public class Ficha {
	private Aluno aluno;
	private Personal personal;
	private ArrayList<Exercicios> exercicios; //Lista de coleçao de exercicios
	private String dataFim;	//a partir de hoje ate o final do mes
	
	
	public Ficha(Aluno aluno, Personal personal, ArrayList<Exercicios> exercicios, String dataFim) {
		
		this.aluno = aluno;
		this.personal = personal;
		this.exercicios = new ArrayList<>();
		this.dataFim = dataFim;
	}

	public Ficha(Aluno aluno) {
		this.aluno = aluno;
		this.personal = null;
		this.exercicios = new ArrayList<>();
		this.dataFim = "";
		
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public Personal getPersonal() {
		return personal;
	}

	public void setPersonal(Personal personal) {
		this.personal = personal;
	}

	public ArrayList<Exercicios> getExercicios() {
		return exercicios;
	}

	public void setExercicios(ArrayList<Exercicios> exercicios) {
		this.exercicios = exercicios;
	}

	public String getDataFim() {
		return dataFim;
	}

	public void setDataFim(String dataFim) {
		this.dataFim = dataFim;
	}
	
	public void adicionar(Exercicios exercicio) {
		
		exercicios.add(exercicio);
		
	}

	public void removerExercicio(Exercicios exercicio) {
		
		exercicios.remove(exercicio);
	}
	
}