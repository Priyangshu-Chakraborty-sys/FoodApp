package com.priyangshu.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.priyangshu.model.Order;
import com.priyangshu.repository.OrderRepository;
@Service
public class OrderService {
	@Autowired
	private OrderRepository orepo;
	public void addData(Order r) {
		orepo.save(r);
	}
	public List getBilling()
	{
		return orepo.getbills();
	}
}