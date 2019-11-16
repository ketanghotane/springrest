package com.lti.model;

import org.springframework.stereotype.Component;

@Component
public class Address {
	
	private String city,street,pin;

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(String city, String street, String pin) {
		super();
		this.city = city;
		this.street = street;
		this.pin = pin;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", street=" + street + ", pin=" + pin + "]";
	}
	
	

}
