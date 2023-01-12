package com.budget_tracker.budget_tracker.item.service;

import com.budget_tracker.budget_tracker.item.model.ItemModel;
import com.budget_tracker.budget_tracker.item.model.ItemModelRequest;

public interface ItemService {
  ItemModel createItem(ItemModelRequest request);
}
