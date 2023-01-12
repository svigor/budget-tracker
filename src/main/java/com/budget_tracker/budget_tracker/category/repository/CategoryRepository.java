package com.budget_tracker.budget_tracker.category.repository;

import com.budget_tracker.budget_tracker.category.model.CategoryModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<CategoryModel, String> {

}
