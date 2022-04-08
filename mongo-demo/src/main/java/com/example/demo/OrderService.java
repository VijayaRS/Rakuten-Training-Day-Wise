package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
	@Autowired
	OrderRepository orderRepository;

	void save(Order order) {
		orderRepository.save(order);
		System.out.println("save() called");
	}

//	public List<Order> getAllOrders() {
//		return orders;
//	}
}
