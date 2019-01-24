package com.nexttchnologies.itemManager.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nexttchnologies.itemManager.models.Item;
import com.nexttchnologies.itemManager.services.ItemService;

@RestController
public class ItemController 
{
	@Autowired
	private ItemService itemService;
	
	@RequestMapping(value = "/items", method = RequestMethod.POST)
	public Item createItem(@RequestBody Item item)
	{
		return itemService.createItem(item);
	}
	
	@RequestMapping(value = "/items/{id}", method = RequestMethod.GET)
	//public Item getItem(@RequestParam Long id)
	public Item getItem(@PathVariable Long id)
	{
		Item item = itemService.getItem(id);
		return item;
	}
	
	@RequestMapping(value = "/items", method = RequestMethod.GET)
	public List<Item> getItems()
	{
		List<Item> items = itemService.getItems();
		return items;
	}
	
}
