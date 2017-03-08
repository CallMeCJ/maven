package com.cjzheng.maven.dao;

import java.io.Serializable;
import java.util.List;

/**
 * 
 * @Description: TODO
 * @author: zhengchaojie
 * @date 2017年3月8日 上午9:42:58
 * 
 * @param <T>
 * @param <PK>
 */

public interface GenericDao<T, PK extends Serializable> {

	T load(PK id);

	T get(PK id);

	List<T> findAll();

	void persist(T entity);

	PK save(T entity);

	void saveOrUpdate(T entity);

	void delete(PK id);

	void flush();
}