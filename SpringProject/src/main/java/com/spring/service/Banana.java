package com.spring.service;

import org.springframework.stereotype.Component;

@Component("banana")
public class Banana implements Fruit{

	@Override
	public String fruitType() {
		return "Banana is a healthy fruit";
	}

}
