package com.dxc.hms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.hms.entity.Room;
import com.dxc.hms.repository.IRoomRepository;


@Service
public class RoomServiceImpl implements IRoomService {

	@Autowired
	IRoomRepository repo;
	
	@Autowired
	Room emptyroom;
	
	@Override
	public Room addRoom(Room room) {
		// TODO Auto-generated method stub
		return repo.save(room);
		
	}

	@Override
	public Room updateRoom(Room room) {
		// TODO Auto-generated method stub
		return repo.save(room);
	}

	@Override
	public Room getRoom(int rid) {
		// TODO Auto-generated method stub
		return repo.findById(rid).orElse(emptyroom);
	}

	@Override
	public void deleteRoom(int rid) {
		// TODO Auto-generated method stub
		repo.deleteById(rid);
		
	}

	@Override
	public List<Room> getAllRooms() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	
		
	
	
	
	

}
