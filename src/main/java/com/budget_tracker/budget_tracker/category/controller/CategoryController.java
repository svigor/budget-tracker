package com.budget_tracker.budget_tracker.category.controller;

import com.budget_tracker.budget_tracker.category.model.CategoryModel;
import com.budget_tracker.budget_tracker.category.model.CategoryModelRequest;
import com.budget_tracker.budget_tracker.category.model.CatergoryListResponse;
import com.budget_tracker.budget_tracker.category.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/category")
public class CategoryController {

  private final CategoryService categoryService;
  @Autowired
  public CategoryController(CategoryService categoryService) {
    this.categoryService = categoryService;
  }

  @GetMapping("/all")
  public CatergoryListResponse getAllCategories() {
    return categoryService.getCategories();
  }

  @ResponseBody
  @PostMapping("/create")
  public CategoryModel createCategory(@RequestBody CategoryModelRequest category) {
    return categoryService.createCategory(category);
  }
}
