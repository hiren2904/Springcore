package test;

import org.springframework.stereotype.Component;

import com.hp.core.couple.Animal;


@Component
public class Test implements Animal{

	public void testing() {
		System.out.println("This is from diff test package");
	}

	@Override
	public void play() {
		System.out.println("Now Test is Playing ");
		
	}
}
