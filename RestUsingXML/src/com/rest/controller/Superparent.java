package com.rest.controller;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "superparent")
@XmlType(propOrder = { "parent","products"})
public class Superparent {

	private Parent parent;
	private Products products;
	
	@XmlElement(name="parent")
	public Parent getParent() {
		return parent;
	}

	public void setParent(Parent parent) {
		this.parent = parent;
	}

	@XmlElement(name="products")
	public Products getProducts() {
		return products;
	}

	public void setProducts(Products products) {
		this.products = products;
	}
	
	
	
}
