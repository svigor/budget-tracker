package com.budget_tracker.budget_tracker.item.model;

import com.budget_tracker.budget_tracker.category.model.CategoryModel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ItemModelRequest {
  private String name;
  private CategoryModel category;
}
