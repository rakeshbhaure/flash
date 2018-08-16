package com.spring.service;

import org.springframework.stereotype.Component;

@Component("mango")
public class Mango implements Fruit {

	@Override
	public String fruitType() {
		// TODO Auto-generated method stub
		return "Mango is the king of the fruits";
	}

}
