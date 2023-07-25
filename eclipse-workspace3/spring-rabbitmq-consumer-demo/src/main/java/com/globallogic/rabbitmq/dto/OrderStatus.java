package com.globallogic.rabbitmq.dto;



public class OrderStatus {

	private Order order;
	private String status;
	private String message;
	public OrderStatus(Order order, String status, String message) {
		super();
		this.order = order;
		this.status = status;
		this.message = message;
	}
	public OrderStatus() {
		super();
	}
	@Override
	public String toString() {
		return "OrderStatus [order=" + order + ", status=" + status + ", message=" + message + "]";
	}
	
}
