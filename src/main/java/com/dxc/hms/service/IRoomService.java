package com.dxc.hms.service;

import java.util.List;

import com.dxc.hms.entity.Room;

public interface IRoomService {
	
	
	
	public Room  addRoom(Room room);
	
	
	public Room  updateRoom(Room room);
	
	
	public Room  getRoom(int rid);
	
	public void  deleteRoom(int rid);
	
	public List<Room>  getAllRooms();
	
	
	



	
	
}
