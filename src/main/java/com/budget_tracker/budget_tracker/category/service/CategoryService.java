package com.budget_tracker.budget_tracker.category.service;

import com.budget_tracker.budget_tracker.category.model.CategoryModel;
import com.budget_tracker.budget_tracker.category.model.CategoryModelRequest;
import com.budget_tracker.budget_tracker.category.model.CatergoryListResponse;

public interface CategoryService {
  CatergoryListResponse getCategories();
  CategoryModel createCategory(CategoryModelRequest request);
}
