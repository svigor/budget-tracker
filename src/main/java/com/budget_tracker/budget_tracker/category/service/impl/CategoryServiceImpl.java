package com.budget_tracker.budget_tracker.category.service.impl;

import com.budget_tracker.budget_tracker.category.model.CategoryModel;
import com.budget_tracker.budget_tracker.category.model.CategoryModel.CategoryModelBuilder;
import com.budget_tracker.budget_tracker.category.model.CategoryModelRequest;
import com.budget_tracker.budget_tracker.category.model.CatergoryListResponse;
import com.budget_tracker.budget_tracker.category.repository.CategoryRepository;
import com.budget_tracker.budget_tracker.category.service.CategoryService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl implements CategoryService {

  @Autowired
  private CategoryRepository categoryRepository;

  @Override
  public CatergoryListResponse getCategories() {
    CatergoryListResponse catergoryListResponse = new CatergoryListResponse();
    List<CategoryModel> categoryModelList = categoryRepository.findAll();
    catergoryListResponse.setList(categoryModelList);
    return catergoryListResponse;
  }

  @Override
  public CategoryModel createCategory(CategoryModelRequest request) {
    CategoryModel categoryModel = CategoryModel.builder().withName(request.getName()).build();
    categoryRepository.save(categoryModel);
    return categoryModel;
  }
}
