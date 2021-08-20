package com.ruchineth.ProcessingService.model;

import javax.persistence.Entity;

@Entity
public class PizzaOrder {
	
	private int orderId;
	private String pizzaType;
	private int pizzaCount;
	private String contactNumber;
	private String diliveryLocation;
	public PizzaOrder() {
		super();
	}
	public PizzaOrder(int orderId, String pizzaType, int pizzaCount, String contactNumber, String diliveryLocation) {
		super();
		this.orderId = orderId;
		this.pizzaType = pizzaType;
		this.pizzaCount = pizzaCount;
		this.contactNumber = contactNumber;
		this.diliveryLocation = diliveryLocation;
	}
	
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getPizzaType() {
		return pizzaType;
	}
	public void setPizzaType(String pizzaType) {
		this.pizzaType = pizzaType;
	}
	public int getPizzaCount() {
		return pizzaCount;
	}
	public void setPizzaCount(int pizzaCount) {
		this.pizzaCount = pizzaCount;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getDiliveryLocation() {
		return diliveryLocation;
	}
	public void setDiliveryLocation(String diliveryLocation) {
		this.diliveryLocation = diliveryLocation;
	}
	
	

}

