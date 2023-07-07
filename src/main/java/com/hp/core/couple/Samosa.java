package com.hp.core.couple;


public class Samosa {
	
	String name;

	public Samosa (String name) {
		System.out.println("This is"+name);
		this.name=name;
	} 
	
	
	public void eat() {
		System.out.println("Samosa is very delicious");
		System.out.println(name);
	}
}
