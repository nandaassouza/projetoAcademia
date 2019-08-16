package br.com.academia.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.academia.model.CategoryModel;

@Repository
@Transactional
public class CategoryDao {
	
	@PersistenceContext
	private EntityManager manager;
	
	public void save(CategoryModel category) {
		manager.persist(category);
	}
}

