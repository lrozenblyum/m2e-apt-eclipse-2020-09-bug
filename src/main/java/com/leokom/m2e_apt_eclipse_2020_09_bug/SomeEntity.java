package com.leokom.m2e_apt_eclipse_2020_09_bug;

import javax.persistence.*;

@Entity
@Table(name="some_table")
public class SomeEntity {
	@Column(name = "name", nullable=false)
	private String name;

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
}
