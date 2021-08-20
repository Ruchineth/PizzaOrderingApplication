package com.ruchineth.ProcessingService.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ruchineth.ProcessingService.model.PizzaOrder;

@Service
public interface PizzaProcessService {
	
	List<PizzaOrder> process(List<PizzaOrder> orders);

}
