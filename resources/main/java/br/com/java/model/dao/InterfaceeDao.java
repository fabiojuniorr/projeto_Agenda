package br.com.java.model.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.criterion.DetachedCriteria;

public interface InterfaceeDao<T> {

	void save(T entity);

	void update(T entity);

	void remove(T entity);

	void meger(T entity);

	T getEntity(Serializable id);

	T getEntitybyDetachadcriteria(DetachedCriteria criteria);

	List<T> getEntities();

	List<T> getListbyDetachadCriteria(DetachedCriteria criteria);

}
