package com.wipro.SpringWebFluxAssignment.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;


@Table("Train_table")
public class Train {
    @Id
    private Long id;
    private String name;
    private String email;
    private double tprice;
  
	public double gettPrice() {
		return tprice;
	}
	public void settPrice(double tprice) {
		this.tprice = tprice;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}



    
    
}