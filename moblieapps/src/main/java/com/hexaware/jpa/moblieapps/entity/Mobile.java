package com.hexaware.jpa.moblieapps.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "mobile")
public class Mobile implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String mobileCompany;
	private String mobileName;
	
	@OneToMany(mappedBy="mobile", fetch = FetchType.LAZY)
	private List<App> apps;
	
	public Mobile() {
		
	}
	
	public Mobile(String mobileCompany, String mobileName, List<App> apps) {
		super();
		this.mobileCompany = mobileCompany;
		this.mobileName = mobileName;
		this.apps = apps;
	}

	public String getMobileCompany() {
		return mobileCompany;
	}

	public void setMobileCompany(String mobileCompany) {
		this.mobileCompany = mobileCompany;
	}

	public String getMobileName() {
		return mobileName;
	}

	public void setMobileName(String mobileName) {
		this.mobileName = mobileName;
	}

	public List<App> getApps() {
		return apps;
	}

	public void setApps(List<App> apps) {
		this.apps = apps;
	}
	
	@Override
	public String toString() {
		return "Mobile [id=" + id + ", mobileCompany=" + mobileCompany + ", mobileName=" + mobileName + ", apps=" + apps
				+ "]";
	}
}
