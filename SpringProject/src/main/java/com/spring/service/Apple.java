package com.spring.service;

import org.springframework.stereotype.Service;

@Service("fruit")
public class Apple implements Fruit {

	@Override
	public String fruitType() {

		return "An apple in a day keeps the doctor away";
	}

}
