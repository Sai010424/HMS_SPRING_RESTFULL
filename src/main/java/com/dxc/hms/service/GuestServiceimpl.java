package com.dxc.hms.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.hms.entity.GuestInfo;
import com.dxc.hms.repository.IGuestinfoRepository;


@Service
public class GuestServiceimpl implements IGuestService{

	
	@Autowired
	IGuestinfoRepository repo;
	
	@Autowired
	GuestInfo emptyguest;
	
	
	@Override
	public GuestInfo addGuestInfo(GuestInfo guest) {
		// TODO Auto-generated method stub
		return repo.save(guest);
	}
	
	@Override
	public GuestInfo updateGuestInfo(GuestInfo guest) {
		// TODO Auto-generated method stub
		return repo.save(guest);
	}

	@Override
	public GuestInfo getGuestinfo(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id).orElse(emptyguest);
	}


	@Override
	public void deleteGuestInfo(int id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}

	@Override
	public List<GuestInfo> getAllguestinfo() {
		// TODO Auto-generated method stub
		return  repo.findAll();
	}

}
