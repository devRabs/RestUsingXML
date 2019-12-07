package com.rest.controller;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "parent")
@XmlType(propOrder = { "name", "id","child","anotherchild"})
public class Parent {

	private String id;
	private String name;
	private Child child;
	private AnotherChild anotherchild;

	@XmlElement(name = "id")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@XmlElement(name = "name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@XmlElement(name = "child")
	public Child getChild() {
		return child;
	}

	public void setChild(Child child) {
		this.child = child;
	}

	@XmlElement(name = "anotherchild")
	public AnotherChild getAnotherchild() {
		return anotherchild;
	}

	public void setAnotherchild(AnotherChild anotherchild) {
		this.anotherchild = anotherchild;
	}


	

	
}
