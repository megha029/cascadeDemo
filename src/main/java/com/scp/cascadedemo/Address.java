package com.scp.cascadedemo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ADDRESS_19")
public class Address {

	@Id
	//@GeneratedValue(strategy= GenerationType.AUTO)

   private long id;
	
	@Column(name = "CITY")
	private String city;

	@Column(name = "COUNTRY")
	private String country;

	@Column(name = "PIN")
	private int pin;


	
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}
	
	
	

	

	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	

	@Override
	public String toString() {
		return "Address [id=" + id + ", city=" + city + ", country=" + country + ", pin=" + pin + "]";
	}

	public Address(long id, String city, String country, int pin) {
		super();
		this.id = id;
		this.city = city;
		this.country = country;
		this.pin = pin;
	}


}