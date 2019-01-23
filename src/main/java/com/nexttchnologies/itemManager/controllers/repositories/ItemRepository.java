package com.nexttchnologies.itemManager.controllers.repositories;

import org.springframework.data.repository.CrudRepository;

import com.nexttchnologies.itemManager.models.Item;

public interface ItemRepository extends CrudRepository<Item, Long> {

}
