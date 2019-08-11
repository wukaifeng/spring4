package com.banksteel.cycle;

public class BeanCycle {

	private String name;
	
	public BeanCycle() {
		System.out.println("构造方法。。。。。。。。");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	public void init() {
		System.out.println("init........");
	}
	
	public void destroy() {
		System.out.println("destroy.......");
	}

	@Override
	public String toString() {
		return "BeanCycle [name=" + name + "]";
	}
	
	
}
