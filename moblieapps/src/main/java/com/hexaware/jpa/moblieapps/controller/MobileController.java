package com.hexaware.jpa.moblieapps.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.jpa.moblieapps.entity.Mobile;
import com.hexaware.jpa.moblieapps.service.MobileService;

@RestController
public class MobileController {
	
	@Autowired
	MobileService mobileService;
	
	@GetMapping("/mobiles")
	@ResponseBody
	public List<Mobile> getAllMobiles() {
		List<Mobile> mobiles = mobileService.findAll();
		
		return mobiles;				
	}
	
	@GetMapping("/mobiles/{name}")
	@ResponseBody
	public Mobile getMobile(@PathVariable("name") String mobileName) {
		return mobileService.findByName(mobileName);
	}
}
