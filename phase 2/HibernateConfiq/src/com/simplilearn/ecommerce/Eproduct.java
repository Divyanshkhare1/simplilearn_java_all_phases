package com.simplilearn.ecommerce;

import java.math.BigDecimal;
import java.util.Date;

public class Eproduct {

	private long id;
	private String name;
	private BigDecimal price;
	private Date dop;
	
	public Eproduct() {
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public Date getDop() {
		return dop;
	}

	public void setDop(Date dop) {
		this.dop = dop;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", dop=" + dop + "]";
	}



}



