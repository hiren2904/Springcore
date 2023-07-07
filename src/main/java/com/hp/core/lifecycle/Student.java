package com.hp.core.lifecycle;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component("student5")
public class Student {

	public Student() {
		System.out.println(" # Student constructo Created");
	}
	@PostConstruct
	public void created() {
		//Some initialization
		System.out.println(" # Student bean Created");
	}
	@PreDestroy
	public void preDestroy() {
		System.out.println("## ok bye student bean destroy()");
	}
}
