package dobackaofront.model;
import java.util.ArrayList;
public class DTO {

		private ArrayList<Exercicios> exercicio;
	
	public DTO() {
		
		exercicio = new ArrayList<>();
		
		
		
		Exercicios exercicios1 = new Exercicios();
		exercicio.add(exercicios1);
		
		Exercicios exercicios2 = new Exercicios();
		exercicio.add(exercicios2);
		
		Exercicios exercicios3 = new Exercicios();
		exercicio.add(exercicios3);
		
		Exercicios exercicios4 = new Exercicios();
		exercicio.add(exercicios4);
		
		Exercicios exercicios5 = new Exercicios();
		exercicio.add(exercicios5);
	
		
	}
		public ArrayList<Exercicios> getExercicio(){
			return exercicio;
		}
	
}
