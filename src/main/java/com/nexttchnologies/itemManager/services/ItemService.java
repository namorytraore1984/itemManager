package com.nexttchnologies.itemManager.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nexttchnologies.itemManager.models.Item;
import com.nexttchnologies.itemManager.repositories.ItemRepository;

@Service
public class ItemService {

	@Autowired
	private ItemRepository itemRepo;
	
	public Item createItem(Item item)
	{
		Item createdItem = itemRepo.save(item);
		return createdItem;
	}
	
	public List<Item> getItems()
	{
		List<Item> items = new ArrayList<Item>();
		Iterable<Item> itemsFromDB = itemRepo.findAll();
		itemsFromDB.forEach(items::add);
		//itemsFromDB.forEach(i -> items.add(i));
		return items;
	}
	
	public Item getItem(Long id)
	{
		Optional<Item> itemOpt = itemRepo.findById(id);
		if ( itemOpt.isPresent() )
		{
			return itemOpt.get();
		}
		return null;
	}
}
