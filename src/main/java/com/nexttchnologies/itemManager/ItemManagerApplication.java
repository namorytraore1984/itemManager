package com.nexttchnologies.itemManager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@ComponentScan(basePackages = {"com.nexttchnologies.itemManager.*", "com.nexttchnologies.itemManager.servicesTest"})
@SpringBootApplication
public class ItemManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ItemManagerApplication.class, args);
	}

}

