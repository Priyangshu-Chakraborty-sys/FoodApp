package com.priyangshu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.priyangshu.model.Food;
import com.priyangshu.repository.FoodRepository;

@Service
public class FoodService {
	@Autowired
private FoodRepository frepo;
	public void addData(Food f)
	{
		frepo.save(f);
	}
	public List<Food> getData()
	{
		return frepo.findAll();	
	}
	public Food getFidDetails(String fid)
    {
    	return frepo.findById(fid).orElse(null);
    	
    }

	 public void deleteByFid(String fid) {
	    	Food fs  = frepo.findById(fid).orElse(null);
	    	if(fs!=null)
	    	{
	        frepo.delete(fs);
	    	}
	    }
	    public Food updateData(String fid, Food pst)
	    {
	    	Food fs =  frepo.findById(fid).orElse(null);
	    	if(fs!=null)
	    	{
	    		fs.setFname(pst.getFname());
	    		fs.setPrice(pst.getPrice());
	    		frepo.save(fs);
	    	}
	    	return fs;
	    }
}
