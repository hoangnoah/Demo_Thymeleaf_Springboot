package com.javaweb.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.javaweb.entity.CategoryEntity;

@Repository
public interface CategoryRepository extends JpaRepository<CategoryEntity, Integer>{
	//Tìm kiếm theo nội dung tên
	// Đổi tên phương thức nếu thuộc tính thực sự là 'categoryName'
	List<CategoryEntity> findByCategoryNameContaining(String categoryName);
	//Tìm kiếm và phân trang
	Page<CategoryEntity> findByCategoryNameContaining(String categoryName, Pageable pageable);
}
