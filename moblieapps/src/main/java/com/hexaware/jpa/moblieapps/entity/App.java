package com.hexaware.jpa.moblieapps.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "app")
public class App implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String appName;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "mobile_id")
	@JsonIgnore
	private Mobile mobile;

	public App(String appName, Mobile mobile) {
		super();
		this.appName = appName;
		this.mobile = mobile;
	}
	
	public App() {
		
	}

	public String getAppName() {
		return appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	public Mobile getMobile() {
		return mobile;
	}

	public void setMobile(Mobile mobile) {
		this.mobile = mobile;
	}

	@Override
	public String toString() {
		return "App [appName=" + appName + ", mobile=" + mobile + "]";
	}
	
	
}
