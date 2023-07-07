package com.hp.core.config;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.hp.core.couple.Samosa;

@Component
public class MyConfig {

	@Bean(name="samosa1")
	//@Primary
	public Samosa getSamosa1() {
		return new Samosa("Tandoori Samosa");
	}
	@Bean(name="samosa2")
	public Samosa getSamosa2() {
		return new Samosa("Metha samosa");
	}
}
