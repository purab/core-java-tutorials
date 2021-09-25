package com.pkdemoone.pkdemo;

import javax.persistence.Cacheable;
import javax.persistence.Embeddable;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Embeddable
public class AlienName {
	
	private String fname;
	private String lname;
	private String mname;
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getMname() {
		return mname;
	}
	@Override
	public String toString() {
		return "AlienName [fname=" + fname + ", lname=" + lname + ", mname=" + mname + "]";
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	

}
