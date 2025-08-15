package com.priyangshu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.priyangshu.model.Order;
import com.priyangshu.service.OrderService;

@RestController
@RequestMapping("/order")
@CrossOrigin(origins = "http://localhost:3000/")
public class OrderController {
   @Autowired
private OrderService oservice;
   @PostMapping("/add")
    public ResponseEntity<String> addData(@RequestBody Order e)
    {
    	String msg="FOOD ORDER SUCCESFUL";
    	oservice.addData(e);
    	return new ResponseEntity<String>(msg,HttpStatus.CREATED);
    }
   @GetMapping("/billing")
   public ResponseEntity<List> getData()
   {
	   List blist=oservice.getBilling();
	   return new ResponseEntity<List>(blist,HttpStatus.OK);
   }
}
