package com.ruchineth.OrderingService.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ruchineth.OrderingService.model.PizzaOrder;

public interface PizzaOrderRepository extends JpaRepository<PizzaOrder,Integer>{

}
