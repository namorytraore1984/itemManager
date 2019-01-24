package com.nexttchnologies.itemManager.repositories;

import org.springframework.data.repository.CrudRepository;

import com.nexttchnologies.itemManager.models.Item;

public interface ItemRepository extends CrudRepository<Item, Long> {

}
