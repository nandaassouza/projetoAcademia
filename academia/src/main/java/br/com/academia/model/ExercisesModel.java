package br.com.academia.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "exercices")
public class ExercisesModel {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idExercises;
	private String name;
	private String description;
	private String category;
//	private CategoryModel category;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getIdExercises() {
		return idExercises;
	}
	public void setIdExercises(int idExercises) {
		this.idExercises = idExercises;
	}
//	public CategoryModel getCategory() {
//		return category;
//	}
//	public void setCategory(CategoryModel category) {
//		this.category = category;
//	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
}
