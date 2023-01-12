package com.budget_tracker.budget_tracker.category.model;

import java.util.List;

public class CatergoryListResponse {
  private List<CategoryModel> list;

  public List<CategoryModel> getList() {
    return list;
  }

  public void setList(List<CategoryModel> list) {
    this.list = list;
  }
}
