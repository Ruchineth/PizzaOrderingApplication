package com.ruchineth.OrderingService.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ruchineth.OrderingService.model.PizzaOrder;
import com.ruchineth.OrderingService.repository.PizzaOrderRepository;

@Service
public class PizzaOrderServiceImp implements PizzaOrderService {
	
	@Autowired
	PizzaOrderRepository pizzaOrderRepository;

	@Override
	public PizzaOrder save(PizzaOrder order) {
		if(validateOrder(order)) {
			return pizzaOrderRepository.save(order);
		}else {
			return null;
		}
	}

	@Override
	public List<PizzaOrder> fetchAllPizzaOrder() {
		
		return pizzaOrderRepository.findAll();
	}


	private boolean validateOrder(PizzaOrder order) {
		boolean isvalidate = true;
		//In here we can add validation of the pizza order
		//If order is valid return true
		//If order is invalid return false
		return isvalidate;
	}

}
