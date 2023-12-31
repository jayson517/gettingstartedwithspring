package com.example.gettingstartedwithspring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


record Person(String fname, int age) {};

record Address(String address, String city) {};

@Configuration
public class HelloWorldConfiguration {

	@Bean
	public String name() {
		return "Jayson";
	}
	
	@Bean
	public Person person() {
		return new Person("Jayson", 20);
	}
	
	@Bean
	public int age() {
		return 16;
	}
	
	public Person person2MethodCall() {
		return new Person(name(), age(), Address());
		
	}
	
	@Bean
	public Address address() {
		return new Address("santo", "thomas");
	}
	
	
}
