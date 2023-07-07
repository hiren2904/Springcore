package com.hp.core.couple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.hp.core.scope.Pepsi;

@Component
public class Person {
	
	@Autowired
	Animal animal;
	@Autowired
	Admin admin;
	@Autowired
	@Qualifier("samosa2")
	Samosa samosa;
	@Autowired
	Pepsi pepsi;
	
	public Person(Animal animal,Admin admin,Pepsi pepsi) {
		System.out.println("Constructor calling");
		this.animal = animal;
		this.admin = admin;
		this.pepsi = pepsi;
		
	}
	public void playwithAnimal() {
		animal.play();
		admin.detailsAdmin();
		samosa.eat();
		pepsi.drink();
	}

}
