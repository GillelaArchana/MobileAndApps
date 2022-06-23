package com.hexaware.jpa.moblieapps.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.jpa.moblieapps.entity.Mobile;
import com.hexaware.jpa.moblieapps.repository.MobileRepository;

@Service
public class MobileService {
	@Autowired
	MobileRepository mobileRepo;
	
	public List<Mobile> findAll() {
		return mobileRepo.findAll();
	}

	public Mobile findByName(String mobileName) {
		return mobileRepo.findByMobileName(mobileName);
	}
}
