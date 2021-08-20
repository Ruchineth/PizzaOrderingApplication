package com.ruchineth.ProcessingService.service;

import java.util.ArrayList;
import java.util.List;

import com.ruchineth.ProcessingService.model.PizzaOrder;

public class PizzaProcessServiceImpl implements PizzaProcessService {

	@Override
	public List<PizzaOrder> process(List<PizzaOrder> orders) {
		List<PizzaOrder> processOrder = new ArrayList<>();
		for(PizzaOrder order:orders) {
			if(processOrder(order)){
				processOrder.add(order);
			}
			
		}
		return processOrder;
	}
	
	private boolean processOrder(PizzaOrder order){
		boolean isProcess = true;
		//In here doing the order processing process
		//if order is successfully process return true and otherwise return false
		
		return isProcess;
	}

}
