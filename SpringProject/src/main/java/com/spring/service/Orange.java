package com.spring.service;

import org.springframework.stereotype.Component;

@Component
public class Orange implements Fruit {

	@Override
	public String fruitType() {
		return "orange is a citrus fruit";
	}

}
