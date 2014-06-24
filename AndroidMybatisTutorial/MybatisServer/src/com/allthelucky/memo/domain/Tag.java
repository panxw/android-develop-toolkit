package com.allthelucky.memo.domain;

import java.io.Serializable;

public class Tag implements Serializable {
	private static final long serialVersionUID = 786520047694780819L;
	private int id;
	private String name;

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

}