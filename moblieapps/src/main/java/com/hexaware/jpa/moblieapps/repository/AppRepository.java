package com.hexaware.jpa.moblieapps.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hexaware.jpa.moblieapps.entity.App;

@Repository
public interface AppRepository extends CrudRepository<App, Integer>{

}
