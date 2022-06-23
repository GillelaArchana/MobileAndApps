package com.hexaware.jpa.moblieapps.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.hexaware.jpa.moblieapps.entity.Mobile;

@Repository
public interface MobileRepository extends CrudRepository<Mobile, Integer>{
	public List<Mobile> findAll();
	
	@Query("select m from Mobile m where m.mobileName = :mobileName")
	public Mobile findByMobileName(@Param("mobileName") String mobileName);
}
