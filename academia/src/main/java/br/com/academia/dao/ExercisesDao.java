package br.com.academia.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.academia.model.ExercisesModel;

@Repository
@Transactional
public class ExercisesDao {
	
	@PersistenceContext
	private EntityManager manager;
	
	public void save(ExercisesModel exercises) {
		manager.persist(exercises);
	}
}

