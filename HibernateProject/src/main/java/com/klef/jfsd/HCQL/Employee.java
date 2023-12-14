package com.klef.jfsd.HCQL;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Employee {
	@Id
	int id;
	String name;
	Boolean promotion;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Boolean getPromotion() {
		return promotion;
	}
	public void setPromotion(Boolean promotion) {
		this.promotion = promotion;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", promotion=" + promotion + "]";
	}
}
