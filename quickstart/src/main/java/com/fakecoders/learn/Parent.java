package com.fakecoders.learn;

public class Parent {
	private Integer parentId;
	private String parentName;
	
	
	
	public Parent() {
		super();
		System.out.println("parent default");
	}
	
	public Parent(String name) {
		super();
		System.out.println("parent "+name);
	}



	public void methodOne() {
		System.out.println("parent");
	};
}
