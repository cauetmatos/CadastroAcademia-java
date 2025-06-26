package dobackaofront.model;

import java.util.ArrayList;

public class Academia {
	private String nome;
	private String localizacao;
	private String whatsapp;
	private String instagram;
	
	private ArrayList<Personal> personals;
	private ArrayList<Aluno> alunos;
	private ArrayList<Exercicios> exercicio;
	private ArrayList<Ficha> fichas;
	

	public Academia(String nome) {
		
		this.nome = nome;
		this.localizacao = " ";
		this.whatsapp = " ";
		this.instagram = " ";
		this.personals = new ArrayList<>();
		this.alunos = new ArrayList<>();
		this.exercicio = new ArrayList<>();
		this.fichas = new ArrayList<>();
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getLocalizacao() {
		return localizacao;
	}


	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}


	public String getWhatsapp() {
		return whatsapp;
	}


	public void setWhatsapp(String whatsapp) {
		this.whatsapp = whatsapp;
	}


	public String getInstagram() {
		return instagram;
	}


	public void setInstagram(String instagram) {
		this.instagram = instagram;
	}


	public ArrayList<Personal> getPersonals() {
		return personals;
	}


	public void setPersonals(ArrayList<Personal> personals) {
		this.personals = personals;
	}


	public ArrayList<Aluno> getAlunos() {
		return alunos;
	}


	public void setAlunos(ArrayList<Aluno> alunos) {
		this.alunos = alunos;
	}


	public ArrayList<Exercicios> getExercicio() {
		return exercicio;
	}


	public void setExercicio(ArrayList<Exercicios> exercicio) {
		this.exercicio = exercicio;
	}


	public ArrayList<Ficha> getFichas() {
		return fichas;
	}


	public void setFichas(ArrayList<Ficha> fichas) {
		this.fichas = fichas;
	}

	public void addAluno(Aluno aluno) {
		alunos.add(aluno);
	}
	
	public void addExercicios(Exercicios exercicios) {
		exercicio.add(exercicios);
	}
	
	public void addPersonal(Personal personal) {
		personals.add(personal);
	}
	public void addFicha(Ficha ficha) {
		fichas.add(ficha);
	}
	public void removerAluno(Aluno aluno) {
		alunos.remove(aluno);
	}
	public void removerExercicios(Exercicios exercicios) {
		exercicio.remove(exercicios);
	}
	public void removerFicha(Ficha ficha) {
		fichas.remove(ficha);
	}
	public void removerPersonal(Personal personal) {
		personals.remove(personal);
	}


	@Override
	public String toString() {
		return "Academia [nome=" + nome + ", localizacao=" + localizacao + ", whatsapp=" + whatsapp + ", instagram="
				+ instagram + ", personals=" + personals + ", alunos=" + alunos + ", exercicio=" + exercicio
				+ ", fichas=" + fichas + "]";
	}
	
	
	
}
