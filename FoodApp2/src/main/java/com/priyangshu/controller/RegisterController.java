package com.priyangshu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.priyangshu.model.Register;
import com.priyangshu.service.RegisterService;

@RestController
@RequestMapping("/register")
@CrossOrigin(origins = "http://localhost:3000/")
public class RegisterController {
	@Autowired
	public RegisterService rservice;
	@PostMapping("/add")
	public ResponseEntity<String> addData(@RequestBody Register r){
		String msg="REGISTRATION SUCCESSFUL";
		rservice.addData(r);
		return new ResponseEntity<String>(msg,HttpStatus.CREATED);
	}
	@GetMapping("/fetch")
	public ResponseEntity<List<Register>> getData()
	{
		List<Register> rList=rservice.getData();
		return new ResponseEntity<List<Register>>(rList, HttpStatus.OK);
	}
	@GetMapping("/login/{uname}/{pass}")
	public ResponseEntity<String> checkLogin(@PathVariable String uname,@PathVariable String pass)
	{
		Register r =rservice.checkLogin(uname, pass);
		String msg=null;
		if(r!=null)
		{
			msg="LOGIN SUCCESSFUL";
		}
		else
		{
			msg="WRONG LOGIN!!!";
		}
		return new ResponseEntity<String>(msg,HttpStatus.OK);
	}
	
}