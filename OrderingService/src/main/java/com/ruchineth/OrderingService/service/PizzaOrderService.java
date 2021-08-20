package com.ruchineth.OrderingService.service;

import java.util.List;

import com.ruchineth.OrderingService.model.PizzaOrder;

public interface PizzaOrderService {
	
	PizzaOrder save(PizzaOrder order);
	
	List<PizzaOrder> fetchAllPizzaOrder();

}
