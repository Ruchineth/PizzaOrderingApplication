package com.ruchineth.ProcessingService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.ruchineth.ProcessingService.model.PizzaOrder;
import com.ruchineth.ProcessingService.model.PizzaOrderList;
import com.ruchineth.ProcessingService.service.PizzaProcessService;

@RestController
public class PizzaProcessController {
	@Autowired
	PizzaProcessService pizzaProcessService;
	
	@RequestMapping(value="order", method=RequestMethod.GET)
	public ResponseEntity<List<PizzaOrder>> fetchAllPizzaOrder() {
		RestTemplate restTemplate = new RestTemplate();
		PizzaOrderList response = restTemplate.getForObject(
				  "http://localhost:8191/order",
				  PizzaOrderList.class);
		List<PizzaOrder> pizzaOrders = response.getPizzaOrders();
		
		List<PizzaOrder> pizzaProcessOrders = pizzaProcessService.process(pizzaOrders);
		if(pizzaProcessOrders == null) {
			return ResponseEntity.notFound().build();
		} else {
			return ResponseEntity.ok().body(pizzaProcessOrders);
		}
	}

}
