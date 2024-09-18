package com.iiht.rabbitmq.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class PurchaseOrder {

	
	private String orderId;
	private String Company;
	private int qty;
	private double price;
	
}
