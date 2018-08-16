package com.spring.service;

import org.springframework.stereotype.Component;

@Component("jack")
public class JackFruit implements Fruit {

	@Override
	public String fruitType() {
		// TODO Auto-generated method stub
		return "iam a big fruit";
	}

}
