package com.springcore.auto.wire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {
	private Address address;

	public Address getAddress() {
		return address;
	}
	
	//Qualifier specifies the name of the bean in case of multiple bean of same type
	
	@Qualifier("address123")
	@Autowired
	public void setAddress(Address address) {
		System.out.println("Inside setter");
		this.address = address;
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Emp(Address address) {
		super();
		this.address = address;
		System.out.println("Inside Emp constructor");
	}

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}
}
