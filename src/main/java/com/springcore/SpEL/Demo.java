package com.springcore.SpEL;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
	//Variable
	@Value("#{ 22+22+2222 }")
	private int x;
	@Value("#{ 22+22*2222 }")
	private int y;
	
	//Method
	@Value("#{ T(java.lang.Math).sqrt(48) }")
	private double z;
	
	//Static variable
	
	@Value("#{ T(java.lang.Math).PI }")
	private double E;
	
	@Value("#{ new java.lang.String('Rajdip Pal')}")
	private String name; 
	
	@Value("#{ 26 > 9 }")
	private boolean isActive;
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public double getZ() {
		return z;
	}
	public void setZ(double z) {
		this.z = z;
	}
	
	public double getE() {
		return E;
	}
	public void setE(double e) {
		E = e;
	}
	
	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", z=" + z + ", E=" + E + ", name=" + name + ", isActive=" + isActive
				+ "]";
	}
}
