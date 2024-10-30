package com.javaweb.services;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.javaweb.entity.CategoryEntity;

public interface CategoryService {

	void deleteAll();

	void delete(CategoryEntity entity);

	void deleteById(Integer id);

	long count();

	Optional<CategoryEntity> findById(Integer id);

	List<CategoryEntity> findAllById(Iterable<Integer> ids);

	List<CategoryEntity> findAll();

	Page<CategoryEntity> findAll(Pageable pageable);

	List<CategoryEntity> findAll(Sort sort);

	<S extends CategoryEntity> S save(S entity);

	Page<CategoryEntity> findByCategoryNameContaining(String categoryName, Pageable pageable);

	List<CategoryEntity> findByCategoryNameContaining(String categoryName);

}
