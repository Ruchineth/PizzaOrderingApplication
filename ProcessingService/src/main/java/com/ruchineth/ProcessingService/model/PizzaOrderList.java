package com.ruchineth.ProcessingService.model;

import java.util.ArrayList;
import java.util.List;

public class PizzaOrderList {
	
	private List<PizzaOrder> pizzaOrders;
	
	public PizzaOrderList() {
		pizzaOrders = new ArrayList<>();
	}

	public List<PizzaOrder> getPizzaOrders() {
		return pizzaOrders;
	}

	public void setPizzaOrders(List<PizzaOrder> pizzaOrders) {
		this.pizzaOrders = pizzaOrders;
	}
	
	

}
