package com.pkdemoone.pkdemo;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name="alien_table")
@Cacheable
@Cache(usage=CacheConcurrencyStrategy.READ_ONLY)
public class Alien // POJO
{
	@Id //Primary Key declation
	private int aid;
	
	
	
	private AlienName aname;
	
	
	public void setAname(AlienName aname) {
		this.aname = aname;
	}

	@Column(name="alien_color")
	private String color;
	
	
	public int getAid() {
		return aid;
	}
	
	public void setAid(int aid) {
		this.aid = aid;
	}
	
	public AlienName getAname() {
		return aname;
	}

	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Alien [aid=" + aid + ", aname=" + aname + ", color=" + color + "]";
	}
	
	
	

}
