package br.com.academia.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.academia.model.TrainingModel;

@Repository
@Transactional
public class TrainingDao {
	
	@PersistenceContext
	private EntityManager manager;
	
	public void save(TrainingModel training) {
		manager.persist(training);
	}
}

