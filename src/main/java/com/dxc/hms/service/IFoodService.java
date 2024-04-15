package com.dxc.hms.service;

import java.util.List;

import com.dxc.hms.entity.FoodInfo;


public interface IFoodService {
		
		public FoodInfo  addFood(FoodInfo food);
		
		
		public FoodInfo  updateFood(FoodInfo food);
		
		
		public FoodInfo  getFood(int id);
		
		public void  deleteFoodItem(int id);
		
		public List<FoodInfo>  getAllFoodItems();
		
		
		



		
		
	}

