package com.dxc.hms.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.hms.entity.FoodInfo;
import com.dxc.hms.repository.IFoodRepository;


@Service
public class FoodServiceImpl implements IFoodService {

	@Autowired
	IFoodRepository repo;
	
	@Autowired
	FoodInfo emptyfood;

	@Override
	public FoodInfo addFood(FoodInfo food) {
		// TODO Auto-generated method stub
		return repo.save(food);
	}

	@Override
	public FoodInfo updateFood(FoodInfo food) {
		// TODO Auto-generated method stub
		return repo.save(food);
	}

	@Override
	public void deleteFoodItem(int id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
		
	}

	@Override
	public List<FoodInfo> getAllFoodItems() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public FoodInfo getFood(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id).orElse(emptyfood);
	}

	
	}