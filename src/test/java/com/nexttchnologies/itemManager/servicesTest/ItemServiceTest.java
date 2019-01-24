package com.nexttchnologies.itemManager.servicesTest;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.nexttchnologies.itemManager.models.Item;
import com.nexttchnologies.itemManager.repositories.ItemRepository;
import com.nexttchnologies.itemManager.services.ItemService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ItemServiceTest 
{
	@Autowired
	ItemService itemService;
	@Autowired
	ItemRepository itemRepo;
	
	@Test
	public void createItemTest() 
	{
		Item item = new Item();
		item.setItemCode("PHONE");
			
	    item.setItemType("devise");
	    item.setName("phone");
	    item.setLabel("phone");
	    item.setDescription("phone description");
	    item.setStartDate(LocalDate.now());
	    
	    item.setEndDate(null);
	    item.setStatus("ACT");
	    item.setOwnerId("1");
	    item.setUpdatedBy(null);
	    item.setUpdatedOn(null);
	    item.setCreatedBy("admin");
	    item.setCreatedOn(LocalDate.now());
	
		
		itemService.createItem(item);
		
		Optional<Item> createdItemOpt = itemRepo.findById(item.getId());
		assertTrue(createdItemOpt.isPresent());
		assertEquals("PHONE", createdItemOpt.get().getItemCode());
		assertEquals("admin", createdItemOpt.get().getCreatedBy());
	}

}
