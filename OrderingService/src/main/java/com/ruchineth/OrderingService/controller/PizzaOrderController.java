package com.ruchineth.OrderingService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ruchineth.OrderingService.model.PizzaOrder;
import com.ruchineth.OrderingService.service.PizzaOrderService;

@RestController
public class PizzaOrderController {
	
	@Autowired
	PizzaOrderService pizzaOrderService;
	
	@RequestMapping(value="order", method=RequestMethod.POST)
	public PizzaOrder save(@RequestBody PizzaOrder order) {
		return pizzaOrderService.save(order);
	}
	
	@RequestMapping(value="order", method=RequestMethod.GET)
	public ResponseEntity<List<PizzaOrder>> fetchAllPizzaOrder() {
		
		List<PizzaOrder> pizzaOrders = pizzaOrderService.fetchAllPizzaOrder();
		if(pizzaOrders == null) {
			return ResponseEntity.notFound().build();
		} else {
			return ResponseEntity.ok().body(pizzaOrders);
		}
	}

}
