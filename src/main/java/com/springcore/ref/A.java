package com.springcore.ref;

public class A {
	private int x;
	private B oB;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public B getoB() {
		return oB;
	}
	public void setoB(B oB) {
		this.oB = oB;
	}
	public A() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "A [x=" + x + ", oB=" + oB + "]";
	}
}
