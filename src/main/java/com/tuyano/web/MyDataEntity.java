package com.tuyano.web;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class MyDataEntity {

	@Id
	@GeneratedValue
	private Integer id;
	private String name;
	private String mail;

	public MyDataEntity() {
		super();
	}

	public MyDataEntity(String name, String mail) {
		this.name = name;
		this.mail = mail;
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}


	@Override
	public String toString() {
		return "[name=" + name + ", mail=" + mail + "]";
	}
}
