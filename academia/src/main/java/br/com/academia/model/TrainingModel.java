package br.com.academia.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "training")
public class TrainingModel {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idTraining;
	private String training;
	private String exercice;
	private String day;
//	private DayWeekEnum day;
//	private TrainingModel training;
//	private ExercisesModel exercice;
	
	public int getIdTraining() {
		return idTraining;
	}
	public void setIdTraining(int idTraining) {
		this.idTraining = idTraining;
	}
//	public DayWeekEnum getDay() {
//		return day;
//	}
//	public void setDay(DayWeekEnum day) {
//		this.day = day;
//	}
//	public TrainingModel getTraining() {
//		return training;
//	}
//	public void setTraining(TrainingModel training) {
//		this.training = training;
//	}
//	public ExercisesModel getExercice() {
//		return exercice;
//	}
//	public void setExercice(ExercisesModel exercice) {
//		this.exercice = exercice;
//	}
	public String getTraining() {
		return training;
	}
	public void setTraining(String training) {
		this.training = training;
	}
	public String getExercice() {
		return exercice;
	}
	public void setExercice(String exercice) {
		this.exercice = exercice;
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	
}
