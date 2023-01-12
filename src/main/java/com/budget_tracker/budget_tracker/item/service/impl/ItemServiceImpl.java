package com.budget_tracker.budget_tracker.item.service.impl;

import com.budget_tracker.budget_tracker.item.model.ItemModel;
import com.budget_tracker.budget_tracker.item.model.ItemModelRequest;
import com.budget_tracker.budget_tracker.item.repository.ItemRepository;
import com.budget_tracker.budget_tracker.item.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemServiceImpl implements ItemService {

  @Autowired
  ItemRepository itemRepository;

  @Override
  public ItemModel createItem(ItemModelRequest request) {
    ItemModel item = ItemModel.builder().withCategory(request.getCategory()).build();
    itemRepository.save(item);
    return item;
  }
}
