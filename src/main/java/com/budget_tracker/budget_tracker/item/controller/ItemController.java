package com.budget_tracker.budget_tracker.item.controller;

import com.budget_tracker.budget_tracker.item.model.ItemModel;
import com.budget_tracker.budget_tracker.item.model.ItemModelRequest;
import com.budget_tracker.budget_tracker.item.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/item")
public class ItemController {
  @Autowired
  ItemService itemService;

  @PostMapping
  @ResponseBody
  ItemModel createItem(@RequestBody ItemModelRequest request) {
    return itemService.createItem(request);
  }
}
