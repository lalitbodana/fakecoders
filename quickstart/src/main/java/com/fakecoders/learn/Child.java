package com.fakecoders.learn;

public class Child extends Parent{
	
	
	
	public Child() {
		super();
		System.out.println("Child defualt");
	}

	public Child(String name) {
		super(name);
		System.out.println("Child "+name);
	}

	public void methodTwo() {
		System.out.println("Child");
	}
	
}
