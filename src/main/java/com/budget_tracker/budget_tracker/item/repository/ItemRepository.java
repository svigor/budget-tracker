package com.budget_tracker.budget_tracker.item.repository;

import com.budget_tracker.budget_tracker.item.model.ItemModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends JpaRepository<ItemModel, String> {

}
