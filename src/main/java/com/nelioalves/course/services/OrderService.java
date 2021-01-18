package com.nelioalves.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nelioalves.course.entities.Order;
import com.nelioalves.course.repositories.OrderRepository;


@Service
public class OrderService {
	
	
	@Autowired
	private OrderRepository orderRepository;
	
	public List<Order> finAll(){
		return orderRepository.findAll();
	}
	
	public Order findById(Long id) {
		Optional<Order> obj = orderRepository.findById(id);
		return obj.get(); 
	}

}
