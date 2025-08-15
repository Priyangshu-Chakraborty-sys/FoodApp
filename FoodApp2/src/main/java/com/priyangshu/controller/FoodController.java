package com.priyangshu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.priyangshu.model.Food;
import com.priyangshu.service.FoodService;

@RestController
@RequestMapping("/food")
@CrossOrigin(origins="http://localhost:3000/")
public class FoodController {
	@Autowired
private FoodService fservice;
	@PostMapping("/add")
	public ResponseEntity<String> addData(@RequestBody Food f)
	{
		String msg="DATA INSERTED ";
		fservice.addData(f);
		return new ResponseEntity<String>(msg, HttpStatus.CREATED);
	}
	@GetMapping("/fetch")
	public ResponseEntity<List<Food>> getData()
	{
		List<Food> flist=fservice.getData();
	    return new ResponseEntity<List<Food>>(flist,HttpStatus.OK);	
	}
	@GetMapping("/fetch/{fid}")
	public ResponseEntity<Food> getFidDetails(@PathVariable String fid)
	{
		Food ps = fservice.getFidDetails(fid);
		return new ResponseEntity<Food>(ps,HttpStatus.OK);
	}

	 @DeleteMapping("/delete/{fid}")
	    public ResponseEntity<String> deleteByFid(@PathVariable String fid) {
	        fservice.deleteByFid(fid);
	        return new ResponseEntity<>("Food Item deleted successfully", HttpStatus.OK);
	   }
	  @PutMapping("/update/{fid}")
	  public ResponseEntity<String> updateData(@PathVariable String fid,@RequestBody Food fs)
	  {
		  String msg="NULL";
		  Food ft=fservice.updateData(fid, fs);
		  if(ft!=null)
		  {
			  msg="FOOD ITEM UPDATED";
		  }
		  else
		  {
			  msg="ERROR";
		  }
		  return new ResponseEntity<String>(msg,HttpStatus.OK);
		  
	  }
}
