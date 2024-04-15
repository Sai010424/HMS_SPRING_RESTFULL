package com.dxc.hms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.hms.entity.AdminInfo;
import com.dxc.hms.entity.FoodInfo;
import com.dxc.hms.repository.IAdminRepository;

@Service
	
public class AdminServiceimpl implements IadminService{
	
	
	@Autowired
	IAdminRepository repo;
	
	@Autowired
	AdminInfo emptyadmin;
	

	@Override
	public AdminInfo addAdmininfo(AdminInfo admin) {
		// TODO Auto-generated method stub
		return repo.save(admin);
	}

	@Override
	public AdminInfo updateAdmininfo(AdminInfo admin) {
		// TODO Auto-generated method stub
		return repo.save(admin);
	}

	@Override
	public AdminInfo getAdmininfo(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id).orElse(emptyadmin);
	}

	@Override
	public void deleteAdmininfo(int id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
		
		}

	@Override
	public List<AdminInfo> getAllAdmininfo() {
		// TODO Auto-generated method stub
		return  repo.findAll();
	}

}
