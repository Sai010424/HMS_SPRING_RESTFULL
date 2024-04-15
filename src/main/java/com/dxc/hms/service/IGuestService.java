package com.dxc.hms.service;

import java.util.List;

import com.dxc.hms.entity.GuestInfo;
import com.dxc.hms.entity.Room;


public interface IGuestService {
		
		public GuestInfo  addGuestInfo(GuestInfo Guest);
		
		
		public GuestInfo  updateGuestInfo(GuestInfo guest);
		
		
		public GuestInfo  getGuestinfo(int id);
		
		public void  deleteGuestInfo(int id);
		
		public List<GuestInfo>  getAllguestinfo();
		
		
		



		
		
	}

