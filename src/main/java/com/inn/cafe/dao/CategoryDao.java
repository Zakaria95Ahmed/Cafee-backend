package com.inn.cafe.dao;

import com.inn.cafe.Model.Pojo.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface CategoryDao extends JpaRepository<Category, Integer> {
    List<Category> getAllCategory();


}
