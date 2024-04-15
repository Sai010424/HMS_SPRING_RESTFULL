package com.dxc.hms.service;
import java.util.List;

import com.dxc.hms.entity.AdminInfo;
public interface IadminService {

		
		public AdminInfo  addAdmininfo(AdminInfo admin);
		
		
		public AdminInfo  updateAdmininfo(AdminInfo admin);
		
		
		public AdminInfo  getAdmininfo(int id);
		
		public void  deleteAdmininfo(int id);
		
		public List<AdminInfo>  getAllAdmininfo();
		
		
		



		
		
	}

