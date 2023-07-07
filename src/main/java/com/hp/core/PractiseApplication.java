package com.hp.core;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.hp.core.couple.Person;
import com.hp.core.scope.Pepsi;
import com.hp.core.scope.Soda;
import com.hp.core.scope.Student;
import com.hp.core.scope.Subject;

@SpringBootApplication
@ComponentScan(basePackages = {"com.hp.core.couple","test","com.hp.core.config","com.hp.core.scope","com.hp.core.lifecycle"})
public class PractiseApplication {

	//private static Person bean;

	public static void main(String[] args) {
		
		//Animal animal = new Dog(); //loose coupling Example
//		Animal animal = new Test();
//		Person p = new Person(animal);
//		p.playwithAnimal();
		
		ApplicationContext context = SpringApplication.run(PractiseApplication.class, args);
//		bean = context.getBean(Person.class);
//		bean.playwithAnimal();
		
//	Pepsi pepsi = context.getBean(Pepsi.class);
//	System.out.println(pepsi);
	// bean.drink();
	
//	Soda soda = pepsi.getSoda();
//	System.out.println("Soda");
//	
//	 Pepsi pepsi1 = context.getBean(Pepsi.class);
//	 System.out.println(pepsi1);
//	 Soda soda1 = pepsi1.getSoda();
//	 System.out.print(soda1);
//	
//	 
//	 Pepsi pepsi2 = context.getBean(Pepsi.class);
//	 System.out.println(pepsi2);
//	 Soda soda2 = pepsi2.getSoda();
//	 System.out.print(soda2);
	
//	Student student = context.getBean(Student.class);
//	System.out.println(student);
//	Subject subject = student.getSubject();
//	System.out.println(subject);
//	
//	
//	Student student1 = context.getBean(Student.class);
//	System.out.println(student1);
//	Subject subject1 = student1.getSubject();
//	System.out.println(subject1);
//	
//	Student student2 = context.getBean(Student.class);
//	System.out.println(student2);
//	Subject subject2 = student2.getSubject();
//	System.out.println(subject2);
	
	}
	
}